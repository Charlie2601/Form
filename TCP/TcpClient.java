import java.io.*;
import java.net.*;
public class TcpClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("connecting to server");
		Socket cs=new Socket("localhost",8088);
		BufferedReader br=new BufferedReader(new InputStreamReader( System.in));
		System.out.println("The Local Port "+cs.getLocalPort()+"\nThe Remote Port"+cs.getPort());
		System.out.println("The Local socket is "+cs);
		System.out.println("Enter your name");
		String str=br.readLine();
		//SENDING DATA TO SERVER
		OutputStream os=cs.getOutputStream();
		os.write(str.getBytes());
		//READING DATA FROM SERVER
		InputStream is=cs.getInputStream();
		byte data[]=new byte[50];
		is.read(data);
		//PRINTING MESSAGE ON CLIENT CONSOLE
		String mfs=new String(data);
		mfs=mfs.trim();
		System.out.println("Message from Server: " +mfs);
	}
}
