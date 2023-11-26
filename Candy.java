class Chocolate{
public void taste(){
System.out.println("tastes sweet!");
}
}
class Candy extends Chocolate{
public void taste(){
System.out.println("tastes chocolately");
}
public static void main(String args[]){
Chocolate obj1 = new Chocolate();
obj1.taste();
Chocolate obj = new Candy();
obj.taste();
}
}

