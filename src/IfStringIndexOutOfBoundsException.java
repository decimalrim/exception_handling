
public class IfStringIndexOutOfBoundsException {
	
	public static void main(String[] args) {
		
		String logoFilePath = "C:\\images\\logo.png";
		/*
		 * logoFilePath 인스턴스에서 logo.png만 추출해 출력해보세요.
		 */
		// substring + indexOf + lastIndexOf		
		int lastIndexOfBackslash = logoFilePath.lastIndexOf("\\") + 1;
		String fileName = logoFilePath.substring(lastIndexOfBackslash);
		System.out.println(fileName);
				
		/*
		 * logoFilePath 인스턴스에서 "images"만 추출해 출력해보세요.
		 */
		int indexOfImages = logoFilePath.indexOf("images");
		String directoryName = logoFilePath.substring(indexOfImages, lastIndexOfBackslash -1);
		System.out.println(directoryName);
		
		
		/*
		 * logoFilePath 인스턴스에서 "user_images"만 추출해 출력해보세요.
		 */
		if (logoFilePath.contains("user_images")) {
			int indexOfUserImages = logoFilePath.indexOf("user_images");
			directoryName = logoFilePath.substring(indexOfUserImages, lastIndexOfBackslash -1);
			System.out.println(directoryName);
		}
//		int user_images = logoFilePath.indexOf("user_images");
//		System.out.println();		
				
		/*
		 * logoFilePath 인스턴스에서 확장자("png")만 추출해 출력해보세요.
		 */
				
		int png = logoFilePath.lastIndexOf(".") +1;
		String fileName4 = logoFilePath.substring(png);
		System.out.println(fileName4);
		
				
		String downloadFilePath = "C:\\images\\logo";
		
		/*
		 * downloadFilePath 인스턴스에서 파일의 확장자를 추출해 출력해보세요.
		 */
		if (downloadFilePath.contains(".")) {
		png = downloadFilePath.lastIndexOf(".") +1;
		fileName4 = downloadFilePath.substring(png);
		System.out.println(fileName4);
		}
	}	
	

}
