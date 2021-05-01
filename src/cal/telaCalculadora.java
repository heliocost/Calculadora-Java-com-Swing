package cal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


import java.awt.Font;



public class telaCalculadora {

	private JFrame frmCalculadoraEmJava;
	private JTextField text_valor;
	
	private Double n1 = 0.0;
	private Double n2 = 0.0;
	private Double resul = 0.0;
	private String opc = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaCalculadora window = new telaCalculadora();
					
				
					
					window.frmCalculadoraEmJava.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public telaCalculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	FuncoesCalcular ClassCalcular = new FuncoesCalcular();
	
	

	
	private void initialize() {
		frmCalculadoraEmJava = new JFrame();
		frmCalculadoraEmJava.setTitle("Calculadora em Java (Dev. por H\u00E9lio Costa)");
		frmCalculadoraEmJava.setBounds(100, 100, 451, 300);
		frmCalculadoraEmJava.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraEmJava.getContentPane().setLayout(null);
		
		text_valor = new JTextField();
		text_valor.setFont(new Font("Arial Black", Font.BOLD, 16));
		text_valor.setHorizontalAlignment(SwingConstants.RIGHT);
		text_valor.setBounds(42, 30, 351, 32);
		frmCalculadoraEmJava.getContentPane().add(text_valor);
		text_valor.setColumns(10);
		
		
		JButton btnIniciar = new JButton("C");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Click("c");
				
				
				
			}
		});
		
		

		
	
		
		btnIniciar.setBounds(44, 93, 69, 23);
		frmCalculadoraEmJava.getContentPane().add(btnIniciar);
		
		JButton btnSomar = new JButton("+");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Click("+");
			}
		});
		btnSomar.setBounds(134, 93, 69, 23);
		frmCalculadoraEmJava.getContentPane().add(btnSomar);
		
		JButton btnDividir = new JButton("/");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Click("/");
			}
		});
		btnDividir.setBounds(227, 93, 69, 23);
		frmCalculadoraEmJava.getContentPane().add(btnDividir);
		
		
		JButton btnMultiplicar = new JButton("*");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Click("*");
			}
		});
		btnMultiplicar.setBounds(323, 93, 69, 23);
		frmCalculadoraEmJava.getContentPane().add(btnMultiplicar);
		
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Click("9");
			}
		});
		btn9.setBounds(44, 127, 69, 23);
		frmCalculadoraEmJava.getContentPane().add(btn9);
		
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Click("3");
			}
		});
		btn3.setBounds(227, 195, 69, 23);
		frmCalculadoraEmJava.getContentPane().add(btn3);
		
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Click("2");
				
			}
		});
		btn2.setBounds(134, 195, 69, 23);
		frmCalculadoraEmJava.getContentPane().add(btn2);
		
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Click("8");
			}
		});
		btn8.setBounds(134, 127, 69, 23);
		frmCalculadoraEmJava.getContentPane().add(btn8);
		
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Click("4");
				
			}
		});
		btn4.setBounds(227, 161, 69, 23);
		frmCalculadoraEmJava.getContentPane().add(btn4);
		
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Click("1");
				
			}
		});
		btn1.setBounds(44, 195, 69, 23);
		frmCalculadoraEmJava.getContentPane().add(btn1);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Click("7");
				
			}
		});
		btn7.setBounds(227, 127, 69, 23);
		frmCalculadoraEmJava.getContentPane().add(btn7);
		
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Click("5");
			}
		});
		btn5.setBounds(134, 161, 69, 23);
		frmCalculadoraEmJava.getContentPane().add(btn5);
		
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Click("0");
			}
		});
		btnZero.setBounds(134, 229, 69, 23);
		frmCalculadoraEmJava.getContentPane().add(btnZero);
		
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Click("6");
				
			}
		});
		btn6.setBounds(44, 161, 69, 23);
		frmCalculadoraEmJava.getContentPane().add(btn6);
		
		
		JButton btnResult = new JButton("=");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Click("=");
			}
		});
		btnResult.setBounds(323, 161, 69, 57);
		frmCalculadoraEmJava.getContentPane().add(btnResult);
		
		JButton btnSubtrair = new JButton("-");
		btnSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Click("-");
			}
		});
		btnSubtrair.setBounds(324, 127, 69, 23);
		frmCalculadoraEmJava.getContentPane().add(btnSubtrair);
	}
	



	
	
	public void Click(String ValorBtn) {
		
	
		
		
		String p_texto = text_valor.getText();
		
		String texto = p_texto += ValorBtn;
		
		
		if (ValorBtn.equals("c") ) {
			
			text_valor.setText("");
			opc = "";
			n1 = 0.0;
			n2 = 0.0;
			resul = 0.0;
		
			
		}
		
		
		
		else if (ValorBtn.equals("=")) {
			
			System.out.println(""+opc);
			
			
			
			
			if (opc.equals("+")) {
				
				
					String[] textoSeparado = texto.split("=");
					
					
					Double n2 = Double.parseDouble( textoSeparado[0]);
					

					
					
//					Pegando o retorno da soma.
					resul = ClassCalcular.Somar(n1, n2);
					
//					Enserindo o total na tela      /  Class para formatar o resultado
					text_valor.setText( ClassCalcular.FormatarResultado(resul));
					
//					Enserindo total na variaveis valor1
					n1 = resul;	
					
			}else if (opc.equals("-")) {
				
				
//				Separando dados digitado pelo usuario
				String[] textoSeparado = texto.split("=");
				
				
//				Pegando o segundo valor digitado
				Double n2 = Double.parseDouble( textoSeparado[0]);
				
//				Pegando o retorno da subtrair.
				resul = ClassCalcular.Subtrair(n1, n2);
				
//				Enserindo o total na tela      /  Class para formatar o resultado
				text_valor.setText( ClassCalcular.FormatarResultado(resul));
				
//				Enserindo total na variáveis valor1
				n1 = resul;	
				
				
			}else if (opc.equals("/")) {
				
//				Separando dados digitado pelo usuario
				String[] textoSeparado = texto.split("=");
				
//				Pegando o segundo valor digitado
				Double n2 = Double.parseDouble( textoSeparado[0]);		
				
//				Pegando o retorno da Dividir.				
				resul = ClassCalcular.Dividir(n1, n2);
				
//				Enserindo o total na tela      /  Class para formatar o resultado
				text_valor.setText( ClassCalcular.FormatarResultado(resul));
				
//				Enserindo total na variaveis valor1
				n1 = resul;	
				
				
				
			}else if (opc.equals("*")) {
				
//				Separando dados digitado pelo usuario
				String[] textoSeparado = texto.split("=");
				
//				Pegando o segundo valor digitado
				Double n2 = Double.parseDouble( textoSeparado[0]);
//				Pegando o retorno da Mmultiplicação.		
				resul = ClassCalcular.Multiplicar(n1, n2);
				
//				Enserindo o total na tela      /  Class para formatar o resultado
				text_valor.setText( ClassCalcular.FormatarResultado(resul));
				
//				Enserindo total na variaveis valor1
				n1 = resul;	
				
				
				
			}
				
				
		}else {
			
		
		
			
						if (ValorBtn.equals("+")) {
							

							System.out.println("teste n1 "+ n1.toString());
							
							text_valor.setText("");
							
							opc = "+";
							
							
						}else if (ValorBtn.equals("-")) {
							text_valor.setText("");
							opc = "-";
							
							
							
						}else if (ValorBtn.equals("/")) {
							text_valor.setText("");
							opc = "/";
							
							
							
						}else if(ValorBtn.equals("*")) {
							text_valor.setText("");
							opc = "*";
						}
						
						else {
							
							text_valor.setText(texto);
							
								if (opc.equals("+") || opc.equals("-") || opc.equals("/") || opc.equals("*")) {
									
					
								}else {
									n1 = Double.parseDouble(texto);
									
								}

							
							
							
						
							
							
							
						}
						
						
			
			
			
			
			
			
		}
		
		
		
		
		
		
	

		
	}
	
	
}
