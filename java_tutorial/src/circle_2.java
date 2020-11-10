import java.util.Scanner;
public class circle_2 {

	public static void main(String[] args) {
		 Scanner in = new Scanner (System.in);
			System.out.println("원 반지름 길이");
		    int r = in.nextInt();

		int i,j;
				
         for (i =-r+1; i<=r; i++) {//반지름x2
    
        	for (j = -r+1; j<r; j++) {
        	
        	 if(i*i+j*j<r*r){	 

		      System.out.print("*  ");
		      }
        	 else {
        	  System.out.print("   ");
        		 
        	 }   
        	 
        	 
		      } System.out.println();
         }
         
		}
	
		}
