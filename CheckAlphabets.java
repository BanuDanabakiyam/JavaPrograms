import java.util.Scanner;
class CheckAlphabets{
public static boolean isVowel(char data){
int lower = (int) data;
if(lower > 96){
lower =  lower;
}
else{
lower += 32;
}
if(lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u' ) 
{
return true;
}
return false;
}
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter character");
char choice = scanner.next().charAt(0);
if(isVowel(choice)){
System.out.println("YES! It is vowel : " + choice);
}
else{
System.out.println("NO! It is consonants : " + choice);
}
}
}