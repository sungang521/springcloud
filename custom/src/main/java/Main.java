import com.sungang.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("sungang.xml");
        User user1 = (User)applicationContext.getBean("user");
        User user2 = (User)applicationContext.getBean("user");
        System.out.println(user1 == user2);


    }



}
