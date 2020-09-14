// library 
import java.util.Scanner;
import java.util.Arrays;


public class Main {
    // initializing scanner
    public static Scanner input = new Scanner(System.in);

    // MAIN
    public static void main(String[] args) {
        String userNum = "";
        int userChoice = 0;
        Encrypter encryptNum = new Encrypter();
        Decrypter decryptNum = new Decrypter();
        //initialize objects

        // user input
        userNum = getNum();
        userChoice = getChoice();
        if (userChoice == 1) {
           encryptNum.encrypt(userNum);
           System.out.println (" is "+ userNum + " encrypted ");
            
        }
        if (userChoice == 2) {
            decryptNum.decrypt(userNum);
            System.out.println (" is "+ userNum + " decrypted ");
        }
        else if (userChoice != 2 && userChoice != 1 ){
            System.out.println("Please restart and choose a legitimate choice");
        }
    }

    //get functions
    public static String getNum() {
        System.out.print("Enter a 4 digit number: ");
        return input.nextLine();
    }

    public static int getChoice() {
        System.out.print("Enter 1 for encryption or 2 for decryption: ");
        return input.nextInt();
    }

}
