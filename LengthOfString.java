//Write a java program to get the length of a given string.
import java.util.Scanner;
class LengthOfString{
public static int findLength(String dat){
// '\0' ASCII VALUE 0 ITS DENOTE STRING NULL 
 dat = dat + '\0';
int count = 0;
// USING FOR LOOP TO CHECK CHARACTER CONTAINS NULL
for(int i = 0 ; dat.charAt(i) != '\0' ; i++){
count++;
}
return count;
}
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
// GET VALUE FORM USER
System.out.println("Enter Word ");
String data = scanner.nextLine();
// DISPLAY RESULT
System.out.println(findLength(data));
}
}
