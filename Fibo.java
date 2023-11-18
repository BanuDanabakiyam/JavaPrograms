import java.util.Scanner;

class Fibo{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter number");
int num = scanner.nextInt();
int a1 = 0;
int a2 = 1;
System.out.print(a1);
System.out.print(" ");
System.out.print(a2);
for(int i = 0 ; i < num ; i++){
System.out.print(" ");
int a3 = a1 + a2;
System.out.print(a3);
a1 = a2;
a2 = a3;
}
}
}