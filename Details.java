class Store{
private String name;
private String address;
Store(){
this.name = name;
this.address = address;

}
Store(String name, String address){
this.name = name;
this.address = address;
}
public String getName(){
return  name;
}
public String getAddress(){
return address;
}
public void setName(String name){
 this.name = name;
}
public void setAddress(String address){
 this.address = address;
}
}
class Details {
public static void main (String args []){
Store obj = new Store();
obj.setName("Tea Shop");
obj.setAddress("123,asdfghjkl");
System.out.println(obj.getName());
System.out.println(obj.getAddress());
}
}
