import java.util.Scanner;
class Calculator{
static Scanner scanner = new Scanner(System.in);

public static float percentagePerformance(){

float result = 0;

System.out.println("Enter the value");
float value = scanner.nextFloat();
System.out.println("How much % to calculate above you mentioned value ");
float per = scanner.nextFloat();
return result = value * per/100;
}

public static float additionPerformance(){
float sum = 0;
System.out.println("How many numbers you want to add");
int tot = scanner.nextInt();
System.out.println("Enter values");
for(float i = 0 ; i < tot ; i++){
sum += scanner.nextFloat();
}
return sum;

}

public static float subtractionPerformance(){
System.out.println("How many numbers you want to sub");
int tot = scanner.nextInt();
System.out.println("Enter values");
float sub = scanner.nextFloat();
for(float i = 0 ; i < tot ; i++){
sub -= scanner.nextFloat();
}
return sub;

}

public static float multiplyPerformance(){
float result = 1;
System.out.println("How many numbers you want to multiply");
int tot = scanner.nextInt();
System.out.println("Enter values");
for(float i = 0 ; i < tot ; i++){
result *= scanner.nextFloat();
}
return result;

}

public static float divisionPerformance(){

System.out.println("Enter First number");
float first = scanner.nextFloat();
System.out.println("Enter Second number");
float second = scanner.nextFloat();
float  result  = first / second;

return result;
}


public static void main(String args[]){
boolean again = false;
while(!again){
System.out.println("Enter choice to perform operation");

System.out.println("1.Addition \n2.Subratction \n3.Multiplication \n4.Division \n6.Percaentage \n7.Exit");
int choice = scanner.nextInt();
switch(choice){
case 1:
System.out.println(additionPerformance());
break;
case 2:
System.out.println(subtractionPerformance());
break;
case 3:
System.out.println(multiplyPerformance());
break;
case 4:
System.out.println(divisionPerformance());
break;



case 6:
System.out.println(percentagePerformance());
break;
case 7:
again = true;
System.out.println("Exit");
break;


}
}
}
}

