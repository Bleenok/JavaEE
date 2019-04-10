import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        G580 blade = (G580) applicationContext.getBean("blade");
        System.out.println(blade.getInfo() + "\n");

        K10 pro = (K10) applicationContext.getBean("pro");
        System.out.println(pro.getInfo());


    }


}