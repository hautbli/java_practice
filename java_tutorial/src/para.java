
import java.util.Scanner;

public class para {

	public static void main(String[] args) {
	
		int[][] arr;
		int num = 1; // 시작수
		int size = 0;
		int y = 0; //y축
		int x = 0; //x축
		
		System.out.print("사이즈 : ");
		
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		
		x = size / 2;
		
		arr = new int[size][size];
		
		while(num <= size * size) {
			arr[y][x] = num;
			if(num % size == 0) {
				y++;
			}else {
				y--;
				x++;
			}
			
			if(y < 0) {
				y = size - 1;
			}
			if(x >= size) {
				x = 0;
			}
			num++;
		}
		for(int i = 0; i < size; i++) {		
			for(int j = 0; j < size; j++) {
				System.out.printf("%02d ", arr[i][j]);
			}
			System.out.println();
		}
		/*int[][] arr;
		Scanner sc = new Scanner(System.in);

		System.out.print("마방진 사이즈");
		int c = sc.nextInt();

		arr = new int[c][c];
		int x = 0;
		int y = 0;
		int center = c / 2;

		for (int i = 1; i <= c * c; i++) {
			
			arr[x][center] = i;

			if (i % c == 0) {
				x++;
			} else {
				x--;
				y++;
			}
			if (x < 0) {
				x = c - 1;
			}
			if (y < 0) {
				y = c - 1;
			}
			if (x >= c) {
				x = 0;
			}
			if (y >= c) {
				y = 0;
			}
		}
		for(int i = 0; i < c; i++) {
			for(int j = 0; j < c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}*/
		
		
		
		
	}

}
