
public class Gugudan {
	public static void main(String[] args) {
		int[] result = new int[100]; // 100개의 값을 받는 int형 배열 생성 
		int num=0; // 배열의 순서를 담을 변수
		for(int i=2; i<10; i++) { 
			for(int j=1; j<10; j++) {
				result[num] = i * j;
				num++;		
			}
		}
		
		for(int i=0; i < num; i++) {
			System.out.println(result[i]);
		}
	}
}
