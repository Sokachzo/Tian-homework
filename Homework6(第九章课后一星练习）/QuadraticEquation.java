//javaµÚ¾ÅÕÂÒ»ÐÇÏ°Ìâ9.6
import java.util.Scanner;
public class QuadraticEquation {
	
	 private int a;
	    private int b;
	    private int c;
	   public QuadraticEquation (int a,int b,int c){
	     this.a=a;
	     this.b=b;
	     this.c=c;
	    }
	   public int getA(){
	       return a;
	   }
	   public int getB(){
	       return b;
	   }
	   public int getC(){
	       return c;
	   }
	   public int getDiscriminant(){
	       if(b*b-4*a*c>0)
	       return 1;
	       else if(b*b-4*a*c==0)
	       return 0;
	       else 
	       return -1;
	       
	   }
	   public double getRoot1(){
	       return (-b+Math.sqrt(b*b-4*a*c))/(2*a);
	   }
	   public double getRoot2(){
	      return (-b-Math.sqrt(b*b-4*a*c))/(2*a); 
	   }
	    public static void main(String[] args) {
	        // TODO code application logic here
	       
	        Scanner input=new Scanner(System.in);
	        System.out.println("Plese enter a,b,c:");
	        int a=input.nextInt();
	        int b=input.nextInt();
	        int c=input.nextInt();
	        QuadraticEquation x=new  QuadraticEquation(a,b,c);
	        if(1==x.getDiscriminant())
	        { 
	        System.out.println("the root1 is "+ x.getRoot1());
	        System.out.println("the root2 is "+ x.getRoot2());
	        }
	        else if(0==x.getDiscriminant())
	        {
	            System.out.println("the root1 is "+ x.getRoot1());
	        }
	        else
	            System.out.println("the equation has no roots");
	
	}

}
