package homework02;

public class Homework07 {

	public static void main(String[] args) {
		
		for(int dan =2; dan <= 9; dan+=3) {
			for(int i=1; i<=9; i++) {
				for(int j=0; j<3; j++) {
					if(dan+j<10) {
						System.out.printf("%d * %d = %2d  ",dan+j,i,dan*i);
					}
				}
				System.out.println();
			}
		}
	}
}
