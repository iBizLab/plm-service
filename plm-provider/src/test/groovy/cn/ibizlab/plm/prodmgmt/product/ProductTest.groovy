package cn.ibizlab.plm.prodmgmt.product

import cn.ibizlab.plm.prodmgmt.product.dto.ProductDTO
import cn.ibizlab.plm.prodmgmt.product.dto.ProductFilterDTO
import cn.ibizlab.plm.prodmgmt.productmember.ProductMember
import cn.ibizlab.plm.prodmgmt.productmember.dto.ProductMemberDTO
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.domain.Page

@SpringBootTest
class ProductTest {


    @Test
    void testGet() {
        ProductDTO dto = Product.getInstance().get("test1", true)
        if (!dto) {
            dto = Product.getInstance().create(new ProductDTO()
                    .setId("test1")
                    .setName("test1产品")
                    .setIdentifier("0000")
                    .setScopeType("organization")
                    .setVisibility("public")
                    .setMembers([
                            new ProductMemberDTO()
                                    .setUserId("demo_admin")
                                    .setName("管理员")
                                    .setRoleId("admin")
                    ]))
            println "未命中，创建新数据: ${dto}"
        } else {
            println "命中: ${dto}"
        }
    }

    @Test
    void testSave() {
        //entity() 等价于new ProductDTO()
        ProductDTO dto = Product.getInstance().entity()
                .setId("test1")
                .setName("test1产品")
                .setIdentifier("0000")
                .setScopeType("organization")
                .setVisibility("public")
                .setMembers([
                        new ProductMemberDTO()
                                .setUserId("demo_admin")
                                .setName("管理员")
                                .setRoleId("admin")
                ])
                .save() as ProductDTO
        println dto
    }


    @Test
    void testFetchDefault() {
        Page<ProductDTO> page = Product.getInstance()
                .fetchDefault(new ProductFilterDTO().sort("create_time,desc"))
        println "共${page.totalPages}页，${page.totalElements}行"
        page.content.forEach { dto ->
            println dto
        }

        // 简写方式 filter() 等价于new ProductFilterDTO()
        page = Product.getInstance().filter().sort("create_time,desc").fetch()
        page.content.each { println it }
    }
}
