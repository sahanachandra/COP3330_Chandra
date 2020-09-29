import java.util.ArrayList;
import java.util.Scanner;


public class App {


    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }

        displayBmiStatistics(bmiData);
    }

    private static boolean moreInput() {
        System.out.println("\nWould you like to add an entry?\nPlease enter 'Y' for 'yes' or 'N' for 'no.'");
        Scanner in = new Scanner(System.in);                   //Clears input, and delivers to buffer
        String Buffer = in.nextLine();
        return entryCheck(Buffer);                             //Checks buffer.
    }

    private static double getUserHeight() {
        System.out.println("Please enter height in inches, please.");
        Scanner in = new Scanner(System.in);                   //Clears input,and delivers to buffer
        double Buffer = in.nextDouble();
        return entryCheck(Buffer, 1);                   //Valid entry?
    }
    private static double getUserWeight() {
        System.out.println("Please enter weight in pounds, please.");
        Scanner in = new Scanner(System.in);                    //Clears input, and delivers to buffer
        double Buffer = in.nextDouble();
        return entryCheck(Buffer, 2);                    //Valid entry?

    private static void displayBmiInfo(BodyMassIndex bmi) {     
        System.out.printf("\nIndex of %.1f shows that you are %s", bmi.index, bmi.category);
        //prints BMI
    }

    private static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData) {
        double average = calculateAverage(bmiData);
        System.out.printf("\nAverage BMI is %.1f.", average);
    }

    private static Boolean entryCheck(String Buffer){           
        if(Buffer.matches("Y")) return true;
        if(Buffer.matches("N")) return false;
        notValid();                                          //valid input?
        return moreInput();                                     
        //recursion
    }

    private static double entryCheck(double Buffer, int Version){
        if(Buffer > 0) return Buffer;                           
        notValid();                                          
        if(Version == 1) return getUserHeight();                
        return getUserWeight();
    }

    private static double calculateAverage(ArrayList<BodyMassIndex> bmiData){
        double summation = 0;                                   
        for(int i=0; i<bmiData.size(); i++) summation = summation + bmiData.get(i).index;
        return Math.round(10.0*summation/bmiData.size())/10.0;  //Use array for data

    }

    private static void notValid(){
        System.out.println("\nYour entry was not valid start the program over.\n");
    }
}
