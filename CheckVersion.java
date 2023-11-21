// Java program to check whether Java is installed on your computer or not
class CheckVersion{
public static void main (String args[]){
try {
String Version = System.getProperty("java.version");
System.out.println("Java is installed. Version: " + Version);
 } catch (Exception e) {
 System.out.println("Java is not installed on this computer.");
}
}
}