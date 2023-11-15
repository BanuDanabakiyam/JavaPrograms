// 15. Java program that reads an integer and check whether it is negative, zero, or positive. 
 
import java.util.Scanner;

class CheckInteger{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
// GET INPUT FROM USER 
System.out.println("\nEnter an integer to display of that table : ");
int num = scanner.nextInt();
if(num < 0){
System.out.println("The number " + num + " is Negative.");
}
else if(num == 0){
System.out.println("The number " + num + " is Zero.");

}
else{
System.out.println("The number " + num + " is Positive.");
}

}
}
