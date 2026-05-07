
import java.util.*;
import java.util.Random;

class pubg{
   public int number;
    public int inputnumber;
   public int noguess=0;
    public int getnoguess(){
        return noguess;
    }
    public int setnoguess(int noguess){
        return noguess=noguess; 
    }
    pubg(){
        System.out.println("guess the number:");
        Random rand=new Random();
        this.number=rand.nextInt(100);
       // System.out.println(number);
    }
    public void takeinput(){
        Scanner sc=new Scanner(System.in);
        inputnumber=sc.nextInt();
    }
    boolean correctnumber(){
        noguess++;
    if(inputnumber==number){
        System.out.format("yes you are guessed%\n%d",number,inputnumber);
        return true;
    }
    else if(inputnumber<number){
        System.out.println("Too low...");
    }
    else if(inputnumber>number){
        System.out.println("Too high...");
    }
        return false;
    }
    }
public class game {
 public static void main(String[]args){
    boolean b=false;
    while(!b){
    pubg obj=new pubg();
    obj.takeinput();
    b=obj.correctnumber();
    System.out.println(b);
    }
 }   
}
