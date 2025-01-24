
public class JuetClass {
    int age;
    String name;
    int getAge() {
        return age;
    }
    void setAge(int age) {
        this.age = age;
    }
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        JuetClass student = new JuetClass();
        student.setAge(20);
        student.setName("John Doe");
        System.out.println("Age: " + student.getAge());
        System.out.println("Name: " + student.getName());
    }
}

