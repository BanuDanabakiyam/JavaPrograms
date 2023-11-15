//  13. Java program to check if a positive number is a palindrome or not. 
 
 
import java.util.Scanner;
import java.io.*;

class CheckPalindrome{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
// GET INPUT FROM USER 
System.out.println("\nEnter  Number : ");
int num = scanner.nextInt();
int originalValue = num;
// INITIALY WE REVERSE A NUMBER
int reverse = 0;
while(num != 0){
int remainder = num % 10;
reverse = reverse * 10 + remainder;
num = num / 10; 
}
// NOW CHECK ORIGINAL VS REVERSE AND PRINT VALUES
if(reverse == originalValue){
System.out.println(" It is Palindrome");
}
else{
System.out.println(" It is not Palindrome");
}
}
}

