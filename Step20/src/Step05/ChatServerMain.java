package Step05;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServerMain {
	public static ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();
	public static void main(String[] args) {
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(1234);
			
			while(true) {
				//클라이언트 접속을 받고, 스레드 생성 후 실행
				Socket client = server.accept();
				System.out.println(client.getInetAddress() + "님이 접속하셨습니다." );
				ServerWorker worker = new ServerWorker(client);
				worker.start();
				list.add(worker);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//모든 클라이언트에게 메세지를 뿌리는 부분
	public static void broadCasting(String msg) {
		for(int i=0;i<list.size();i++)
			list.get(i).sendMessage(msg);
	}

}




