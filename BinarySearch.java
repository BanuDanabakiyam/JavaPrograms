class BinarySearch{
public static int searchAscending(int arr[],int target){
int start = 0;
int end = arr.length- 1;
while(start <= end){
int mid = (start + end)/2;
if(target > arr[mid]){
start = mid + 1;
}else if(target < arr[mid]){
 end = mid - 1;
}
else {
return mid;
}
}
return -1;
}

public static int searchDescending(int arr[], int target){
int start = 0;
int end = arr.length- 1;
while(start <= end){
int mid = (start + end)/2;
if(target > arr[mid]){
end = mid - 1;
}else if(target < arr[mid]){
 start = mid + 1;
}
else {
return mid;
}
}
return -1;

}
public static void main(String args[]){
int arr[] = {99,88,77,66,55,44,33,22};
int start = arr[0];
int end = arr.length - 1;
int target = 33;
if(start <= end ){
System.out.println("Found " + " your target value of " + target + " index position : " +  searchAscending(arr,target));
} else {
System.out.println("Found " + " your target value of " + target + " index position : " +  searchDescending(arr,target));
}


}
}