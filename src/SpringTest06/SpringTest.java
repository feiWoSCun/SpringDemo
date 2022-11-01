package SpringTest06;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository(value = "my")
public class SpringTest {
    public Animal getAnimal() {
        return animal;
    }

    @Resource(name = "littleCat")
    private Animal animal;

   /* public SpringTest() {

    }*/
    public SpringTest(Animal animal) {
        this.animal = animal;
    }
}
