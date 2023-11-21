// Java program to convert seconds to hour, minute, and seconds.
import java.util.Scanner;
class Conversion{
public static void checkSeconds(int data){
int originalSec = data;
int min = 0;
int hour = 0;
int count = 0;
int sec = 0;
boolean convert = true;
while(convert){
if(data >= 3600){
data -= 3600;
System.out.println("data1" + data);
count++;
hour = count;
}
else if(data < 3600){
sec = data % 60;
System.out.println("data2" + data);
min = data / 60;
convert = false;
}
}
System.out.println("\n Hour : " + hour + "\n Minute : " + min + "\n Seconds : " + sec ); 

}
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter number");
int sec = scanner.nextInt();
checkSeconds(sec);
}
}