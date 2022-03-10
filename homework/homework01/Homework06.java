package homework01;

public class Homework06 {

	public static void main(String[] args) {
		
		int i = 0;
		while('A' + i <= 'Z') {
			char alphabet = (char)('A' + i);
			System.out.println(alphabet);
			i++;
		}
		
		int j = 0;
		while('a' + j <= 'z') {
			char alphabet = (char)('a' + j);
			System.out.println(alphabet);
			j++;
		}
		System.out.println("개수 ? " + (i + j));
	}
}
