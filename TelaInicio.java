package Abc;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.io.File;

//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class TelaInicio extends JFrame {
	

		ImageIcon imagem = new ImageIcon(getClass().getResource("TelaInicial.png"));
		ImageIcon ibotao = new ImageIcon(getClass().getResource("Group 2.png"));
		JLabel label = new JLabel(imagem);
		JButton botao = new JButton(ibotao);
		JButton botaosair = new JButton();
		
		
	public TelaInicio() {
		
		setTitle("AbcPlay");
		setSize(650,410);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		botao.setBounds(250, 250, 125, 40);
		botao.setBorderPainted(false);
        botao.setFocusable(false);
        botao.setContentAreaFilled(false);
        
        botao.addActionListener(
        		new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        		new Fases();
        		//dispose();
        }
        		});;
		
		botaosair.setBounds(580, -1, 50, 40);
		botaosair.setBorderPainted(false);
	    botaosair.setFocusable(false);
	    botaosair.setContentAreaFilled(false);
	    botaosair.addActionListener(
				new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					 System.exit(0);
				}
			});
	    
	    add(botaosair);
        add(botao);
		add(label);
		
	}

	public static void main (String [] args) {
		new TelaInicio();
	/*	File music = new File("\"C:\\Users\\nacor\\Downloads\\musiquinha.wav\"");
		PlaySound(music);*/
	}
	
	/*static void PlaySound(File Sound) {
		try {
			Clip music = AudioSystem.getClip();
			music.open(AudioSystem.getAudioInputStream(Sound));
			music.start();
			Thread.sleep(music.getMicrosecondLength()/1000);
		}catch(Exception e) {
			
		}*/
	}
	


