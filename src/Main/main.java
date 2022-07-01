package Main;

import Function.*;
import Information.Student;

public class main {

    public static void main(String[] args) {
        menuFunction menu = new menuFunction();
        do {
            Menu.Menushow();
            int choice = Menu.getChoice();
            Menu.run(choice);
        } while (!Menu.isExiting);
        
    }
}
