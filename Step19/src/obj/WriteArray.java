package obj;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class WriteArray {

	public static void main(String[] args) {
		Person[] arr = new Person[5];
		for(int i=0;i<arr.length;i++) {
			String name = JOptionPane.showInputDialog("이름 입력하세요");
			int age = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요"));
			arr[i] = new Person(name, age, 0);
		}
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("person_list.txt");
			oos = new ObjectOutputStream(fos);
			for(int i=0;i<arr.length;i++) {
				oos.writeObject(arr[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos != null)fos.close();
				if(oos!= null)oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}








