import java.util.*;
public class chapter5 { //p-1 star
    public static void main(String[] args) {
   //   int n=5;
   //   for(int i=n;i>0;i--){
   //   for(int j=0;j<=i;j++){
   //      System.out.print("*");
   //   }
   //   System.out.println("");
    
   //p-2 add the even number

//    Scanner sc=new Scanner(System.in);
//    System.out.print("enter the number:");
//    int n=sc.nextInt();
//    int sum=0;
//    for(int i=0;i<n;i++){
//       sum=sum+(2*i);
//    }
//       System.out.println("add the even number:"+sum);
   
//p-3 table

// Scanner sc=new Scanner(System.in);
// System.out.print("write the table:");
// int n=sc.nextInt();
// for(int i=1;i<=10;i++){
//     System.out.println(n+"x"+i+"="+n*i);

//p-4 reverse table

// Scanner sc=new Scanner(System.in);
// System.out.print("enter the number:");
// int n=sc.nextInt();
// for(int i=10;i>=1;i--){
//     System.out.println(n+"x"+i+"="+n*i);

//p-5 factorial number

// Scanner sc=new Scanner(System.in);
// System.out.print("enter the number:");
// int n=sc.nextInt();
// int fac=1;
// int i=1;
// while(i<=n){
//     fac*=i;
//     i++;
// }
//     System.out.println("factorial number:"+fac);

// p-6 sum of table

Scanner sc=new Scanner(System.in);
System.out.print("enter the number:");
int n=sc.nextInt();
int sum=0;
for(int i=1;i<=10;i++){
    sum=sum+(n*i);
}
System.out.println("sum of table:"+sum);
    }
}

