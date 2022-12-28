import java.io.*;
import java.net.*;
public class TcpServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocket ss=new ServerSocket(8088);
		System.out.println("server is ready!");
		Socket ls=ss.accept();
		System.out.println("Client Port is "+ls.getPort());
		//READING DATA FROM CLIENT
		InputStream is=ls.getInputStream();
		byte data[]=new byte[50];
		is.read(data);
		String mfc=new String(data);
		//mfc: message from client
		System.out.println("Message from client :"+mfc);
		mfc=mfc.trim();
		String mfs="Hello "+mfc;
		//SENDING MSG TO CLIENT
		OutputStream os=ls.getOutputStream();
		os.write(mfs.getBytes());
	}
}
