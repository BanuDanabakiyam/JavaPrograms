// Java program to check whether the number is a prime number or not.
import java.util.Scanner;
class CheckIsPrime{
public static boolean isPrime(int num){
// BELOW 2 IT RETURN FALSE
if(num < 2){
return false;
}
// CHECK DIVISIBILITY OF PRIME AND ITS SQUARE ROOT.
for(int i = 2 ; i <= Math.sqrt(num) ;i++){
if(num % i == 0){
return false;
}
}
return true;
}
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
int sum = 0;
// GET USER INPUT
System.out.println("Enter number");
int num = scanner.nextInt();
// CHECK CONDIDTION TRUE OR FALSE
if(isPrime(num)){
// CONDITION IS TRUE 
System.out.println("It is Prime");
}else{
// CONDITION IS FALSE
System.out.println("It is not Prime");
}
}
}