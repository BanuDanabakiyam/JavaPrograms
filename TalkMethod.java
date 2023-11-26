class TalkMethod {
String name;
TalkMethod(String data){
this.name = data;
}
public void naming(){
System.out.println("Hello " + name);
}
public static void main (String args[]){
TalkMethod talk = new TalkMethod("Banu");
talk.naming();

}
}