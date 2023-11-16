package two;

public class Student extends Person{
    private String parentNumber;
    private String schoolNumber;
    private Phone phone;

    public Student() {
    }


    public Student(String parentNumber, String schoolNumber, Phone phone) {
        this.parentNumber = parentNumber;
        this.schoolNumber = schoolNumber;
        this.phone = phone;
    }

    public Student(String name, String password, String phoneNumber, String parentNumber, String schoolNumber, Phone phone) {
        super(name, password, phoneNumber);
        this.parentNumber = parentNumber;
        this.schoolNumber = schoolNumber;
        this.phone = phone;
    }

    public String getParentNumber() {
        return parentNumber;
    }

    public void setParentNumber(String parentNumber) {
        this.parentNumber = parentNumber;
    }

    public String getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(String schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void resetPassword(String oldPassword, String newPassword, String inputPhone) {
        if (oldPassword.equals(getPassword()) && inputPhone.equals(getPhoneNumber())) {
            setPassword(newPassword);
                System.out.println("" + getName() + " ning paroli muvaffaqiyatli tiklandi.");
        } else {
            System.out.println("Eski parol yoki telefon raqami yaroqsiz. Parolni tiklash amalga oshmadi.");
        }
    }

}
