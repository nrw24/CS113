/*Navado Wray
HW01
CS 113-001
Professor Kapleau
10/1/18
*/

// Necessary to import Scanner class
import java.util.Scanner;

public class HW1 {
  public static void main(String[] args) {
    // New Scanner is instantiated
    Scanner scan = new Scanner(System.in);

    //PP 2.5
    /*
    Create a version of the UnitConverter application to convert from inches to foot.
    Read the inches value from the user.
    */

    System.out.print("Enter in the number of inches you wish to convert to feet: ");

    double inches = scan.nextDouble();
    double feet = inches / 12;

    // Print result
    System.out.print(inches + " inches is equivalent to " + feet + " feet.\n");
  

    //PP 2.6
    /*
    Write a program that converts grams to pounds. (One pound equals 453.592 grams.)
    Read the grams value from the user as a floating point value.
    */

    System.out.print("Enter in the number of grams you wish to convert to pounds: ");

    double grams = scan.nextDouble();
    double pounds = grams / 453.592;

    // Print result
    System.out.print(grams + " grams is equivalent to " + pounds + " pounds.\n");


    // PP 2.8
    /*
    Write a program that reads values representing the weight in kilograms, grams, and
    milligrams and then prints the equivalent weight in milligrams.
    (For example, 1 kilogram, 50 grams, and 42 milligrams is equivalent to 1,050,042 milligrams.
    */

    System.out.print("Enter in the number of kilograms to convert to milligrams: ");
    double kgs = scan.nextDouble();

    System.out.print("Enter in the number of grams to convert to milligrams: ");
    double gms = scan.nextDouble();

    System.out.print("Enter in the number of milligrams: ");
    double mgs = scan.nextDouble();

    // Conversion and addition
    double convertedKilograms = kgs * 1000000;
    double convertedGrams = gms * 1000;
    double totalMilligrams = convertedKilograms + convertedGrams + mgs;
  

    // Print result
    System.out.print(kgs + " kilograms, " + gms + " grams, and " + mgs + " milligrams is equivalent to " + totalMilligrams + " milligrams.\n");
    
    // PP 2.9
    /*
    Create a version of the previous project that reverses the computation.
    That is, read a value representing the weight in milligrams, then print the
    equivalent weight as a combination of kilograms, grams, and milligrams.
    (For example, 90,70,056 milligrams is equivalent to 9 kilograms, 70 grams, and 56 milligrams.)
    */

    System.out.print("Enter in the number of milligrams you wish to convert to kilograms, grams, and milligrams: ");
    double milligrams = scan.nextDouble();

    // Splicing of milligrams into the respective units
    int splicedKilogram = (int) milligrams / 1000000;
    int splicedGram = (int) milligrams / 1000;
    splicedGram = splicedGram % 1000;
    int splicedMilligram = (int) milligrams % 1000;
    // End splicing of milligrams into the respective units

    // Print result
    System.out.println(milligrams + " milligrams is equal to " + splicedKilogram + " kilograms, " + splicedGram + " grams, " + splicedMilligram + " milligrams.\n");
    
  }
}
