package step04;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class OneChatClientMain {

	public static void main(String[] args) {
		Socket server = null;
		PrintWriter pw = null;
		Scanner sc = new Scanner(System.in);

		try {
			server = new Socket("127.0.0.1",1234);
			//스레드 실행
			ReceiveMessageWorker worker = new ReceiveMessageWorker(server);
			worker.start();
			 
			pw = new PrintWriter(server.getOutputStream());
			
			while(true) {
				System.out.println("메세지 입력>");
				String msg = sc.nextLine();
				pw.println(msg);
				pw.flush();
				if(msg.equals("exit")) break;
			}
			worker.stop();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}











