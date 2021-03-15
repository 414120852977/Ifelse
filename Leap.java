import java.util.Scanner;
public class Leap {
	public static void main(String[] args) {
		System.out.println("Enter a year to find leap year or not :");
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		if((y%400==0) && (y%100==0)|| (y%4==0)){
			System.out.println("year is leap");
		}
		else{
			System.out.println("not a leap year");
		}
	}

}