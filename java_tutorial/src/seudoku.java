import java.util.Scanner;

public class seudoku {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("������ ũ��");
	    int n = in.nextInt();
		int i,j = 0;
	    int [][] num = new int [n][n];
	
	    
	    //���� �̱�
	   
		
		for (i=0; i<1; i++) {//i�� ��
			   
			for (j=0;j<num.length; j++) {// j�� ��
				
				num[i][j]= ((int)(Math.random()*n)+1); 
				
				for (int k=0; k<j; k++) { //k�� j���� ���� �� ->��
				
					if(i==0 && j==0)
						break;
					
				 while(num[i][j]==num[i][k]) { // [0][1] == [0][0]������
					                                   
					num[i][j]= ((int)(Math.random()*n)+1);//[0][1] �ٽ� ���� 
					
					   //�ٸ��� ���..
				
				}if (num[i][j]!=num[i][k]) {
					System.out.print(num[i][j] +"'");
				 }  
				 
			}
		}
		} System.out.println();
		
					//if (Arr[i][j]<10) {//���� ĭ�� ����
				    //System.out.print(num [i][j] +"  ");
				
					//}else {
						//System.out.print( [i][j] +" ");
					//}
				
						
		
		
	}
	
}
