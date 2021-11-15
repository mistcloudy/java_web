package pro1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class RateServer { //Server side
	private static float USD_RATE= 1124.70F;
	private static float JPY_RATE = 10.11F;
	private static float CNY_RATE = 163.30F;
	private static float GBP_RATE = 1444.35F;
	private static float EUR_RATE = 1295.97F;
	
	public static void main(String[] args) { // Main 
		// TODO Auto-generated method stub
		InputStream is;
		BufferedReader br;
		BufferedWriter bw;
		PrintWriter pw=null;
		OutputStream os;
		ServerSocket serverSocket;
		Socket s1=null;
		String ipAddrs=null;
		String inMessage=null;
		float outMessage=0f;
		
		try{ //Server input & output
			serverSocket= new ServerSocket(5434);
			System.out.println("Server is running...");
			
			while(true){
				//When recognizing the client's connection, the accept() method is called to create a socket object.
				s1= serverSocket.accept();
				is=s1.getInputStream();
				os = s1.getOutputStream();
				br=new BufferedReader(new InputStreamReader(is));
				String data=br.readLine();
				System.out.println("Server reception data:"+data);
				String result=calculate(data);
				System.out.println(result);
				
				
				bw = new BufferedWriter(new OutputStreamWriter(os));
				pw=new PrintWriter(bw,true);
				pw.println(result);
				pw.close();
			}
		}catch(IOException ie){
			ie.printStackTrace();
		}
	}
	
	private static  String calculate(String data){ //Result
		String []token=data.split(",");
		
		float won=Float.parseFloat(token[0]);
		String operator=token[1];
		String result=null;
		if(operator.equals("USD")){
			result=String.format("%.6f",won/USD_RATE);
		}else if(operator.equals("JPY")){
			result=String.format("%.6f",won/JPY_RATE);
		}else if(operator.equals("CNY")){
			result=String.format("%.6f",won/CNY_RATE);
		}else if(operator.equals("GBP")) {
			result=String.format("%.6f",won/GBP_RATE);
		}else if(operator.equals("EUR")) {
			result=String.format("%.6f",won/EUR_RATE);
		}
		
		return result;
		
	}	
} //Responsible for only the functional part of the calculator