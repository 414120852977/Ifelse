
public class Random {
	public static void main(String[] args) {
		int max=999;
		int min=100;
		
		System.out.println("1st Random Number: " + max+ "to" +min+ ":");  
		
		int b = (int)(Math.random()*(max-min+1)+min);  
		System.out.println(b);  
System.out.println("2st Random Number: " + max+ "to" +min+ ":");  
		
		int c = (int)(Math.random()*(max-min+1)+min);  
		System.out.println(c);  
	
	System.out.println("3st Random Number: " + max+ "to" +min+ ":");  
	
	int d = (int)(Math.random()*(max-min+1)+min);  
	System.out.println(d);
	if(b>c && b>d){
		System.out.println("greater random number is:"+b);
	
	}
	else if(c>b && c>d){
		System.out.println("greater is :"+c);
	}
	else{
		System.out.println("greater is :"+d);
	}

}
}
