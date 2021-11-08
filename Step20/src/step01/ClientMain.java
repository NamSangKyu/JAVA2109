package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) {
		Socket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			// 1. 서버 접속 - 아이피 주소, 포트번호
			server = new Socket("127.0.0.1", 1234);
			// 2. 스트림 초기화
			br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			pw = new PrintWriter(server.getOutputStream());
			// 3. 데이터 입출력
			pw.println("클라이언트가 보낸 메세지");
			pw.flush();
			String msg = br.readLine();
			System.out.println(msg);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 4. close
				if (br != null)br.close();
				if (pw != null)pw.close();
				if (server != null)server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
