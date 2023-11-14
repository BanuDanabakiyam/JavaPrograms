// 7. Java program to print the ascii value of a given character. 

import java.util.Scanner;
class ASCII {

public static void main(String args[]){

Scanner scanner = new Scanner(System.in);
// Get character from user 

System.out.println("Enter Character to get ASCII values ");
char first = scanner.next().charAt(0);
System.out.println((int)first);

}
}