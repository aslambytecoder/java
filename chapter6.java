import java.util.*;
public class chapter6 { //p-1 sum of value
    public static void main(String[]args){
        //  float[]number={4.5f,6.8f,3.5f,5.7f,33.5f};
        //  float sum=0;
        //  for(float element:number){
        //      sum=sum+element;
        //  }
        //  System.out.println("sum of value"+sum);
        //  System.out.println("array of length:"+number.length);
    
//p-2 check array is present or not?
  
// float[]num1={4.5f,6.8f,3.5f,5.7f,33.5f};
// float check=6.1f;
// boolean found=false;
// for(float num2:num1){
// if(check==num2){
//     found=true;
//     break;
// }
// }
// if(found){
//     System.out.println("it is present:");
// }
// else{
//     System.out.println("it is not present:");

            // OR same type code
 
// String[]num1={"aslam","jairam","ansari","golu"};
// String check="golu";
// boolean found=false;
// for(String num2:num1){
// if(check==num2){
//     found=true;
//     break;
// }
// }
// if(found){
//     System.out.println("it is present:");
// }
// else{
//     System.out.println("it is not present:");
// }
//  System.out.println("length of array:"+num1.length);
    
//p-3 find the average of marks

//   float[]marks={4.5f,6.8f,3.5f,5.7f,33.5f};
//          float sum=0;
//          for(float element:marks){
//              sum=sum+element;
//          }
//          System.out.println("average of marks:"+sum/marks.length);
//          System.out.println("array of length:"+marks.length);
        
//p-4 add of two matrix[][]
   
// int[][]marks1={{2,3,4},
//               {1,5,6}};
// int[][]marks2={{3,5,7},
//                {2,3,4}};
// int[][]result={{0,0,0},
//                {0,0,0}};               
// for(int i=0;i<marks1.length;i++){
// for(int j=0;j<marks1[i].length;j++){ 
//     System.out.format("setting value:\ni=%d j=%d:\n",i,j);
//     result[i][j]=marks1[i][j]+marks2[i][j];   
// } 
// }              
// for(int i=0;i<marks1.length;i++){
// for(int j=0;j<marks1[i].length;j++){ 
//     System.out.print(result[i][j]+" ");
//      result[i][j]=marks1[i][j]+marks2[i][j];   
// } 
//  System.out.println("");
  
//p-5 reverse array

// int[]arr={1,2,3,4,5,6};
// int length=arr.length;
// int n=arr.length/2;
// int temp;
// for(int i=0;i<n;i++){
// temp=arr[i];
// arr[i]=arr[length-i-1];
// arr[length-i-1]=temp;
// }
// System.out.println("reverse array:");
// for(int element:arr){
//     System.out.print(element+" ");

//p-6 find the maximum number in array

// int[]arr={43,54,200,64,76,78};
// int max=0;
// for(int element:arr){
//     if(element>max){
//         max=element;
//     }
// }
//         System.out.println("maximum value in the array:"+max);

//p-7  find minimum value in the array

// int[]arr={43,-54,-200,64,-76,78};
// int min=-1;
// for(int element:arr){
//     if(element<min){
//         min=element;
//     }
// }
//         System.out.println("maximum value in the array:"+min);

//p-8 

int[]arr={1,2,3,4,5,6};
boolean sorted=true;
for(int i=0;i<arr.length-1;i++){
if(arr[i]>arr[i+1]){
    sorted=false;
    break;
}
}
if(sorted){
    System.out.println("it is sorted:");
}
else{
    System.out.println("it is not sorted:");
}
}
}

