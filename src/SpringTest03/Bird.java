package SpringTest03;

public class Bird implements Animal{
    public Bird(){
        fly();
    }

    @Override
    public void fly() {
        System.out.println("鸟儿在飞翔-----》");
    }
}
