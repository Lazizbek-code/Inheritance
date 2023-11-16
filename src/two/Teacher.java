package two;

public class Teacher extends Person{
    private Subject subject;
    private double salary;

    public Teacher() {
    }

    public Teacher(String name, String password, String phoneNumber, Subject subject, double salary) {
        super(name, password, phoneNumber);
        this.subject = subject;
        this.salary = salary;
    }

    public Teacher(Subject subject, double salary) {
        this.subject = subject;
        this.salary = salary;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
