import java.util.Scanner;
class Armstrong {


public static int powerCalculate(int num, int count){

   
int sum = 1;
    for (int i = 0; i < count; i++) {
        sum *= num; 
        
    }





return sum ;
}
public static void getValue(int val){
int original1 = val;
int count = 0;
while(original1 != 0){
int reamis = original1 % 10;
original1 = original1 / 10;
count++;
}
int original = val;

int total = 0;
while(val != 0){
int remainder = val % 10;
total += powerCalculate(remainder ,count);
val = val/10;
}

if(total == original){
total = 0;
System.out.println("Armstrong num :" + original);
}
}
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
for (int i = 1 ; i <= 600 ;i++){
getValue(i);
}
}
}

