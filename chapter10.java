class circle{   //p-1 or 3
    public int radius;
    circle(int r){
    this.radius=r;
    }
    public double area(){
        System.out.println("area:");
        return 3.14*radius*radius;
    }
    }
class cylinder extends circle{
public int height;
cylinder(int r,int h){
super(r);
}
public double volume(){
    System.out.println("volume:");
    return 3.14*this.radius*this.radius*this.height;
}
}
public class chapter10 {
 public static void main(String[]args){
    cylinder obj=new cylinder(2,5);
    System.out.println(obj.area());
   System.out.println(obj.volume());
}   
}

p-2

class rectangle{
    public int length;
    public int breath;
    public int area(int l,int b){
        this.length=l;
        this.breath=b;
        System.out.println("area:");
        return length*breath;
    }
}
class cubic extends rectangle{
    public int perimeter(int l,int b){
        this.length=l;
        this.breath=2;
        System.out.println("perimeter:");
        return 2*(length+breath);
    }
    cubic(int l,int b){
        this.length=l;
        this.breath=b;
    }
}
public class chapter10 {
public static void main(String[]args){
cubic obj=new cubic(2,3);
System.out.println(obj.area(2,3));
System.out.println(obj.perimeter(2,3));
}
}

//p-4 

class Rectangle {
    int length;
    int breadth;

    public int area() {
        return length * breadth;
    }
}

class Cubic extends Rectangle {
    public int perimeter() {
        return 2 * (length + breadth);
    }

    Cubic(int l, int b) {
        this.length = l;
        this.breadth = b;
    }
}

public class Chapter10{
    public static void main(String[] args) {
        Cubic obj = new Cubic(2, 4);
        System.out.println("Area: " + obj.area());
        System.out.println("Perimeter: " + obj.perimeter());
    }
}

p-5 inheritance hiererchy

class base1{
    base1(){
        int a=5;
        int b=6;
        int sum=a+b;
        System.out.print("sum:"+sum);
    }
}
    class drive1 extends base1{
        drive1(){
            int a=8;
            int b=4;
            int sub=a-b;
            System.out.print("subtract:"+sub);
        }
    }
    class drive2 extends drive1{
        drive2(){
            int a=5;
            int b=2;
            int mult=a*b;
            System.out.println("multiply:"+mult);
        }
    }
    public class chapter10{
        public static void main(String[] args){
            drive2 obj=new drive2();
        }
}
