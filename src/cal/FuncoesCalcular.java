package cal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;


import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;





public class FuncoesCalcular {
	
	
//	Função Somar
	public  Double Somar(Double v1, Double v2) {
		
		return (v1 + v2);
		
	}
		
	
//	Função Subtração
	public Double Subtrair(Double valor1, Double valor2) {

		return (valor1 - valor2);
		
	}
	
//	Função Multiplicação
	public Double Multiplicar(Double valor1, Double valor2) {
		
		return (valor1 * valor2);
		
	}
	
//	Função Divisão
	public Double Dividir(Double valor1, Double valor2) {
		
		return (valor1 / valor2);
		
	}
	
//	Formatando o resultado final
	public String FormatarResultado(Double valor) {
		
		String result = String.format("%.2f", valor);
		
		return ("Resultado " + result);
		
	}
	

}
