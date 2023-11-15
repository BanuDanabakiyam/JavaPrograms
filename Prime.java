// 10. Java program to compute the sum of the first 100 prime numbers. 
class Prime{
public static boolean isPrime(int num){
// BELOW 2 IT RETURN FALSE
if(num < 2){
return false;
}
// CHECK DIVISIBILITY OF PRIME AND ITS SQUARE ROOT.
for(int i = 2 ; i <= Math.sqrt(num) ;i++){
if(num % i == 0){
return false;
}
}
return true;
}
public static void main(String args[]){
int sum = 0;
// LOOP START FROM 0 TO 100
for(int i = 0; i < 100; i++){
// CHECK CONDIDTION TRUE OR FALSE
if(isPrime(i)){
// CONDITION IS TRUE THE PRIME SHOULD BE ADDED TO SUM
sum += i;
}
}
//PRINT THE TOTAL PRIME SUM
System.out.println("The Prime sum of 0 to 100 : " +sum);

}
}