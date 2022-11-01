package SpringTest05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("CommentSpring.xml");
        context.getBean("springTest05",SpringTest05.class).service();

    }
}
