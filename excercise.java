package index1;
import java.util.Scanner;
public class excercise {
public static void main(String[] args) {
	
	//arithmatic
	// int
	Scanner obj=new Scanner(System.in);
	int a,b,sum;
	System.out.println("enter the value of (a)");
	a= obj.nextInt();
	System.out.println("enter the value of(b)");
	b= obj.nextInt();
	sum =a+b;
	System.out.println("enter the total value" + sum);
	// float
	Scanner obj1=new Scanner(System.in);
	float c,d , sum1;
	System.out.println("enter the first value(c)");
	c=obj1.nextFloat();
	System.out.println("enter the second value of (b)");
	d= obj1.nextFloat();
	sum1=c+d;
	System.out.println("total is"+ sum1);
	
	Scanner obj2=new Scanner(System.in);
	double e,f, sum2;
	System.out.println("enter the first valueof(e)");
	e=obj2.nextDouble();
	System.out.println("enter the second value of(d)");
	f= obj2.nextDouble();
	sum2=e+f;
	System.out.println("the total value is"+ sum2);
	
	
	
	Scanner obj3=new Scanner(System.in);
	int k,l,sum3;
	System.out.println("enter the value of (k)");
	k= obj3.nextInt();
	System.out.println("enter the value of(l)");
	l= obj3.nextInt();
	sum3 =k-l;
	System.out.println("enter the total value" + sum3);
	// float
	Scanner obj4=new Scanner(System.in);
	float u,v, sum4;
	System.out.println("enter the first value(u)");
	u=obj1.nextFloat();
	System.out.println("enter the second value of (v)");
	v= obj4.nextFloat();
	sum4=u-v;
	System.out.println("total is"+ sum4);
	
	Scanner obj5=new Scanner(System.in);
	double p,q, sum5;
	System.out.println("enter the first valueof(p)");
	p=obj5.nextDouble();
	System.out.println("enter the second value of(q)");
	q= obj5.nextDouble();
	sum5=p-q;
	System.out.println("the total value is"+ sum5);
	
	
}
}
