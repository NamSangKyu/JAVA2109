package step03;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiEchoServerMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket client = null;
		
		try {
			server = new ServerSocket(1234);
			
			while(true) {
				System.out.println("클라이언트 접속 대기중....");
				client = server.accept();
				System.out.println(client.getInetAddress() + "님이 접속하셨습니다.");
				ServerWorker worker = new ServerWorker(client);
				worker.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
