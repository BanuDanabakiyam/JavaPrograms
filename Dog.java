class Pets{

Pets(){
System.out.println("I have a best pet!");}
}
class Dog extends Pets{
Dog(){
super();
System.out.println("I have the best Dog");
}
public static void main(String args[]){
Pets obj  = new Dog();
}
}
