//2. Java program to print the sum, multiply, subtract, divide and remainder of two numbers. 
import java.util.Scanner;

class Arithmetic{

public static void main(String args[]){
//GET INPUT FROM USER
Scanner scanner = new Scanner(System.in);
System.out.println("Enter First Number");
int firstValue = scanner.nextInt();
System.out.println("Enter Second Number");
int secondValue = scanner.nextInt();
int add = firstValue + secondValue;
int sub = firstValue - secondValue;
int multi = firstValue * secondValue;
int div = firstValue / secondValue;
int mod = firstValue % secondValue;
//DISPLAY OUTPUT TO USER OF ADDITION,SBTRACTION,MULTIPLICTAION,REMIANDER,DIVISION
System.out.println("Addition Of First and Second numbers : " +add );
System.out.println("Subraction Of First and Second numbers : " +sub );
System.out.println("Multiplication Of First and Second numbers : " +multi );
System.out.println("Divison Of First and Second numbers : " + div);
System.out.println("Remiander Of First and Second numbers : " + mod );

}
}