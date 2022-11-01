package SpringTest05;

import org.springframework.stereotype.Component;

//使用注解开发
@Component(value = "springTest05")
public class SpringTest05 {
    void service(){
        System.out.println("<------service方法执行------>");
    }
}
