import java.util.*;
public class chapter7 { //p-1 table
    //static void method(int n){
//         for(int i=1;i<=10;i++){
//             System.out.println(n+"x"+i+"="+n*i);
//         }
//     }
// public static void main(String[]args){
//     System.out.print("TABLE:");
// Scanner sc=new Scanner(System.in);
// int a=sc.nextInt();
// method(a);

//p-2 star pattern   

// static void method1(int n){
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print("*");

//         }
//         System.out.println(" ");
//     }
// }
//     public static void main(String[]args){
// Scanner sc=new Scanner(System.in);
// System.out.print("star pattern:");
// int a=sc.nextInt();
// method1(a);

//p-3 recursion sum

// static int method2(int n){
//     if(n==1){
//         return 1;
//     }
//     else{
//         return n+method2(n-1);
//     }
// }
// public static void main(String[]args){
//     System.out.print("recursion sum:");;
//     int a=method2(5);
//     System.out.println(a);

//p-4 star pattern


// static void method1(int n){
//     for(int i=1;i<=n;i++){
//         for(int j=5;j>=i;j--){
//             System.out.print("*");

//         }
//         System.out.println(" ");
//     }
// }
//     public static void main(String[]args){
// Scanner sc=new Scanner(System.in);
// System.out.print("star pattern:");
// int a=sc.nextInt();
// method1(a);

//p-5 fibnoci series of 5
// exaple 0,1,1,2,3,5,8.........

// static int fib(int n){
//     if(n==1||n==2){
//         return n-1;
//     }
//     else{
//         return fib(n-1)+fib(n-2);
//     }
// }
// public static void main(String[]args){
//     int a=fib(5);
//     System.out.println("fibnoci series of 5:"+a);

//p-6 argument pass or find average

//  static int avg(int... arr) {
//         int sum = 0;
//         for (int element : arr) {
//             sum += element;
//         }
//         int result = sum / arr.length;
//         return result;
//     }
//     public static void main(String[] args) {
//         int value= avg(4, 5, 7, 6, 8);
//         System.out.println("Average is: " + value);

//p-7 
}
