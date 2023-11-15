// 16. Java program to display the multiplication table of a given integer. 
import java.util.Scanner;

class MultiplicationTable{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
// GET INPUT FROM USER 
System.out.println("\nEnter an integer to display of that table : ");
int num = scanner.nextInt();
System.out.println("\nEnter an integer to display limit of that table : ");
int limit = scanner.nextInt();
System.out.println("");
// USING FOR LOOP TO PERFORM AN INTEGER
for(int i = 1 ; i <= limit ; i++){
// PRINT THE VALUES.
System .out.println(i + "*" + num + "=" + i*num);
}

}
}
