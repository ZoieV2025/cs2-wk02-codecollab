import java.util.Scanner;  // this is new...

public class Main {
  public static void main(String[] args) {

    int age = 16; 
    double gpa = 3.75; 
    char grade = 'A'; 
    boolean isPassed = true; 
		
    System.out.println("Student Information:");
    System.out.println("Age: " + age);
    System.out.println("GPA: " + gpa);
    System.out.println("Grade: " + grade);
    System.out.println("Passed: " + isPassed);

    int birthYear = 2024 - age; // changed to 2024 so more accurate
    System.out.println("Birth Year: " + birthYear);

		System.out.println("Cool, now let's get lunch!");
		System.out.print("Zazzy's ");
		System.out.print("is ");
		System.out.print("closed 😔");

		double lunchMoney = 6.50;
    double pricePerSlice = 2.75;
    int numSlices = (int) (lunchMoney / pricePerSlice);
    System.out.println("But you can buy " + numSlices + " slices of pizza at Centro.");

		System.out.println("That's not enough food! I'll lend you some cash. Type a NUMBER: ");
		
		Scanner input = new Scanner(System.in); 
    double moneyBorrowed = input.nextDouble();
		
		lunchMoney += moneyBorrowed;
		numSlices = (int) (lunchMoney / pricePerSlice);
    System.out.println("With your extra cash, you can now afford " + numSlices + " slices of pizza at Centro 🍕");
		
  }
}
//1. connect output to print statements to identify secitons of code - talk avbout cause and effect of code 
//- print on whatever line corresponds to that output
//2. focus on a group - chunked - these four actions accomplish ______ (use vocab)
// pick smth that someone has not talked abt , if ppl. chose everyhting can focus on something in one detail or go to unit notes and pick smth out that was not discussed