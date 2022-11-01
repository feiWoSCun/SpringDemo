package Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.junit.runners.Parameterized;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.awt.*;
import java.util.ArrayList;

@RestController
public class Service {
   @RequestMapping("/hello")//@RequestMapping的作用是根据不同的请求，执行不同的业务
    public String myString(Model mode) {
    ObjectMapper mapper =new ObjectMapper();
    Animal animal=new Animal("罗彬",45,"住宿楼");
    String string;
       try {
         string = mapper.writeValueAsString(animal);
       } catch (JsonProcessingException e) {
           throw new RuntimeException(e);
       }
       return string;
        //return的返回值由org.springframework.web.servlet.view.InternalResourceViewResolver
        // 来拼接好转到对应的jsp页面

   }
}
