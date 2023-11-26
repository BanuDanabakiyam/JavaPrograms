class Parent{
public void run(){
System.out.println("From Parent Class");
}
}
class Child extends Parent {
public void run(){
System.out.println("From Child Class");
}
public static void main(String args[]){
Parent obj = new Parent();
obj.run();
Child obj1 = new Child();
obj1.run();
}
}

