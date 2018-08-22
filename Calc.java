import java.util.*;
import java.io.*;

 public class Calc{

  public static void main(String[] args) {
  
   
   Scanner Sc = new Scanner(System.in);
   System.out.println("Enter Two Numbers :");
   
   double n1, n2, n3,n4,n5,n6;
   n1 = Sc.nextDouble();
   n2 = Sc.nextDouble();
   n3 = n1 + n2;
   n4 = n1 - n2;
   n5 = n1 * n2;
   n6 = n1 / n2;
   
   System.out.println("Total = " + n3);
   System.out.println("Total = " + n4);
   System.out.println("Total = " + n5);
   System.out.println("Total = " + n6);
   
  }
}
	
	