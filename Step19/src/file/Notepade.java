package file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Notepade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String fileName = null;
		System.out.print("파일명 입력 : ");
		fileName = sc.nextLine();
		
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter(fileName,true);
			pw = new PrintWriter(fw);
			
			while(true) {
				System.out.print("내용 입력 : ");
				String str = sc.nextLine();
				if(str.equals("exit")) break;
				pw.println(str);
				pw.flush();
			}
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			pw.println(sdf.format(cal.getTime())+" 저장");
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
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





