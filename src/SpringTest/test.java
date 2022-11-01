package SpringTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean01.xml");
        SpringTest01 spr = context.getBean("test", SpringTest01.class);
        System.out.println(spr);

        spr.toString();
    }
}
