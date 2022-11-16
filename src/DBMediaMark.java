/**
 * The DBMediaMark program implements an application that
 *   abstract extends by DataBaseLogin abstract class. Here we will override the methods.
 */


import java.util.Scanner;

public class DBMediaMark extends DataBaseLogin {
    /**
     * Construction to enter our parameters from DataBaseLogin Construction.
     */
    public DBMediaMark() {
        super("AGC","123");
    }

    /**
     * Override of login method which is based in DataBaseLogin abstract clas.
     * Here user can enter their username and password to login website.
     */

    @Override
    public void login() {
        System.out.println("Welcome to the MediaMark! \nHere in MediaMark we have the best quality and best price! "+"\nLasst euch nicht verarschen!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username and password to login!");
        System.out.println("Username: ");
        String userName = scanner.nextLine();
        System.out.println("Password: ");
        String passWord = scanner.nextLine();

        while(!(getUsername().equalsIgnoreCase(userName)&&getPassword().equalsIgnoreCase(passWord))){
            System.out.println("ERROR! Your username or password is incorrect!\nPlease enter once again your username and password to login!");
            System.out.println("Username: ");
            userName = scanner.nextLine();
            System.out.println("Password: ");
             passWord = scanner.nextLine();
        }

        if(getUsername().equalsIgnoreCase(userName)&&getPassword().equalsIgnoreCase(passWord)){
            System.out.println("You have entered MediaMark website successfully, enjoy your shopping!");
        }

    }


}
