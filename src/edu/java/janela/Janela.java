package edu.java.janela;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Janela {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Minha primeira janela gráfica");
		JPanel painel = new JPanel();
		JLabel lblGostoJava = new JLabel("Eu gosto de Java ...");

		painel.add(lblGostoJava);
		janela.setContentPane(painel);
		
		janela.setSize(400, 200);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
