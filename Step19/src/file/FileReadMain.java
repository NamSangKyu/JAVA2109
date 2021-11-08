package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadMain {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		 
		try {
			fr = new FileReader("gisa.txt");
			br = new BufferedReader(fr);
			String str = null;
			
			while(true) {
				str = br.readLine();
				if(str == null) break;
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null)br.close();
				if(fr != null)fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
