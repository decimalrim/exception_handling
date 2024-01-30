
public class IfNumberFormatException {
	
	public static void main(String[] args) {
		
//		String numString = "123";
//		int num = Integer.parseInt(numString);
//		System.out.println(num); // 123
//		
//		// 숫자가 아닌 값을 숫자로 변경하려 함 - NumberFormatException
//		numString = "ABC";
//		num = Integer.parseInt(numString);
//		System.out.println(num);
		
		//NumberFormatException 방지 방법
		String numString = "123";
		if (numString.matches("^[0-9]+$")) {
			int num = Integer.parseInt(numString);
			System.out.println(num); // 123
		}
		
		numString = "ABC";
		if (numString.matches("^[0-9]+$")) {
			int num = Integer.parseInt(numString);
			System.out.println(num);
		}
		

	}

}
