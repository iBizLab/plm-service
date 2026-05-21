package cn.ibizlab.plm.user.plugin.groovy.dataentity.action;

class VersionComparator {
    static int compare(String version1, String version2) {
        // 处理空值
        if (version1 == null && version2 == null) return 0
        if (version1 == null) return -1
        if (version2 == null) return 1
        if (version1 == version2) return 0

        // 标准化版本
        def (nums1, pre1) = parseVersion(version1)
        def (nums2, pre2) = parseVersion(version2)

        // 比较数字部分
        for (int i = 0; i < 3; i++) {
            if (nums1[i] != nums2[i]) {
                return nums1[i] > nums2[i] ? 1 : -1
            }
        }

        // 比较预发布部分
        return comparePreRelease(pre1, pre2)
    }
    static boolean hasNewVersion(String currentVersion, String latestVersion) {
        return compare(latestVersion, currentVersion) > 0
    }
    private static def parseVersion(String version) {
        // 去掉v前缀，转小写
        String v = version.toLowerCase().replace('v', '')

        // 分离预发布标识
        def parts = v.split('-', 2)
        String mainPart = parts[0]
        String preRelease = parts.length > 1 ? parts[1] : null

        // 分离数字部分
        def numParts = mainPart.split('\\.')
        int major = numParts.size() > 0 ? toInt(numParts[0]) : 0
        int minor = numParts.size() > 1 ? toInt(numParts[1]) : 0
        int patch = numParts.size() > 2 ? toInt(numParts[2]) : 0

        return [[major, minor, patch], preRelease]
    }
    private static int comparePreRelease(String pre1, String pre2) {
        // 都没有预发布标识 -> 相等
        if (!pre1 && !pre2) return 0
        // 有预发布标识的 < 没有预发布标识的
        if (!pre1) return 1
        if (!pre2) return -1

        // 预发布标识优先级
        def order = [
                'dev': 0,
                'snapshot': 1,
                'alpha': 2,
                'beta': 3,
                'rc': 4,
                'release': 4
        ]

        // 提取预发布类型和编号
        def (type1, num1) = parsePreRelease(pre1)
        def (type2, num2) = parsePreRelease(pre2)

        // 获取类型优先级
        int order1 = order[type1] ?: 0
        int order2 = order[type2] ?: 0

        // 比较类型优先级
        if (order1 != order2) {
            return order1 > order2 ? 1 : -1
        }

        // 类型相同，比较编号
        int n1 = num1 ?: 0
        int n2 = num2 ?: 0

        return n1 <=> n2
    }

    private static def parsePreRelease(String preRelease) {
        if (!preRelease) return [null, null]

        // 匹配类型和数字
        def matcher = preRelease =~ /([a-z]+)(?:\.?(\d+))?/
        if (matcher.find()) {
            String type = matcher.group(1)
            Integer num = matcher.group(2) ? matcher.group(2).toInteger() : null
            return [type, num]
        }
        return [preRelease, null]
    }
    private static int toInt(String str) {
        try {
            return str.toInteger()
        } catch (e) {
            // 尝试提取数字
            def matcher = str =~ /(\d+)/
            return matcher.find() ? matcher.group(1).toInteger() : 0
        }
    }

}