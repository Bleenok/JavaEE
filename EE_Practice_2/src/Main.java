import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        User user = (User) context.getBean("user");
        System.out.println(user.toString());

        Doctors doctors = (Doctors) context.getBean("doctors");
        System.out.println(doctors.toString());

        CollectionDocs collectionDocs = (CollectionDocs) context.getBean("collection");
        System.out.println(collectionDocs.toString());
    }
}