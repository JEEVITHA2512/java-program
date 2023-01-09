import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
        Scanner sc=new Scanner(System.in);
      	int s= sc.nextInt();
        int l= sc.nextInt();
        int b= sc.nextInt();
        double r=sc.nextDouble();
        double n = (3.14*r*r)*100;
      	System.out.println(s*s);
      	System.out.println(l*b);
      	System.out.printf("%.2f",Math.floor(n)*0.01);
    }
}