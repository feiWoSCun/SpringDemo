package SpringAOPTest01;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
//执行顺序：环绕@Around，前置@Before，切入方法，环绕@Around，后置@after，返回@afterReturning
//并且@afterReturning拿到的返回值是上一个方法的返回值！
@Component
@Aspect
public class UserProxy {
    @Pointcut(value = "execution(* SpringAOPTest01.Animal.fly())")
    void point1() {
    }
    @Order(value = 2)
    @Before(value = "execution(* SpringAOPTest01.Animal.fly())")
  void before() {
        System.out.println("前置方法执行了01");
    }
    @Around(value = "point1()")
  void around(ProceedingJoinPoint point) {
        Object a=null;
        System.out.println("环绕方法前面执行！");
        try {
          a=point.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        int c=(Integer)a+1;
        System.out.println("环绕方法后面执行");
        System.out.println(c);
        /*return c;*/
    }
/*   @Before(value="point1()")
    @Order(value=2)
    void before02(){
        System.out.println("前置方法执行了02");
    }*/
@AfterReturning(value = "point1()",returning = "returnValue")
    int returnTest(Object returnValue){
    System.out.println(returnValue);
    return 5;
}
@After(value = "point1()")
    void after(){
    System.out.println("后置方法执行了");
}
}
