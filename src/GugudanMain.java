
public class GugudanMain {
	public static void main(String[] args) {		
		for(int i=2; i<10; i++) {
			int[] result = Gugudan.calculate(i); // 다른 클래스에서 따온 것은 앞에 클래스 명을 붙여줌
			Gugudan.print(result);
		}
	}
}
