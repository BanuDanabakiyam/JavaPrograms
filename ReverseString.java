// Write a java program to reverse a String
class ReverseString {
// FUNCTION TO REVERSE
public static String reverse(String dat){
int len = dat.length();
// TEST CASE
if(len == 1)
return dat;
String reverseData = "";
// USING FOR LOOP TO REVERSE DATA
for(int i = len-1 ; i >= 0; i--){
reverseData += dat.charAt(i);
}
return reverseData;

}
public static void main(String args[]){
String data = "Good Morning";
System.out.println("Before Reverse : " + data);

System.out.println("After Reverse : " + reverse(data));
}
}