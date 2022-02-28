package switchcampaign;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		

				Scanner sc = new Scanner(System.in);
				System.out.println("enter a rows and cols");
				int a_rows = sc.nextInt();
				int a_col = sc.nextInt();
				System.out.println("enter b rows and cols");
				int b_rows = sc.nextInt();
				int b_col = sc.nextInt();
				
				int a[][] = new int[a_rows][a_col];
				int b[][] = new int[b_rows][b_col];
				
				if(a_col==b_rows) {
				System.out.println("enter a mat");
					for(int i=0;i<a_rows;i++) {
						for(int j=0;j<a_col;j++) {
							a[i][j] = sc.nextInt();
						}
					}
					System.out.println("enter b mat");
					for(int i=0;i<b_rows;i++) {
						for(int j=0;j<b_col;j++) {
							b[i][j] = sc.nextInt();
						}
					}
					
					int c[][] = new int[a_rows][b_col];
					for(int i=0;i<a_rows;i++) {
						for(int j=0;j<b_col;j++) {
							for(int k=0;k<a_col;k++) {
						c[i][j] = c[i][j] + a[i][k]*b[k][j]; 
						}
				}

			}
					for(int i=0;i<a_rows;i++) {
						for(int j=0;j<b_col;j++) {
							System.out.print(c[i][j] + " ");
						}
						System.out.println("");
					
				}}
				else System.out.println("bhagg");
			}

		

	

}
