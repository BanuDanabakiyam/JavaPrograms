//3. Java program that takes five numbers as input to calculate and print the average of the numbers.
import java.util.Scanner;

class Average{
public static void main(String args[]){
// Take 5 imputs from user to display average
Scanner scanner = new Scanner(System.in);
System.out.println("Enter 5 Numbers to get average ");
int Result = 0;
for(int i = 0 ; i < 5 ; i++){
//Using for loop to get values
Result += scanner.nextInt();
}
//Calculate Avearge
int average = Result/5;
System.out.println("Average : "+average);
}
}