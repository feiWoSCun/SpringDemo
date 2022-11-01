package SpringTest04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringBean01.xml");
        Animal test04 = context.getBean("test04", Animal.class);
        test04.toString();
    }
}
