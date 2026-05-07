import java.util.*;

class employe{    //p-1 
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public String setname(String n){
        return n;
    }

}

 public class chapter8 {
     public static void main(String[]args){
        employe obj=new employe();
        obj.salary=45000;
        System.out.println("employe of salary:"+obj.salary);
        obj.name="aslam";
        System.out.println("employe of name:"+obj.name);
     }
    }

//p-2 

class cellphone{
public void ring(){
    System.out.println("cellphone is ringing:");
}
public void vivrate(){
    System.out.println("cellphone is vivrating:");
} 
public void call(){
    System.out.println("calling of kaif by cellphone:");
}
}

 public class chapter8 {
     public static void main(String[]args){
    cellphone obj=new cellphone();
    obj.ring();
    obj.vivrate();
    obj.call();
     }
    }

//p-3

class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
 public class chapter8 {
     public static void main(String[]args){
        square obj=new square();
        obj.side=3;
        System.out.println("area:"+obj.area());
        System.out.println("perimeter:"+obj.perimeter());
     }
    }
 
//p-4

class rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
 public class chapter8 {
     public static void main(String[]args){
        rectangle obj=new rectangle();
        obj.length=5;
         obj.breadth=4;
        System.out.println("area:"+obj.area());
       System.out.print("perimeter:"+obj.perimeter());
     }
    }

//p-5

class game{
    public void ansari(){
System.out.println("pro player:");
    }
    public void play(){
        System.out.println("killing the enemy:");
    }
    public void win(){
        System.out.println("winner ansari:");
    }
}
 public class chapter8 {
   public static void main(String[]args){
    System.out.println("free fire:");
    game player=new game();
    player.ansari();
    player.play();
    player.win();
   }
}
   
 //p-6

 class circle{
    float pai;
    float radius;
    public float area(){
        return pai*radius*radius;
    }
    public float perimeter(){
        return 2*pai*radius;
    }
 }
 public class chapter8 {
 public static void main(String[]args){
    circle obj=new circle();
    obj.pai=3.14f;
    obj.radius=3.0f;
    System.out.println("circle of area:"+obj.area());
    System.out.println("perimeter:"+obj.perimeter());
 }
}
