package SpringTest04;

import java.util.Arrays;

public class Animal {
    private  Cat cat[];

    public Cat[] getCat() {
        return cat;
    }

    public void setCat(Cat[] cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "cat=" + Arrays.toString(cat) +
                '}';
    }
}
