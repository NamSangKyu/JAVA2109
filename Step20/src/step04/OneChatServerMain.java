package step04;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class OneChatServerMain {

	public static void main(String[] args) {
		ServerSocket server =null;
		Socket client = null;
		PrintWriter pw = null;
		Scanner sc = new Scanner(System.in);

		try {
			server = new ServerSocket(1234);
			client = server.accept();
			//스레드 실행
			ReceiveMessageWorker worker = new ReceiveMessageWorker(client);
			worker.start();
			 
			pw = new PrintWriter(client.getOutputStream());
			
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











