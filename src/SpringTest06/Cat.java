package SpringTest06;


import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller(value = "littleCat")
public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("小猫咪正在吃东西---》");
    }
}
