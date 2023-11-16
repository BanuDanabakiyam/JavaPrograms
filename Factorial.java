import java.util.Scanner;
class Factorial{
public static int fact(int n){
if(n == 0 || n == 1){
return 1;
}
// AGAIN AND AGAIN CALL FACT FUNCTION
return n * fact(n-1);
}
public static void main(String args[]){
// GET USER INPUT
Scanner scanner = new Scanner(System.in);
System.out.println("Enter number for Factorial");
int num = scanner.nextInt();
System.out.println();
System.out.println("The factorial of " + num + " is : " +fact(num));
}
}