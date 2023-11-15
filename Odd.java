// 17. Write a Java program to display the n terms of odd natural number and their sum.
import java.util.Scanner;
class Odd{

public static void main (String args[]){
Scanner scanner = new Scanner(System.in);
// GET INPUT FROM USER
System.out.println("Enter a number to get sum of odd numbers");
int num = scanner.nextInt();

int sum = 0;
// USING FOR LOOP TO SUM OF ODD NUMBERS
for(int i = 1; i <= num; i += 2){
sum += i;
}
// PRINT THE SUM
System.out.println("Sum of odd numbers in between of "+num+ " is equal : " +sum);
}
}