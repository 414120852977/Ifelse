import java.util.Scanner;
public class Number {
	public static void main(String[] args) {
		System.out.println("enter a first number :");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter the second number:");
		Scanner sd=new Scanner(System.in);
		int b=sd.nextInt();
		System.out.println("Enter the third number:");
		Scanner se=new Scanner(System.in);
		int c=se.nextInt();
		int d;
		int add;
		int mod;
		int mul;
		d=a+b*c;
		System.out.println("result is" +d);
		add=c+a/b;
		System.out.println("result is :" +add);
		mod=a%b+c;
		System.out.println("result is :" +mod);
		mul=a*b+c;
		System.out.println("result is :" +mul);
		if( a>b && a>c){
			System.out.println("greater number is:" +a);
		
			}
		else if(b>a && b>c){
			System.out.println("greater number is:" +b);
		}
		else{
			System.out.println("greater number is:" +c);
		}
		
		
	}

}
