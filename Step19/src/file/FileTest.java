package file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File file = null;
		
		file = new File("c:\\test\\test.txt");
		//부모 폴더 경로
		File parentFile = file.getParentFile();
		System.out.println(parentFile.getAbsolutePath());
		
		//파일생성, 파일 생성 전에 해당 경로가 있는지 체크
		if(!parentFile.exists()) {
			parentFile.mkdirs();//해당 경로까지 모든 폴더를 생성
			System.out.println("해당 경로 폴더 생성 완료");
		}
		try {
			boolean result = file.createNewFile();//파일 생성
			System.out.println(result);
			file.delete();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//-----------------------------------------
		File root = new File("c:\\");
		File list[]  = root.listFiles();
		for(File temp : list)
		{
			String fileName = temp.getName();
			long fileSize = temp.length();
			String etc = temp.isDirectory() ? "<DIR>" : "";
			
			String path = String.format("%-30s\t%s\t%dbyte",fileName,etc,fileSize);
				
			System.out.println(path);
		}
	}

}





