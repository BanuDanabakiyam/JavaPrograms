class Person{
String name;
int age;

Person(String name, int age){
System.out.println(name  + " " +  age);
}
}
class Teacher extends Person{
String degree;
Teacher(String name, int age, String degree){
super(name,  age);
this.degree = degree;
System.out.println(name + " " +  age + " " + degree);
}
public static void main(String args[]){

Person obj1 = new Teacher("Banu", 27, "MCA");
}
}
