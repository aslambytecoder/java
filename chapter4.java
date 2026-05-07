import java.util.*;
public class chapter4 { //p-1
    public static void main(String []args){
// System.out.println("enter the number:");
// Scanner sc=new Scanner(System.in);
// int a=sc.nextInt();
//     if(a==11){
//         System.out.println("i am aslam.");
//     }
//         else{
//             System.out.println("i am vivek.");
        
// p-2 pass or fail

// Scanner sc=new Scanner(System.in);
// int math,eng,hindi;
// System.out.print("marks of math:");
// math=sc.nextInt();
// System.out.print("marks of eng:");
// eng=sc.nextInt();
// System.out.print("marks of hindi:");
// hindi=sc.nextInt();
// int total=math+eng+hindi;
// float parcentage=(total/300.0f)*100;
// if(parcentage>=40 && math>=33 && eng>=33 && hindi>=33){
//     System.out.println("pass");
// }
// else{
//    System.out.println("fail");
    
//p-3 income tax

// Scanner sc=new Scanner(System.in);
// System.out.println("enter the number:");
// float tax=0;
// float income=sc.nextFloat();
// if(income>2.5){
//     tax=tax+0;
//    // System.out.println("no tax");
// }
// else if(income>2.5f && income<=5f){
//     tax= tax+0.05f * (income-2.5f);
// }
// else if(income>5f && income<=10.0f){
//     tax= tax+0.05f*(5.0f-2.5f);
//     tax= tax+0.2f*(income-5f);
// }
// else if(income>10.0f){
//  tax= tax+0.05f*(5.0f-2.5f);
//     tax= tax+0.2f*(10.0f-5f);
//     tax=tax+0.3f*(income-10.0f);
// }
// System.out.println("total tax"+tax);

//p-4 switch case->

// Scanner sc=new Scanner(System.in);
// System.out.println("ENTER THE NUMBER:");
// int day=sc.nextInt();
// switch(day){
//     case 1,8,15,22,29->System.out.println("monday");
//     case 2,9,16,23,30->System.out.println("monday");
//     case 3,10,17,24->System.out.println("tuesday");
//     case 4,11,18,25->System.out.println("wednesday");
//     case 5,12,19,26->System.out.println("thrusday");
//     case 6,13,20,27->System.out.println("friday");
//     case 7,14,21,28->System.out.println("saturday");

//p-5 .com,.in,.org website check

// Scanner sc=new Scanner(System.in);
// System.out.println("enter the website name");
// String website=sc.nextLine();
// if(website.endsWith(".org")){
// System.out.println("this is original website");
// }
// else if(website.endsWith(".com")){
//     System.out.println("this is comarsial website");
// }
// else if(website.endsWith(".in")){
//     System.out.println("this is indian website");

//p-6 leap year 

// Scanner sc=new Scanner(System.in);
// System.out.print("enter the year:");
// int year=sc.nextInt();
// if(year%2==0){
//     System.out.println("it is leap year:");
// }
// else{
//     System.out.println("it is not leap year:");

//p-7 find odd or even number 
    
Scanner sc=new Scanner(System.in);
System.out.print("enter the number:");
int number=sc.nextInt();
if(number%2==0){
    System.out.println("even");
}
else{
    System.out.println("odd");
}
}
}


    
