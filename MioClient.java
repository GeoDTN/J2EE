package sock;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MioClient {
	private String ip;
	private int porta;
	/**
	 * @param args
	 */
	public MioClient(String ip, int port) 
	{
		this.ip = ip;
		this.porta = port;
	}
	
	public void startClient() throws IOException
	{
		Socket socket = new Socket(ip, porta);
		System.out.println("Connessione effettuata");
		Scanner socketIn = new Scanner(socket.getInputStream());
		PrintWriter socketOut = new PrintWriter(socket.getOutputStream());
		Scanner stdin = new Scanner(System.in);
		try
		{
			while (true)
			{
				String inputData = stdin.nextLine();
				socketOut.println(inputData);
				socketOut.flush();
				String socketData = socketIn.nextLine();
				System.out.println(socketData);
			}
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Connessione chiusa");
		}
		finally
		{
			stdin.close();
			socketIn.close();
			socketOut.close();
			socket.close();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MioClient client = new MioClient("127.0.0.1",1337);
		MioClient client = new MioClient("127.0.0.1",1234);
		try {
			client.startClient();
		}
		catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

}
