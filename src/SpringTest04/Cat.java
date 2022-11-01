package SpringTest04;

public class Cat {
    private String name;
    public  void eat(){
        System.out.println("Ã¨ßäÔÚ³Ô¶«Î÷-----¡·");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
}
