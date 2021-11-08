package step03;

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
				if (msg == null || msg.equals("exit"))
					break;
				pw.println(msg);
				pw.flush();
			}
			System.out.println("클라이언트가 접속을 종료하였습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (br != null)br.close();
				if (pw != null)pw.close();
				if (client != null) client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
