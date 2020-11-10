import java.util.Scanner;
public class star {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("별 크기 ");
		int n = in.nextInt(); //별 중간 중심 크기
		int i,j;
		
		for (i=1; i<=n/2; i++) {//직각사각형 만들기
			for(j=0; j<n-2; j++) {
				System.out.print("  ");
			}
		    for (j=0; j<n/2-i+1;j++)
		    {   System.out.print("  ");
		    }
		    for (j=0; j<2*i-1; j++) {
		    	System.out.print("* ");
		    }
			
			System.out.println();
			
		}
		//별 중단부
		
		for(i=1; i<n; i++) { 
	     
		for(j=0; j<i-1; j++) {
			System.out.print("  ");
		}
		for (j=0; j<n-i; j++) {
			System.out.print("* ");
		}
		for  (j=0; j<n-1; j++) {
			System.out.print("* ");
			
		}
		for (j=0; j<n-i; j++) {
			System.out.print("* ");
			
		}
		System.out.println();
		}
		
		for (i=1; i<3; i++) {// 별 하단부 사각형
			for(j=0; j<n-2; j++) {
				System.out.print("  ");
			}
			for(j=0; j<=n; j++) {
				System.out.print("* ");
			} 
			System.out.println();
	       }
		for (i=1; i<=n/2; i++) {//하단부 2
			for(j=0; j<n-2; j++) {
				System.out.print("  ");
			}
		    for (j=0; j<=n/2-i; j++) {
		    	System.out.print("* ");
		    }
		    if (n%2==0) {
		    	for(j=0; j<2*i-1; j++ ) {
				     System.out.print("  ");
				    }
		    } else 
		    for(j=0; j<2*i-1; j++ ) {
		     System.out.print("  ");
		    }
		    for (j=0; j<=n/2-i; j++) {
		    	System.out.print("* ");
		    }
		    
		    System.out.println();
		    
		}
		
		
		
	}

}
