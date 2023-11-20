import java.util.Scanner;
class GetAsciiValue{
public static int Ascii(char data){
int changeCharToInt = (int) data;
return changeCharToInt;
}
public static void main (String args[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter your character ");
char choice = scanner.next().charAt(0);
System.out.println(Ascii(choice));
}
}