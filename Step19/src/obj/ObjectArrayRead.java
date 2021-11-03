package obj;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectArrayRead {

	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		ArrayList<Person> list = new ArrayList<Person>();
		try {
			fis = new FileInputStream("person_list.txt");
			ois = new ObjectInputStream(fis);

			try {
				while (true) {
					Person p = (Person) ois.readObject();
					System.out.println(p.toString());
					list.add(p);
				}
			} catch (IOException e) {
				System.out.println("파일 읽기 종료");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}
