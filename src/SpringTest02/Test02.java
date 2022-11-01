package SpringTest02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test02 {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("SpringBean01.xml");
       Object o=context.getBean("test02",SpringTest02.class);
        SpringTest02 spr = null;
        if(o instanceof SpringTest02&&o!=null){

            spr = (SpringTest02)o;
        }
        System.out.println(spr);
        spr.toString();
    }
}
