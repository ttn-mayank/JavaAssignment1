import java.util.*;

public class Quest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose option:");
		System.out.println("1. Calculate Area of Circle");
		System.out.println("2. Calculate Circumference of a Circle");
		System.out.println("3. Exit.");
		int opt = sc.nextInt();
		
		
		double r;
		switch(opt) {
		case 1: System.out.println("Enter radius of circle: ");
				r = sc.nextFloat();
				System.out.println(3.14*r*r);
				break;
		case 2: System.out.println("Enter radius of circle: ");
				r = sc.nextFloat();
				System.out.println(2*3.14*r);
				break;
		case 3: System.exit(1);
				
		default: System.out.println("Choose Valid Option");
		}
		
		}while(true);
		
		
	}

}
