import java.util.Scanner;
public class circle {

	public static void main(String[] args) {
		
    Scanner in = new Scanner (System.in);
	System.out.println("원 반지름 길이");
    int r = in.nextInt();
    int i,j;
    
    
	for(i=0; i < r/2; i++) { //원 위쪽
		for (j=0; j<Math.pow(2,r/2-i-1); j++ ) {
			System.out.print("  ");
		} 
		for (j=0; j<2*r-Math.pow(2,r/2-i)+1; j++ ) {
			System.out.print("* ");
		} 
		System.out.println();
		System.out.println();
	 }
	
	 
	 for(i=r/2; i<r; i++) {// 원 아래쪽
		 for (j=0; j<Math.pow(2,i-r/2); j++) {
			 System.out.print("  ");
		 }
		 for (j=0; j<2*r-Math.pow(2,i-r/2+1)+1; j++ ) {
			 System.out.print("* ");
		 }
		 System.out.println();
		 System.out.println();
	 }          
	 
	 
	
	}

}
