package two;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[numberOfStudents];


        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter information for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Phone: ");
            String phone = scanner.next();
            System.out.print("Password: ");
            String password = scanner.next();
            System.out.print("Parent number: ");
            String parentNumber = scanner.next();
            System.out.print("School number: ");
            String schoolNumber = scanner.next();
            System.out.println("Enter information phone: ");

            System.out.print("Phone name: ");
            String phoneName = scanner.next();

            System.out.print("Phone storage: ");
            String phoneStorage = scanner.next();

            System.out.print("Phone color: ");
            String phoneColor = scanner.next();

            Phone phoneObj = new Phone(phoneName, phoneStorage, phoneColor);

            students[i] = new Student(name,  password, phone, parentNumber, schoolNumber, phoneObj);
        }

        displayStudentInfo(students);

        System.out.print("Enter old password: ");
        String oldPassword = scanner.next();
        System.out.print("Enter new password: ");
        String newPassword = scanner.next();
        System.out.print("Enter student's phone: ");
        String inputPhone = scanner.next();

        for (Student student: students){
            student.resetPassword(oldPassword, newPassword, inputPhone);
        }


        displayStudentInfo(students);

        Phone phoneObj = new Phone("Samsung", "phoneStorage", "black");
        Student newStudent = new Student("Lazizbek", "007", "0999", "50", "85", phoneObj);
        String password = "009";
        findAndUpdatePassword(students, newStudent, password);

        displayStudentInfo(students);
    }

    public static void displayStudentInfo(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println();
            System.out.println("Information for Student " + (i + 1) + ":");
            System.out.println("Name: " + students[i].getName());
            System.out.println("Phone: " + students[i].getPhoneNumber());
            System.out.println("Password: " + students[i].getPassword());
            System.out.println("Student Phone: " + students[i].getPhone());
            System.out.println();
        }
    }

    public static void findAndUpdatePassword(Student[] students, Student newStudent, String newPassword) {
        for (Student student : students) {
            if (student.getPassword().equals(newStudent.getPassword()) &&
                    student.getName().equals(newStudent.getName()) &&
                    student.getPhoneNumber().equals(newStudent.getPhoneNumber())
            ) {
                student.setPassword(student.getPassword().equals(newStudent.getPassword()) ? newPassword : newStudent.getPassword());
                System.out.println("" + student.getName() + " ning paroli muvaffaqiyatli tiklandi.");
            }
        }
    }

}
