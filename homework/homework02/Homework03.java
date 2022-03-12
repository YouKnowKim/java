package homework02;

public class Homework03 {

	public static void main(String[] args) {
		
		int distance=0;
		int hour = 0;
		
		while(distance <100) {
			hour++;
			
			if(distance < 50) {
				distance += 4;
			} else if(distance >= 50){
				distance += 3;
			}
			
			System.out.printf("[%d시간 후] 달팽이가 올라간 총 높이 : %dM \n", hour, distance);
			
		}
	}
}
