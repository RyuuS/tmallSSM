import cn.tm.pojo.Category;
import cn.tm.mapper.CategoryMapper;
public class InsertTest {
    CategoryMapper categoryMapper;
    public static void main(String[] args) {
        new InsertTest().test();
    }
    public void test() {
        Category category = new Category();
        category.setName("分类1");
        categoryMapper.insert(category);
    }
}
