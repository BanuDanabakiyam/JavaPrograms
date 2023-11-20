import java.util.Scanner;
import java.util.Arrays;

class DescendingOrder{
static Scanner scanner = new Scanner(System.in);
public static int [] sorted(){
int arr [] = new int [5];
System.out.println("Enter 5 values ");
for(int i = 0 ; i < 5 ; i++){
int values = scanner.nextInt();
arr [i] = values;
}
System.out.println("Before Descending Order Sorted : " + Arrays.toString(arr));
for(int i = 0 ; i < arr.length ; i++){
for(int j = i + 1 ; j < arr.length ; j++){
if(arr[i] < arr[j]){
int temp = arr[j];
arr[j] = arr[i];
arr[i] = temp;
}
}
}
return arr;
}
public static void main(String args[]){
int arr1 [] = sorted();
System.out.println("After Descending Order Sorted :" + Arrays.toString(arr1));

}
}