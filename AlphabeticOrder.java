import java.util.Arrays;
class AlphabeticOrder{

public static void main(String args[]){
String []str = {"xaa","aaa","baa","bae"};
System.out.println(Arrays.toString(str));
for(int i = 0 ; i < str.length ; i++){
for(int j = i + 1 ; j < str.length ; j++){

if(str[i].charAt(0) > str[j].charAt(0)){
String temp = str[j];
str[j] = str[i];
str[i] = temp;
}
else if(str[i].charAt(0) == str[j].charAt(0)) {
int n = 1;
while(n < str[i].length() && n < str[j].length()){
if(str[i].charAt(n) > str[j].charAt(n)){
String temp = str[j];
str[j] = str[i];
str[i] = temp;
break;
}
else if(str[i].charAt(n) < str[i].charAt(n)){
break;
}
else {
n++;
}
}
}
}
}
System.out.println(Arrays.toString(str));
}
}