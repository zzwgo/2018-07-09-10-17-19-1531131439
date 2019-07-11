package practice06;

public class Teacher extends Person {
    private int klass;

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return klass!=0?super.introduce()+" I am a Teacher. I teach Class " + getKlass() + ".":super.introduce()+" I am a Teacher. I teach No Class.";
    }
}
