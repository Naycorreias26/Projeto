package Abc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class Fase4 extends JFrame {
	
	ImageIcon imagem = new ImageIcon(getClass().getResource("f4.png"));
	JLabel fundo = new JLabel(imagem);
	TextField caixa1 = new TextField();
	TextField caixa2 = new TextField();
	TextField caixa3 = new TextField();
	Font fonte = new Font("", Font.BOLD,45);
	JButton vrfcc = new JButton(new ImageIcon("Imagens\\vrfcc.png"));
	
	public Fase4() {
		setTitle("4");
		setSize(650,410);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		caixa1.setBounds(30,200,150,70);
		caixa1.setBackground(new Color(0,191,255));
		caixa1.setFont(fonte);
		caixa1.setForeground(new Color(255, 250, 250));
		
		
		caixa2.setBounds(250,200,150,70);
		caixa2.setBackground(new Color(0,191,255));
		caixa2.setFont(fonte);
		caixa2.setForeground(new Color(255, 250, 250));
		
		caixa3.setBounds(450,200,150,70);
		caixa3.setBackground(new Color(0,191,255));
		caixa3.setFont(fonte);
		caixa3.setForeground(new Color(255, 250, 250));
		

		vrfcc = new JButton(new ImageIcon("Imagens\\vrfcc.png"));
		vrfcc.setBounds(235, 320, 150, 45);
	    vrfcc.setBorderPainted(false);
	    vrfcc.setFocusable(false);
	    vrfcc.setContentAreaFilled(false);
	    vrfcc.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent act) {
	            String a = caixa1.getText();
	            String b = caixa2.getText();
	            String c = caixa3.getText();
			if(a.equalsIgnoreCase("bolo")){
			if(b.equalsIgnoreCase("pato")) {
			if(c.equalsIgnoreCase("dado")) {
	       //JOptionPane.showMessageDialog(new Avaliacao() ,"Parabéns! Você acertou." );
				new Avaliacao4();
	            }
	        }
	        }else {
	            	//JOptionPane.showMessageDialog(null, "Poxa! Você errou");
	        	new TenteNova4();
	            }
	        }
	    });
	    
		add(vrfcc);
		add(caixa3);
		add(caixa2);
		add(caixa1);
		add(fundo);
	}
	
	public static void main(String [] args) {
		
		new Fase4();
		
	}

}