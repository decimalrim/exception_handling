
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import exception_handling.exceptions.ReadFailException;

public class TryCatchExam {
	
	// try catch없이 오류 사라지게 하기 = 예외 위임하기
	// 이렇게 코드 쓰면 안된다.
	public static List<String> readFile(File path)  throws IOException {
		return Files.readAllLines(path.toPath());
	}
	
	
	
	public static List<String> readFile2(File path) {
		try {
		return Files.readAllLines(path.toPath());
		}
		catch(IOException ioe) {
			throw new ReadFailException("파일을 읽을 수 없습니다.", ioe);
		} // 실무코드로 가장 좋고 많이 씀
	}
	
	
	
	// try catch 응용
	public static int convertToInt(String str) throws Exception { // throws Exception
		
		try {
		int number = Integer.parseInt(str);
		return number;
	}
	catch(NumberFormatException nfe) {	
		// RuntimeException으로 메인 코드로 던지면 에러 안남
		Exception exception = new Exception(str +"는 숫자로 변환할 수 없습니다.",nfe);
		// throw = 예외를 던진다.
		throw exception; // 예외를 던지고 메소드를 종료시킨다.
//		System.out.println("adfsdfa"); // 위에서 종료되었기 때문에 아래에 코드를 넣을 수 없다.
	}
	finally  { // catch에서 할거 다 하고 throw나오면 잠시 멈추고 finally 무조건 실행 하고 throw처리한다.
		System.out.println("변환이 완료되었습니다.");
	}
//		return 0;
	}
	
	
	
	
	public static void main(String[] args) {
		
		// 시스템 드라이브에서 특정 경로에 있는 파일 또는 폴더를 읽어온다.
		File imageFile = new File("c:\\sadfdasf");
		
//		readFile(imageFile); // try catch 필요함
		readFile2(imageFile);
		
		// throws Exception 위에서 던진걸 받았으니 또 try catch 해야함
		try {
		int num = convertToInt("AAA");
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage()); // "AAA는 숫자로 변환할 수 없습니다."
		}
		
		
		// 파일 내용을 다 읽어서 가져와라
		try {
		Files.readAllLines(imageFile.toPath());
		}
		catch(IOException ioe) {
			String message = ioe.getMessage();
			System.out.println(message);
			
			ioe.printStackTrace();  // 실무에서는 이런 코드 쓰지 말라고함 - 민감한 정보들 때문에
		}
		finally { // 에러가 발생하든 안하든 무조건 실행시켜라
			System.out.println("File을 읽고 finally가 실행되었습니다.");
		}
		
		
		// ctrl + forName 해서 ClassNotFoundException 문제점 찾아서 가져옴
		// 여러가지 예외를 한번에 쓸때 catch를 2번 쓸 수도 있지만 중복 피하기 위해
		// |로 나눠서 한번에 써주기
		try {
		Class.forName("IfArrayIndexOutOfBoundsException2");
		Files.readAllLines(imageFile.toPath());
		}
		catch(ClassNotFoundException | IOException cnfe) {
			String message = cnfe.getMessage();
			System.out.println(message);
			
			// 아주 상세한 예외 목록 (호출 스택)
			cnfe.printStackTrace();
		}
//		catch(IOException ioe) {
//			String message = ioe.getMessage();
//			System.out.println(message);
//			
//			ioe.printStackTrace();
//		} // 중복 피하기 위해 위에서 |로 합쳐서 써주기

	}
}