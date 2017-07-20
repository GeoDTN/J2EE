package sock;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MioServer {
	private int porta;
	private ServerSocket serverSck;
	public MioServer(int port)
	{
		this.porta = port;
	}
	
	public void avviaServer()throws IOException
	{
		// apro una porta TCP
		serverSck = new ServerSocket(porta);
		System.out.println("Server pronto sulla porta: " + porta);
		// attesa di una connessione
		Socket socket = serverSck.accept();
		System.out.println("Ricevuta connessione client");
		// apro gli stream di input e output per leggere
		// e scrivere nella connessione
		Scanner in = new Scanner(socket.getInputStream());
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		// leggo e scrivo nella connessione fino a quando non
		// ricevo "uscita"
		while (true)
		{
			String line = in.nextLine();
			if (line.equals("uscita"))
			{
				break;
			}
			else
			{
				out.println("Ricevuto:" + line);
				out.flush();
				System.out.println("Dato " + line);
			}
		}
		// chiudo gli stream e il socket
		System.out.println("Chiusura socket");
		in.close();
		out.close();
		socket.close();
		serverSck.close();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MioServer myserver = new MioServer(1337);
		MioServer myserver = new MioServer(1234);
		try
		{
			myserver.avviaServer();
		}
		catch (IOException e)
		{
			System.err.println(e.getMessage());
		}
	}

}
