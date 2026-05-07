// class cylinder{   //p-1,2   use of getter and setter
//     private int radius;
//     private int height;
//     public int getRadius(){
//         return radius;
//     }
//     public  void setRadius(int radius){
// this.radius=radius;
//     }
//     public int getHeight(){
//         return height;
//     }
//     public void setHeight(int height){
// this.height=height;
//     }
//     public double area(){
//         return 2*3.14*radius*radius+2*radius*height;
//     }
//     public double volume(){
//         return 3.14*radius*radius*height;
//     }
// }

//  public class chapter9 {
//  public static void main(){
//     cylinder obj=new cylinder();
//     obj.setRadius(12);
//     System.out.println("radius:"+obj.getRadius());
//     obj.setHeight(9);
//     System.out.println("height:"+obj.getHeight());
//     System.out.println("area:"+obj.area());
//     System.out.println("volume:"+obj.volume());
//  }
// }

// //p-3 use of constructor with parameter pass
    
// class cylinder{
//     private int radius;
//     private int height;
//     public int getRadius(){
// return radius;
//     }
//     public int getHeight(){
//         return height;
//     }
//     public cylinder(int radius,int height){
// this.radius=radius;
// this.height=height;
//     }
//     public double area(){
//         return 2*3.14*radius*radius+2*radius*height;
//     }
//     public double volume(){
//         return 3.14*radius*radius*height;
//     }
// }
//  public class chapter9 {
//  public static void main(){
//     cylinder obj=new cylinder(9,12);
//     System.out.println("radius:"+obj.getRadius());
//     System.out.println("height:"+obj.getHeight());
//     System.out.println("area:"+obj.area());
//     System.out.println("volume:"+obj.volume());
//  }
// }


// //p-4 overload constructor and custom parameter

// class rectangle{
//     private int length;
//     private int breath;
//     public int getLength(){
//         return length;
//     }
//     public int getBreath(){
//         return breath;
//     }
//     public rectangle(){
//         this.length=4;
//         this.breath=5;
//     }
//     public rectangle(int length,int breath){
//         this.length=length;
//         this.breath=breath;
//   }
// }
//  public class chapter9 {
// public static void main(){
//     rectangle obj=new rectangle(8,9);
//     System.out.println("length:"+obj.getLength());
//     System.out.println("breath:"+obj.getBreath());
//     }
// }

// //p-5 same like p-1
// class sphere{
//     private int radius;
//     public int getRadius(){
// return radius;
//     }
//     public sphere(int radius){
// this.radius=radius;
//     }
//     public double area(){
//         return 4*3.14*radius*radius;
//     }
//     public double volume(){
//         return 1.33*3.14*radius*radius*radius;
//     }
// }
//  public class chapter9 {
//  public static void main(){
//     sphere obj=new sphere(5);
//     System.out.println("radius:"+obj.getRadius());
//     System.out.println("area:"+obj.area());
//     System.out.println("volume:"+obj.volume());
//  }
// }
