// Java program to print all unique element in an array.
import java.util.Scanner;
import java.util.Arrays;


class UniqueElement{

static Scanner scanner = new Scanner(System.in);

public static int [] uniElements(){
int arr1[] = new int[10];
// CREATE TEMP ARRAY
int temp[] = new int[arr1.length];
// STORE UNIQUE ELEMENTS IN UNI
int uni[] = new int [arr1.length];
System.out.println("Enter 10 elements ");
for(int i = 0 ; i < arr1.length ; i++){
int values = scanner.nextInt();
arr1[i] = values;
}
System.out.println("The Array Elements are : " + Arrays.toString(arr1));
for(int i = 0 ; i < temp.length ; i++){
int count = 0;
for(int j = i + 1 ; j < temp.length ; j++){
if(arr1[i] == arr1[j]){
count++;
temp[j] = -1;
temp[i] = -1;
}
}
if(temp[i] != -1){
temp[i] = count;

}
}
int i = 0;
int n = 0;
while(i < temp.length){
if(temp[i] == 0){
uni[n] = arr1[i];
n++;
}
i++;
}
return uni;
}
public static void main(String args[]){

int arr2 [] = uniElements();
// DISPLAY REUSLT
System.out.println("The unique Elements in array : " + Arrays.toString(arr2));
}
}
