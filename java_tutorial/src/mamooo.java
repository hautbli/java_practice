import java.util.Scanner;

public class mamooo {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.println("������ ũ��");
    int d = in.nextInt();
     // �� �ﰢ��
    	
        for(int i=0; i<d/2; i++) {
    	   for (int j=0; j<d/2-i;j++) {
    		System.out.print(" ");
    	   }
    	   for (int j=0; j<2*i+1; j++) {
    		System.out.print("*");
    	   }
    	    System.out.println();
    }     
        
        //�Ʒ� �ﰢ�� 
        for(int i=d/2; i>=0; i--) {
     	   for (int j=0; j<d/2-i;j++) {
     		System.out.print(" ");
     	   }
     	   for (int j=0; j<2*i+1; j++) {
     		System.out.print("*");
     	   }
     	    System.out.println();
     }  
        
        
        
     
    }
		
	}


