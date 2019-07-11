package practice04;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String introduce(){
        return basicIntroduce();
    }

    public String basicIntroduce(){
        return "My name is " + this.getName() + ". I am " + this.getAge() + " years old.";
    }
}
