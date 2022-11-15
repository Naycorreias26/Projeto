package Abc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class Fase2 extends JFrame {
	
	
	
	ImageIcon fundo = new ImageIcon(getClass().getResource("Fase2.png"));
	JLabel imagem = new JLabel(fundo);
	JTextField bola = new JTextField();
	JTextField loja = new JTextField();
	JTextField boca = new JTextField();
	JButton vrfcc = new JButton(new ImageIcon("Imagens\\vrfcc.png"));
	Font fonte = new Font("Arial", Font.BOLD,30);
	
	
	public Fase2() {
		setTitle("2");
		setSize(650,410);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		vrfcc = new JButton(new ImageIcon("Imagens\\vrfcc.png"));
		
		bola.setBounds(200, 59, 150, 55);
		bola.setFont(fonte);
		bola.setBackground(new Color(71, 60, 139));
		bola.setForeground(new Color(255, 250, 250));
		bola.setBorder(new LineBorder(new Color(148,0,211)));
		
		loja.setBounds(200, 129, 150, 55);
		loja.setFont(fonte);
		loja.setBackground(new Color(71, 60, 139));
		loja.setForeground(new Color(255, 250, 250));
		loja.setBorder(new LineBorder(new Color(148,0,211)));
		
		
		boca.setBounds(200, 204, 150, 55);
		boca.setFont(fonte);
		boca.setBackground(new Color(71, 60, 139));
		boca.setForeground(new Color(255, 250, 250));
		boca.setBorder(new LineBorder(new Color(148,0,211)));
		
	    vrfcc.setBounds(270, 270, 150, 45);
	    vrfcc.setBorderPainted(false);
	    vrfcc.setFocusable(false);
	    vrfcc.setContentAreaFilled(false);
	        		
	        
        add(vrfcc);
		add(boca);
		add(loja);
		add(bola);
		add(imagem);
		
		vrfcc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent act) {
            String a = bola.getText();
            String b = loja.getText();
            String c = boca.getText();
		if(a.equalsIgnoreCase("bola")){
		if(b.equalsIgnoreCase("loja")) {
		if(c.equalsIgnoreCase("boca")) {
       //JOptionPane.showMessageDialog(new Avaliacao() ,"Parabéns! Você acertou." );
			new Avaliacao();
            }
        }
        }else {
            	//JOptionPane.showMessageDialog(null, "Poxa! Você errou");
            	new TenteNova();
            }
        }
    });
	}
	
   
		public static void main(String []args) {
			new Fase2();
		}
	}
	

