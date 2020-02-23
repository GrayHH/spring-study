import com.hui.dao.UserDaoMySqlImpl;
import com.hui.dao.UserDaoOracleImpl;
import com.hui.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取ApplicationContext；
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //容器在手，天下我有，需要什么，就Get什么
        UserServiceImpl userServiceImpl =(UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}