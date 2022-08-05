import org.junit.Test;
import top.mhpsy.mybatis2.mapper.deleteMore;
import top.mhpsy.mybatis2.utils.SqlSessionUtils;

public class TestDeleteMore {

    @Test
    public void TestDeleteMore1(){
        deleteMore mapper = SqlSessionUtils.getSqlSession().getMapper(deleteMore.class);
        int i = mapper.deleteMore1("7,10,11");
        System.out.println(i);
    }

}
