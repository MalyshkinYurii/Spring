package homework1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext classContext = new AnnotationConfigApplicationContext(Config.class);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        classContext.getBean(Games.class).setHours(100);
        classContext.getBean(Games.class).setLike(true);
        System.out.println(classContext.getBean(Games.class));
        System.out.println(applicationContext.getBean("CSGO"));

    }
}
