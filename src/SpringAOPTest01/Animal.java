package SpringAOPTest01;

import org.springframework.stereotype.Component;

@Component
public class Animal {
   int fly(){
        System.out.println("动物在飞");
        return 1;
    }
}
