import java.util.Scanner;

public class Gugudan_hw2 {
	public static void main(String[] args) {
		// 숫자를 number 변수에 입력 받음
		System.out.println("구구단의 숫자 두 개를 입력하세요(n,m) : ");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		
		for(int i=2; i<=first; i++) { 
			int[] result = new int[second];
			for(int j=0; j<second; j++) {
				result[j] = i * (j+1);
				System.out.println(result[j]);	
			}		
		}
		
		
	}
}
