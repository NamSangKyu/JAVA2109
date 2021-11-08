package Step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerWorker extends Thread {
	private Socket client;
	private BufferedReader br;
	private PrintWriter pw;

	public ServerWorker(Socket client) {
		this.client = client;
		try {
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				String msg = br.readLine();
				if(msg == null || msg.equals("exit")) break;
				//받은 메세지를 전체 클라이언트에게 뿌림
				ChatServerMain.broadCasting(client.getInetAddress() + 
						"님의 메세지 : " +msg );
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//접속 종료 처리
				System.out.println(client.getInetAddress() + "님이 접속 종료 하였습니다.");
				ChatServerMain.list.remove(this);
				if(client != null) client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void sendMessage(String msg) {
		// 클라이언트에게 메세지 한건 전송
		pw.println(msg);
		pw.flush();
	}
}
