package Function;

import java.util.ArrayList;

import Information.Student;
import Validation.inputValidation;
import java.util.TreeSet;

public class menuFunction {
    public static ArrayList<Student> students = new ArrayList<Student>();
    public static TreeSet<Integer> listCode = new TreeSet<>();

    public void addStudent() {
        Student student = new Student();
        System.out.println("Enter the code: ");
        student.setCode(inputValidation.Int());
        if (getStudentnamebycode(student.getCode()) == null) {
            System.out.println("Enter Student Name: ");
            student.setName(inputValidation.String());
        } else {
            System.out.println("Student Name: " + getStudentnamebycode(student.getCode()));
            student.setName(getStudentnamebycode(student.getCode()));
        }
        System.out.println("Enter Student Mark: ");
        student.setMark(inputValidation.Double());
        students.add(student);
        listCode.add(student.getCode());
        System.out.println("Student added successfully!");
    }

    public void addMoreStudent() {
        System.out.println("Enter number of students you want to add: ");
        int Number = inputValidation.Int();
        for (int i = 0; i < Number; i++) {
            System.out.println("Student " + (i + 1) + ":");
            addStudent();
        }
    }

    public static String getStudentnamebycode(int Code) {
        for (Student student : students) {
            if (student.getCode() == Code) {
                return student.getName();
            }
        }
        return null;
    }

    public void searchStudentbycode() {
        System.out.println("Enter code of student you want to search: ");
        int Code = inputValidation.Int();
        ArrayList<Student> students = find(Code);
        if (students.size() == 0) {
            System.out.println("Student not found!");
        } else {
            for (Student student : students) {
                System.out.println("Found " + students.size() + "with code " + Code);
                report(students);
            }
        }
    }

    public static void updateStudent(Student student) {
        System.out.println("Update new information: ");
        System.out.println("Enter new name: ");
        student.setName(inputValidation.String());
        System.out.println("Enter new Mark: ");
        student.setMark(inputValidation.Double());
        System.out.println("Update Succesfully!");
    }

    public void updateStudentbyCode(Student student) {
        System.out.println("Enter Student Code: ");
        int Code = inputValidation.Int();
        ArrayList<Student> students = find(Code);
        if(students.size() == 0) {
            System.out.println("Not Found!");
        }
        else {
            updateStudent(student);
        }
    }
    
    public void updateStudent() {
        System.out.println("Enter Student Code: ");
        int Code = inputValidation.Int();
        ArrayList<Student> students = find(Code);
        if(students.size() == 0) {
            System.out.println("Not Found!");
        }
        else {
            updateStudent(students.get(0));
        }
    }
    
    public static void removeStudentbyCode() {
        System.out.println("Enter Student Code: ");
        int Code = inputValidation.Int();
        ArrayList<Student> students = find(Code);
        if(students.size() == 0) {
            System.out.println("Not Found!");
        }
        else {
            removeStudent(students.get(0));
        }
    }
    public static void removeStudent(Student student) {
        int code = student.getCode();
        students.remove(code);
        if(!checkCodeIsExist(code)) {
            listCode.remove(code);
        }
        System.out.println("delete Succesfully!");
    }
    
    public void displayStudent(Student student) {
        System.out.println(students);
    }
    public static boolean checkCodeIsExist(int Code) {
        for(Student student : students) {
            if(student.getCode() == Code)
            return true;
        }
        return false;
    }
    
    public static ArrayList<Student> find(int Code) {
        ArrayList<Student> students = new ArrayList<Student>();
        for (Student student : menuFunction.students) {
            if (student.getCode() == Code) {
                students.add(student);
            }
        }
        return students;
    }


    public void report(ArrayList<Student> students) {
        int index = 0;
        for (Student student : students) {
            System.out.println(index + "" + student);
            index++;
        }
    }

    public void showAllStudent() {
        for (Student student : students) {
            System.out.println(students);
        }
    }   
}
