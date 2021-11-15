package pro1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator extends JFrame { // Client-based calculator
		private static float USD_RATE= 	1124.70F;
		private static float JPY_RATE = 10.113F;
		private static float CNY_RATE = 163.30F;
		private static float GBP_RATE = 1444.35F;
		private static float EUR_RATE = 1295.97F;
		// exchange rate
		
		JLabel title = new JLabel("USD");
		JTextField operand1 = new JTextField(10);
		String[] opExpression = {"Choice","USD", "JPY", "CNY","GBP","EUR"};
		JComboBox<String> opSelection = new JComboBox<String>(opExpression);
		JTextField txtResult = new JTextField(10);
		JButton btnClear = new JButton("Re-input");
		// The components of the screen
		
		
		public Calculator() { //constructor
			Container contentPane = this.getContentPane();
			contentPane.setLayout(new FlowLayout());
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.pack();
			this.setVisible(true);
		}
		
		private void startFrame(){ //Screen settings
			opSelection.addActionListener(new SelectionHandler());
			btnClear.addActionListener(new SelectionHandler());
			this.setTitle("Calculating the exchange rate");
			this.add(title);
			this.add(operand1);
			this.add(opSelection);
			this.add(txtResult);
			this.add(btnClear);
			this.setSize(700,200);
			
		}
		
		class SelectionHandler implements ActionListener{ //Handler & Listener
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==opSelection){
					calculate();
				}else if(e.getSource()==btnClear){
					init(); 
				}
				
			}
		}

		private void calculate(){ //Result
			float won=Float.parseFloat(operand1.getText());
			String result=null;
			String operator=opSelection.getSelectedItem().toString();
			if(operator.equals("USD")){
				result=String.format("%.6f",won/USD_RATE);
			}else if(operator.equals("JYP")){
				result=String.format("%.6f",won/JPY_RATE);
			}else if(operator.equals("CNY")){
				result=String.format("%.6f",won/CNY_RATE);
			}else if(operator.equals("GBP")) {
				result=String.format("%.6f",won/GBP_RATE);
			}else if(operator.equals("EUR")) {
				result=String.format("%.6f",won/EUR_RATE);
			}
			txtResult.setText(result);
		}
		
		private void init(){ //Init
			operand1.setText("");
			txtResult.setText("");
		}
		
	public static void main(String[] args) { //Main
		// TODO Auto-generated method stub
		Calculator calc=new Calculator();
		calc.startFrame();
	}

}	//	Simple Calculator program using Java internal components
