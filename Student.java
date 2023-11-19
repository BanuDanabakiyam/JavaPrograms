// 4. Java Program to Accept the Marks of a Student and find Total Marks, Percentage and Grade accordingly
import java.util.Scanner;
class Student{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
int sum = 0;
// GET VALUES FROM USER
System.out.println("Enter number of subjects");
int num = scanner.nextInt();
System.out.println("Enter marks out of 100");
for(int i = 0 ; i < num ; i++){
sum += scanner.nextInt();
}
System.out.println("Total Marks :" + sum);
float percent = sum / num ;
System.out.println("Your Percentage :" + percent);
// CHECK CONDITION FOR PRINT GRADE
if( percent >= 90){
System.out.println("Your Grade : A");
}else if(percent >= 80 && percent <= 90) {
System.out.println("Your Grade : B");
}
else if(percent >= 60 && percent <= 80){
System.out.println("Your Grade : C");
}
else if(percent >= 40 && percent <= 60){
System.out.println("Your Grade : D");
}else {
System.out.println("Your Grade : E");
}
}
}