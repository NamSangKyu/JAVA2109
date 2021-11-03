package file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteMain {

	public static void main(String[] args) {
		FileWriter fw = null;
		PrintWriter pw = null;

		try {
			//파일을 매번 새로 생성
			//fw = new FileWriter("write.txt");
			//파일 추가모드로 열기 - 파일이 없으면 자동으로 생성
			fw = new FileWriter("write.txt", true);
			pw = new PrintWriter(fw);

			pw.println("Hello World");
			pw.println("안녕하세요");
			pw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pw != null)
					pw.close();
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
