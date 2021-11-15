package pro1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RateClient extends JFrame{ // Client side
	JLabel title = new JLabel("Won");
	JTextField operand1 = new JTextField(10);
	String[] opExpression = {"Choice","USD", "JPY", "CNY","GBP","EUR"};
	JComboBox<String> opSelection = new JComboBox<String>(opExpression);
	JTextField txtResult = new JTextField(10);
	JButton btnClear = new JButton("Re-input");
	
	public RateClient() { //constructor
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}

	private void startFrame(){  //Screen settings
		opSelection.addActionListener(new SelectionHandler());
		btnClear.addActionListener(new SelectionHandler());
		this.setTitle("Client Program");
		this.add(operand1);
		this.add(opSelection);
		this.add(txtResult);
		this.add(btnClear);
		this.setSize(700,200);
		
	}
	
	class SelectionHandler implements ActionListener{  //Handler & Listener 
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==opSelection){
				calculate();
			}else if(e.getSource()==btnClear){
			  init();
			}
			
		}
	}
	
	private void init(){ // Init
		operand1.setText("");
		txtResult.setText("");
	}
	
	private void calculate(){ // Client input & output 
		float won=Integer.parseInt(operand1.getText());
		String result=null;
		String operator=opSelection.getSelectedItem().toString();
		
		 InputStream is;
		 BufferedReader br;
		 BufferedWriter bw;
		 OutputStream os;
		 PrintWriter pw=null;
		 
		try{ // Connecting Server 
			Socket s1=new Socket("127.0.0.1",5434);
			os = s1.getOutputStream();
			is=s1.getInputStream();
			System.out.println("Transmition data:"+won+","+operator);
			
			
			bw = new BufferedWriter(new OutputStreamWriter(os));
			pw=new PrintWriter(bw,true);
		    pw.println(won+","+operator);
		    
		    br=new BufferedReader(new InputStreamReader(is));
			result=br.readLine();
			System.out.println("Client reception data:"+result);
			txtResult.setText(result);
			s1.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) { //Main
		// TODO Auto-generated method stub
		RateClient calc=new RateClient();
		calc.startFrame();
	}

}	// Responsible for only the visual part of the calculator
