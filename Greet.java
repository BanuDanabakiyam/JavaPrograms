class Greet{
String name;
Greet(){
System.out.println("Hello");
}
Greet(String name){
this.name = name;
System.out.println("Hello " + name);
}
public static void main (String args[]){
Greet obj1 =  new Greet();
Greet obj2 =  new Greet("Banu");
}
}