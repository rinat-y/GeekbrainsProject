package theme4_OOP;

public class Employee {
    String name;
    String position;
    String email;
    long phoneNumber;
    double salary;
    int age;

    public Employee(String name, String position, String email, long phoneNumber, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        System.out.println(name + " " + age + " " + position + " "
                + email + " " + phoneNumber + " " + salary);
    }
}
