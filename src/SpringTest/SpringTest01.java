package SpringTest;

public class SpringTest01 {
    private  String name;
    private int age;

    public SpringTest01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public SpringTest01() {

    }
    @Override
    public String toString() {
        return "SpringTest01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setNAME(String name) {

        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
