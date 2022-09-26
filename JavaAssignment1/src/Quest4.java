import java.util.*;

public class Quest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int r = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int c = sc.nextInt();
		
		int[][] arr = new int[r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.println("Enter A["+i+"]["+j+"]");
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Sum of all elements of each row:");
		for(int i=0;i<r;i++) {
			int sum=0;
			for(int j=0;j<c;j++) {
				sum += arr[i][j];
				System.out.println(sum);
				
			}
		}
		
		System.out.println("Sum of all elements of each column:");
		for(int i=0;i<c;i++) {
			int sum=0;
			for(int j=0;j<r;j++) {
				sum += arr[i][j];
				System.out.print(sum+"\t");
				
			}
		}
		
		
	}

}
