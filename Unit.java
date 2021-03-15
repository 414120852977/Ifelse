import java.util.Scanner;
public class Unit {
	public static void main(String[] args) {
		System.out.println("Enter a number unit digit any one 1 or 10 or 100 or 1000 to day term :");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x==1){
			System.out.println("one");
		}
		else if(x==10){
			System.out.println("ten");
		}
		else if(x==100){
			System.out.println("hundred");
		}
		else{
			System.out.println("one thousand");
		}
	}

}