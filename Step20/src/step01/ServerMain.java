package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket client = null;
		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			// 1. 서버 오픈
			server = new ServerSocket(1234);
			// 2. 클라이언트 접속
			client = server.accept();
			// 3. 스트림 초기화
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());
			// 4. 입출력
			// 클라이언트로부터 메세지를 받은 후 클라이언트에게 메세지 전송
			String msg = br.readLine();
			System.out.println(msg);
			pw.println("서버가 보낸 메세지");
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 5. close
				if (br != null)br.close();
				if (pw != null)pw.close();
				if (client != null) client.close();
				if (server != null) server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
