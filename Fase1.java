package Abc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Fase1 extends JFrame {
	
	ImageIcon fundo = new ImageIcon(getClass().getResource("f1.png"));
	JLabel imagem = new JLabel(fundo);
	JTextField AI = new JTextField();
	JTextField EI = new JTextField();
	JTextField OI = new JTextField();
	JTextField UI = new JTextField();
	JTextField EU = new JTextField();
	Font fonte = new Font("Arial", Font.BOLD,30);
	JButton vrfcc = new JButton(new ImageIcon("Imagens\\vrfcc.png"));
	
	public Fase1 () {
		setTitle("1");
		setSize(650,410);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		AI.setBounds(40,235,70,70);
		AI.setFont(fonte);
		AI.setBackground(new Color(71, 60, 139));
		AI.setForeground(new Color(255, 250, 250));
		AI.setBorder(new LineBorder(new Color(148,0,211)));
		
		EI.setBounds(155,235,70,70);
		EI.setFont(fonte);
		EI.setBackground(new Color(71, 60, 139));
		EI.setForeground(new Color(255, 250, 250));
		EI.setBorder(new LineBorder(new Color(148,0,211)));
		
		OI.setBounds(275,235,70,70);
		OI.setFont(fonte);
		OI.setBackground(new Color(71, 60, 139));
		OI.setForeground(new Color(255, 250, 250));
		OI.setBorder(new LineBorder(new Color(148,0,211)));
		
		UI.setBounds(399,235,70,70);
		UI.setFont(fonte);
		UI.setBackground(new Color(71, 60, 139));
		UI.setForeground(new Color(255, 250, 250));
		UI.setBorder(new LineBorder(new Color(148,0,211)));
		
		EU.setBounds(525,235,70,70);
		EU.setFont(fonte);
		EU.setBackground(new Color(71, 60, 139));
		EU.setForeground(new Color(255, 250, 250));
		EU.setBorder(new LineBorder(new Color(148,0,211)));
		
		vrfcc = new JButton(new ImageIcon("Imagens\\vrfcc.png")); 
		vrfcc.setBounds(235, 320, 150, 45);
	    vrfcc.setBorderPainted(false);
	    vrfcc.setFocusable(false);
	    vrfcc.setContentAreaFilled(false);
	    vrfcc.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent act) {
	            String a = AI.getText();
	            String b = EI.getText();
	            String c = OI.getText();
	            String d = UI.getText();
	            String e = EU.getText();	            
			if(a.equalsIgnoreCase("AI")) {
			if(b.equalsIgnoreCase("EI")) {
			if(c.equalsIgnoreCase("OI")) {
			if(d.equalsIgnoreCase("UI")) {
			if(e.equalsIgnoreCase("EU")) {	
			
	       //JOptionPane.showMessageDialog(new Avaliacao() ,"Parabéns! Você acertou." );
				new Avaliacao1();
			}
			}
	        }
	        }
	        }else {
	            	//JOptionPane.showMessageDialog(null, "Poxa! Você errou");
	            	new TenteNova2();
	            }
	        }
	    });
	    
		add(vrfcc);
		add(AI);
		add(EI);
		add(OI);
		add(UI);
		add(EU);
		add(imagem);
	}
	
	public static void main (String [] args) {
		new Fase1();
	}

}
