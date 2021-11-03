package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileCopy1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		String fileName=JOptionPane.showInputDialog("파일명을 입력하세요");
		
		try {
			fis = new FileInputStream("img.jpg");
			fos = new FileOutputStream(fileName);
			
			while(true) {
				int buf = fis.read();
				if(buf == -1) break;
				fos.write(buf);
			}
			System.out.println("파일 복사 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null)fis.close();
				if(fos != null)fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}






