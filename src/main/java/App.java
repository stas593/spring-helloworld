import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanhw1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanhw2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanc1 = (Cat) applicationContext.getBean("cat");
        Cat beanc2 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanhw1 == beanhw2);
        System.out.println(beanc1 == beanc2);
    }
}