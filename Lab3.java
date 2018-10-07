/*Navado Wray
Lab 3
CS 113-001
Professor Kapleau
10/1/18
*/
import java.text.NumberFormat;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;
public class Lab3 {
		public static void main(String[] args) {
			/*String college = new String ("PoDunk College ");
			String town = new String ("Anytown, USA");
			int stringLength;
			String change1, change2, change3;
			stringLength = college.length();
			System.out.println(college + " contains " + stringLength + " characters.");
			change1 = college.toUpperCase();
			change2 = college.replace( "O" ,  "*");
			change3 = college.concat(town);
			System.out.println("The final string is " + change3);
			
		// Right Triangle
			double side1, side2;
			double hypotenuse;*/
			Scanner scan= new Scanner(System.in);
			System.out.println("Please enter the lengths of the two sides of " + "a right triangle: ");
			/*side1 = scan.nextDouble();
			side2 = scan.nextDouble();
			hypotenuse = Math.sqrt((side1*side1 +side2*side2));
			System.out.println("Length of the hypotenuse: " + hypotenuse );
			if (scan!=null)
				scan.close();
			// Random number
			// **************************************************
			// LuckyNumbers.j ava
			//
			// To generate three random "lucky" numbers
			// **************************************************
			Random generator = new Random();
			int lucky1, lucky2, lucky3;
			// Generate lucky1 (a random integer between 50 and 79) using the
			// nextInt method (with no parameter)
			lucky1 = (generator.nextInt() % 50 + 20);
			// Generate lucky2 (a random integer between 90 and 100) using the
			// nextInt method with an integer parameter
			lucky2 = (generator.nextInt(11) + 90) ;
			// Generate lucky3 (a random integer between 11 and 30) using nextFloat 
			lucky3 = (int) (generator.nextFloat() % 11 ) + 20;
			System.out.printf("Your lucky numbers are: %d, %d, %d ", lucky1, lucky2, lucky3);
			
			
			//Working with Strings
			// ***************************************************************
			// StringManips.j ava
			//
			// Test several methods for manipulating String objects
			// ***************************************************************
			String phrase = new String ("This is a String test.");
			int phraseLength; // number of characters in the phrase String
			int middleIndex; // index of the middle character in the String
			String firstHalf; // first half of the phrase String
			String secondHalf; // second half of the phrase String
			String switchedPhrase; {//a new phrase with original halves switched
			String city, state;
			
			// compute the length and middle index of the phrase
			phraseLength = phrase.length();
			middleIndex = phraseLength / 2;
			// get the substring for each half of the phrase
			firstHalf = phrase.substring(0,middleIndex);
			secondHalf = phrase.substring(middleIndex, phraseLength);
			// concatenate the firstHalf at the end of the secondHalf
			switchedPhrase = secondHalf.concat(firstHalf);
			// print information about the phrase
			System.out.println();
			System.out.println ("Original phrase: " + phrase);
			System.out.println ("Length of the phrase: " + phraseLength +
			" characters");
			System.out.println ("Index of the middle: " + middleIndex);
			System.out.println ("Character at the middle index: " +
			phrase.charAt(middleIndex));
			System.out.println ("Switched phrase: " + switchedPhrase);
			System.out.println();
			String middle3 = phrase.substring(middleIndex-1, middleIndex+2);
			System.out.println("The three middle characters are: " + middle3);
			switchedPhrase = switchedPhrase.replaceAll( "", "*"); 
			System.out.println("Enter your city");
			city=scan.nextLine().toLowerCase();
			System.out.println("Enter your state");
			state = scan.nextLine().toUpperCase();
			System.out.println(state + city + state);
		//Rolling Dice
			Die die1 = new Die();
	        Die die2 = new Die();

	        die1.roll();
	        die2.roll();

	        int point = die1.getFace() + die2.getFace();

	        System.out.println(die1 + " and " + die2 + " is " + point);

	        if (point == 7 || point == 11) {
	            System.out.println("You win!");
	        }
	        else if (point == 2 || point == 12) {
	            System.out.println("You lose!");
	        }
	        else {
	            int roll = 0;
	            while (roll != point && roll != 7) {
	                die1.roll();
	                die2.roll();
	                roll = die1.getFace() + die2.getFace();
	                System.out.println(die1 + " and " + die2 + " is " + roll);
	            }
	            if (roll == point) {
	                System.out.println("You win!");
	            }
	            else {
	                System.out.println("You lose!");
	            }
	        }
	class Die {

	    public Die() {

	        roll();
	    }

	    public int getFace() {

	        return face;
	    }

	    public void roll() {

	        face = rand.nextInt(MAX_FACE) + 1;
	    }

	    public void setFace(int value) {

	        if (1 <= value && value <= MAX_FACE) {
	            face = value;
	        }
	    }

	    public String toString() {

	        return Integer.toString(face);
	    }

	    private Random rand = new Random();

	    private static final int MAX_FACE = 6;
	    private int face;
	
	// Computing Distance
		double x1, y1, x2, y2; // coordinates of two points
	double distance; // distance between the points
	// Read in the two points
	System.out.println("Enter the coordinates of the first point " + "(put a space between them): ");
	x1 = scan.nextDouble();
	y1 = scan.nextDouble();
	System.out.println("Enter the coordinates of the second point: ");
	x2 = scan.nextDouble();
	y2 = scan.nextDouble();
	// Compute the distance
	distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
	// Print out the answer 
	System.out.println("The distance between the two points is " + distance);
	
	// ************************************************************
	// DeliFormat.java
	//
	// Computes the price of a deli item given the weight
	// (in ounces) and price per pound -- prints a label,
	// nicely formatted, for the item.
	//
	// ************************************************************
	// ---------------------------------------------------
	// main reads in the price per pound of a deli item
	// and number of ounces of a deli item then computes
	// the total price and prints a "label" for the item
	// ---------------------------------------------------
	
	final double OUNCES_PER_POUND = 16.0;
	double pricePerPound; // price per pound
	double weightOunces; // weight in ounces
	double weight; // weight in pounds
	double totalPrice; // total price for the item
	NumberFormat money; // Declare money as a NumberFormat object and use the
	money = NumberFormat.getCurrencyInstance();// getCurrencyInstance method to assign it a value
	DecimalFormat fmt = new DecimalFormat("#.##"); // Declare fmt as a DecimalFormat object and instantiate
	// it to format numbers with at least one digit to the left of the
	// decimal and the fractional part rounded to two digits.
	// prompt the user and read in each input
	System. out. println ("Welcome to the CS Deli! ! \n ");
	
	System.out.print ("Enter the price per pound of your item: ");
	pricePerPound = scan.nextDouble();
	System.out.print ("Enter the weight (ounces): ");
	weightOunces = scan.nextDouble();
	// Convert ounces to pounds and compute the total price
	weight = weightOunces / OUNCES_PER_POUND;
	totalPrice = pricePerPound * weight;
	// Print the label using the formatting objects
	System.out.printf("Unit Price: %d \nWeight: %d \n\n TOTAL: %d", pricePerPound, weightOunces, totalPrice);
	// format for the weight in pounds and money for the prices 
	*/
	//Playing with Cards
	 Rank highCard;
	 Rank faceCard; 
	 Rank card1;
	 Rank card2;
	 highCard = 
	   public Card( Suit theSuit, CardValue theValue ) {   // Constructor.
	      suit = theSuit;
	      value = theValue;
	   }
	   public Suit getSuit() {
	      return suit;
	   }
	   public CardValue getValue() {
	      return value;
	   }
	   public String toString() {
	      return value + " of " + suit;  // A string such as "Ace of Spades"
	   }

	
	// Nested Panels
	JFrame frame = new JFrame ("Nested Panels");
	frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	// Set up first subpanel
	JPanel subPanel1 = new JPanel();
	subPanel1.setPreferredSize (new Dimension(150, 100));
	subPanel1.setBackground (Color.green);
	JLabel label1 = new JLabel ("One");
	subPanel1.add(label1);
	// Set up second subpanel
	JPanel subPanel2 = new JPanel();
	subPanel2.setPreferredSize (new Dimension(150, 100));
	subPanel2.setBackground (Color.red);
	JLabel label2 = new JLabel ("Two");
	subPanel2.add (label2);
	// Set up third subpanel
	JPanel subPanel3 = new JPanel();
	subPanel3.setPreferredSize(new Dimension(300,100));
	subPanel3.setBackground(Color.MAGENTA);
	JLabel label3 = new JLabel("Real men wear magenta.");
	subPanel3.add(label3);
	// Set up fourth subpanel
	JPanel subPanel4 = new JPanel();
	subPanel4.setPreferredSize(new Dimension(320,20));
	subPanel4.setBackground(Color.BLUE);
	JLabel label4 = new JLabel("My Panels");
	subPanel4.add(label4);
	// Set up primary panel
	JPanel primary = new JPanel();
	primary.setPreferredSize(new Dimension(320,640));
	primary.setBackground (Color.blue);
	primary.add (subPanel1);
	primary.add (subPanel2);
	primary.add(subPanel3);
	primary.add(subPanel4);
	frame.getContentPane().add(primary);
	frame.pack () ;
	frame.setVisible(true); 
		}
}