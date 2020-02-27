package lecture.chapter7.clone;

public class Sheep implements Cloneable{

    protected String name;
    protected int age;

    public Sheep(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        Sheep clone = (Sheep)super.clone();

        clone.age = 0;

        return clone;

    }
}
