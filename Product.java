//1.Java program that takes two numbers and display the product of two numbers. 
import java.util.Scanner;
class Product {

public static void main(String args[]){
// Get values from user 
Scanner scanner = new Scanner(System.in);
System.out.println("Enter Fisrt Number");
int firstValue = scanner.nextInt();
System.out.println("Enter Second Number");
int secondValue = scanner.nextInt();
// Calculate values
int result = firstValue * secondValue;
// Display values
System.out.println("The Product of First and Second numbers : "+result);
}
}



