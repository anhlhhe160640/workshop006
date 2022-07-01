package Function;

import Validation.inputValidation;
import Function.*;

public class Menu {
    public static boolean isExiting = false;

    public static void Menushow() {
        System.out.println("1. Add a new student");
        System.out.println("2. Search a student based on his/her code");
        System.out.println("3. Update name and mark of a student based on his/her code");
        System.out.println("4. Remove a student based on his/her code");
        System.out.println("5. Show all students");
        System.out.println("6. Exit");
        System.out.println("================================================");
    }

    public static int getChoice() {
        return inputValidation.Int();
    }

    public static void run(int Choice) {
        menuFunction menu = new menuFunction();

        switch (Choice) {
            case 1:
                menu.addMoreStudent();
                break;
            case 2:
                menu.searchStudentbycode();
                break;
            case 3:
                menu.updateStudent();
                break;
            case 4:
                menu.removeStudentbyCode();
                break;
            case 5:
                menu.showAllStudent();
                break;
            case 6:
                isExiting = true;
                break;
        }
        System.out.println("Press any key to continue...");
        inputValidation.String();
    }
}
