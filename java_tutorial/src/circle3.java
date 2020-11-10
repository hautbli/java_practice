import java.util.Scanner;
public class circle3 {

	public static void main(String[] args) {
		 Scanner in = new Scanner (System.in);
			System.out.println("원 반지름 길이");
		    int r = in.nextInt();
		    int i,j;
		    
	       for (i=0; i<=2*r; i++) {
	    	for (j=0; j<=2*r; j++) {
	    		
	         int p = (int)Math.sqrt((i-r)*(i-r)+ (j-r)*(j-r));
	         
	         if (p<=r) {
	        	 System.out.print("*  ");
	         }
	         else {
	        	 System.out.print("   ");
	         }
	      
	    	}   System.out.println();
	       }
		
		
	}

}
