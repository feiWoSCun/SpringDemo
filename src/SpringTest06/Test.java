package SpringTest06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
       Object o= context.getBean("my",SpringTest.class);
     ((SpringTest) o).getAnimal().eat();
        System.out.println(Thread.currentThread().getContextClassLoader().getResource("SpringBean01.xml").getPath());
    }
}
