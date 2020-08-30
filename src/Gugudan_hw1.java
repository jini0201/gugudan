import java.util.Scanner;

public class Gugudan_hw1 {
	public static void main(String[] args) {			
		// 숫자를 number 변수에 입력 받음
		System.out.println("구구단의 마지막 단을 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		// number에 입력된 숫자까지 구구단 실행 
		// 2*1, 2*2, ... , 2*number, ... , number*1, ... , number*number
		for(int i=2; i<=number; i++) { 
			int[] result = new int[number];
			for(int j=0; j<number; j++) {
				result[j] = i * (j+1);
				System.out.println(result[j]);	
			}		
		}	
		
	}
}
