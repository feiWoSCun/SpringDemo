package SpringTest02;

public class SpringTest02 {
    String name;
    int aeg;

    public SpringTest02(String name, int aeg) {
        this.name = name;
        this.aeg = aeg;
    }

    @Override
    public String toString() {
        return "SpringTest02{" +
                "name='" + name + '\'' +
                ", aeg=" + aeg +
                '}';
    }
}
