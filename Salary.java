
package salary;

import java.util.Scanner;

public class Salary  {
    public void name() {
        Scanner sp = new Scanner(System.in);
        System.out.print(" Enter the name :");
        String name = sp.nextLine();
    }

    public int productpurch() {
        Scanner sp = new Scanner(System.in);
        System.out.print(" Enter the no of products purchased :");
        int x = sp.nextInt();
        return (x);
    }

    public int price(int noofpro) {
        Scanner sp = new Scanner(System.in);
        int y[]=new int[noofpro];
         int[] z = new int[noofpro];
         for(int i=0;i<noofpro;i++){
        System.out.print(" Enter the price of product :");
         y[i] = sp.nextInt();
         System.out.print(" Enter the quantity :");
         z[i] = sp.nextInt();
         }
         int a[]=new int[noofpro];
		 for(int j=0;j<noofpro;j++){
		 a[j]=y[j]*z[j];
		 }
		 int sum=0;
		 for(int i : a){
		 sum+=i;
		 }
		 return(sum);
    } 
    
 public void totcost(int s){
double x= (s/10000.0)*100;
System.out.print("the % of salary spent :"+x);
 }
 
    public static void main(String[] args) {
       Salary sl=new Salary();
	   sl.name();
        int noofpro=sl.productpurch();
        int s=sl.price(noofpro);
		sl.totcost(s);
		
    }

}
