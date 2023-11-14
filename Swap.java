// 5. Java program to swap two variables without using third variable. 
import java.util.Scanner;
class Swap {

public static void main(String args[]){

Scanner scanner = new Scanner(System.in);
// Get two values from user for swapping

System.out.println("Enter Fisrt Number");
int first = scanner.nextInt();
System.out.println("Enter Second Number");
int second = scanner.nextInt();

System.out.println("Before swapping");
System.out.println("First Value : "+first);
System.out.println("Second Value : "+second);

// Swap opertaion perform here
first = first + second;
second = first - second;
first = first - second;



System.out.println("After Swapping");
// Display swapping integers.
System.out.println("First Value : "+first);
System.out.println("Second Value : "+second);
}
}

