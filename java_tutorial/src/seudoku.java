import java.util.Scanner;

public class seudoku {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("스도쿠 크기");
	    int n = in.nextInt();
		int i,j = 0;
	    int [][] num = new int [n][n];
	
	    
	    //랜덤 뽑기
	   
		
		for (i=0; i<1; i++) {//i는 행
			   
			for (j=0;j<num.length; j++) {// j는 열
				
				num[i][j]= ((int)(Math.random()*n)+1); 
				
				for (int k=0; k<j; k++) { //k는 j보다 작은 열 ->비교
				
					if(i==0 && j==0)
						break;
					
				 while(num[i][j]==num[i][k]) { // [0][1] == [0][0]같으면
					                                   
					num[i][j]= ((int)(Math.random()*n)+1);//[0][1] 다시 랜덤 
					
					   //다르면 출력..
				
				}if (num[i][j]!=num[i][k]) {
					System.out.print(num[i][j] +"'");
				 }  
				 
			}
		}
		} System.out.println();
		
					//if (Arr[i][j]<10) {//숫자 칸수 조절
				    //System.out.print(num [i][j] +"  ");
				
					//}else {
						//System.out.print( [i][j] +" ");
					//}
				
						
		
		
	}
	
}
