 abstract class Animal{
 abstract void speak();
 abstract void eat();
}
class Dogs extends Animal{
public void speak(){
System.out.println("WOOF");
}
public void eat(){
System.out.println("NUM NUM");
}
public static void main (String args[]){
Animal obj = new Dogs();
obj.speak();
obj.eat();
}
}