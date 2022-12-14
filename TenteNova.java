package Abc;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TenteNova extends JFrame {
	
	ImageIcon imagem = new ImageIcon(getClass().getResource("tente.png"));
	ImageIcon pr?ximo = new ImageIcon(getClass().getResource("Proximo.png"));
	ImageIcon voltar = new ImageIcon(getClass().getResource("voltara.png"));
	JLabel fundo = new JLabel(imagem);
	JButton prxm = new JButton(pr?ximo);
	JButton vltr = new JButton(voltar);
	public TenteNova() {
		setTitle("2");
		setSize(650,410);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		prxm.setBounds(400, 215, 120, 40);
		prxm.setBorderPainted(false);
        prxm.setFocusable(false);
        prxm.setContentAreaFilled(false);
        prxm.addActionListener(
        		new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        		new Fase3();
        		
        }
        		});;
        		
        vltr.setBounds(280, 200, 120, 40);
        vltr.setBorderPainted(false);
        vltr.setFocusable(false);
        vltr.setContentAreaFilled(false);
        vltr.addActionListener(
        		new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        		new Fase2();
        		
        }
        		});;
		
		
		add(prxm);
		add(vltr);
		add(fundo);
		
	}
	public static void main (String[]args) {
		new TenteNova();
	}
}