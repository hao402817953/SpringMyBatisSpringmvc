import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/4/26.
 */
public class TestClass {

    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring-mybatis.xml");
        ac.getBean("sqlSessionFactory");
    }


    @Test
    public void test(){

    }

}
