import java.io.*; import java.util.Scanner;

public class InputExample {

public static void main(String args[]) throws IOException { 
//ask user height in cm    
    Scanner s = new Scanner(System.in); 
    System.out.print("Enter your height in centimeters: ");   
//ask user weight in kg
    float height = s.nextFloat();      
    System.out.print("Enter your weight in kilograms: "); 
    float weight = s.nextFloat();
//Output
    float bmi = weight/(height*height)*10000; System.out.println("Your body mass index is " + bmi + ".");

}


}