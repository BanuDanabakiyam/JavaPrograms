// 4. Java Program to find area of rhombus. 

import java.util.Scanner;
class Rhombus {

public static void main(String args[]){

// Get values from user

Scanner scanner = new Scanner(System.in);
System.out.println("Enter Base Value");
int baseValue = scanner.nextInt();
System.out.println("Enter Height Value");
int heightValue = scanner.nextInt();
// Area of Rhombus = 1/2(base * height)
int area = (baseValue * heightValue)/2;
System.out.println("Area of Rhombus : "+area);
}
}
