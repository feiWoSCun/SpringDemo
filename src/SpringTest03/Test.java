package SpringTest03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
     public void setBird(Bird bird) {
          this.bird = bird;
     }

     private Bird  bird;

     public static void main(String[] args) {
          ApplicationContext context=new ClassPathXmlApplicationContext("SpringBean01.xml");
          Object o=context.getBean("test0301",Test.class);
          System.out.println(o);
          ApplicationContext context1=new ClassPathXmlApplicationContext("SpringBean01.xml");
          Object o1=context.getBean("test0301",Test.class);
          System.out.println(o1);
     }
}
