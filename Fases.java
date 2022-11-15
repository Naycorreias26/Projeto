package Abc;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fases extends JFrame {

	ImageIcon imagem = new ImageIcon(getClass().getResource("Fases.png"));
	JTable fases;
	Font fonte = new Font("Courier New", Font.BOLD,20);
	JButton botao = new JButton();
	
	//Container tela = new Container();
		public 	JPanel fundoCria;
		public JButton botaoFase1;
		public JButton botaoFase2;
		public JButton botaoFase3;
		public JButton botaoFase4;
		public JButton botaoFase5;
		public JButton botaoFase6;
		public JButton botaoFase7;
		public JButton botaoFase8;
		public JButton botaoFase9;
		public JButton botaoFase10;

	public Fases() {
	    super("Mapa das Fases");
	}
	    Container cont = getContentPane();{
	    cont.setLayout(new BorderLayout());	    
	    //cont.setVisible(false);
	    setSize (650,410);
	    setLayout(null);
	    
	    /*JPanel painel = new JPanel(new FlowLayout()) {
	    	ImageIcon imagem = ImageIcon.getImage();
	    	ImageIcon grayImage = GrayFilter.createDisableImage(imagem);
	    	{
	    		setOpaque(false);
	    	}
	    	public void paint(Graphics g) {
	    		g.drawImage(grayImage,0,0,this);
	    		super.paint(g);
	    	}
	    };
	    /*painel.add(new JLabel(imagem));
	    cont.add(painel, BorderLayout.CENTER);
	    setDefaultCloseOperation(EXIT_ON_CLOSE)*/
	   
	    JPanel fundoCria = new JPanel();
	    JLabel label = new JLabel(imagem);
	    
	    cont.add(fundoCria);
	    fundoCria.add(label);
	    setVisible(true);
	    
	    botao.setBounds(550,15,75,45);
		botao.setBorderPainted(false);
        botao.setFocusable(false);
        botao.setContentAreaFilled(false);
        botao.addActionListener(
        		new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        		new Avatares();
        		
        }
        		});;
	    
	    label.setBounds(10, 10, 650, 410);
	    
	    botaoFase1 = new JButton("1");
	    botaoFase1.setBounds(13, 277, 65, 65);
	    botaoFase1.setFont(fonte);
	    botaoFase1.setContentAreaFilled(false);
	    botaoFase1.setBorderPainted(false);
	    botaoFase1.setFocusPainted(false);
        botaoFase1.addActionListener(
        		new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        		new Fase1();
        		
        		
        }
        		});;

	    
		add(botaoFase1);
	    botaoFase2 = new JButton("2");
	    botaoFase2.setBounds(65, 188, 65, 65);
	    botaoFase2.setFont(fonte);
	    botaoFase2.setContentAreaFilled(false);
	    botaoFase2.setBorderPainted(false);
	    botaoFase2.setFocusPainted(false);
	    botaoFase2.addActionListener(
				new ActionListener() {

				public void actionPerformed(ActionEvent e) {
						new Fase2();
				}
			});  
	    add(botaoFase2);
	    
	    botaoFase3 = new JButton("3");
	    botaoFase3.setBounds(160, 130, 65, 65);
	    botaoFase3.setFont(fonte);
	    botaoFase3.setContentAreaFilled(false);
	    botaoFase3.setBorderPainted(false);
	    botaoFase3.setFocusPainted(false);
	    add(botaoFase3);
	    
	    botaoFase4 = new JButton("4");
	    botaoFase4.setBounds(265, 105, 65, 65);
	    botaoFase4.setFont(fonte);
	    botaoFase4.setContentAreaFilled(false);
	    botaoFase4.setBorderPainted(false);
	    botaoFase4.setFocusPainted(false);
	    add(botaoFase4);
	    
	    botaoFase5 = new JButton("5");
	    botaoFase5.setBounds(310, 20, 65, 65);
	    botaoFase5.setFont(fonte);
	    botaoFase5.setContentAreaFilled(false);
	    botaoFase5.setBorderPainted(false);
	    botaoFase5.setFocusPainted(false);
	    add(botaoFase5);
	    
	    botaoFase6 = new JButton("6");
	    botaoFase6.setBounds(410, 70, 65, 65);
	    botaoFase6.setFont(fonte);
	    botaoFase6.setContentAreaFilled(false);
	    botaoFase6.setBorderPainted(false);
	    botaoFase6.setFocusPainted(false);
	    add(botaoFase6);
	    
	    botaoFase7 = new JButton("7");
	    botaoFase7.setBounds(535, 97, 65, 65);
	    botaoFase7.setFont(fonte);
	    botaoFase7.setContentAreaFilled(false);
	    botaoFase7.setBorderPainted(false);
	    botaoFase7.setFocusPainted(false);
	    add(botaoFase7);
	    
	    botaoFase8 = new JButton("8");
	    botaoFase8.setBounds(500, 183,65, 65);
	    botaoFase8.setFont(fonte);
	    botaoFase8.setContentAreaFilled(false);
	    botaoFase8.setBorderPainted(false);
	    botaoFase8.setFocusPainted(false);
	    add(botaoFase8);
	    
	    botaoFase9 = new JButton("9");
	    botaoFase9.setBounds(400, 220, 65, 65);
	    botaoFase9.setFont(fonte);
	    botaoFase9.setContentAreaFilled(false);
	    botaoFase9.setBorderPainted(false);
	    botaoFase9.setFocusPainted(false);
	    add(botaoFase9);
	    
	    botaoFase10 = new JButton("10");
	    botaoFase10.setBounds(285, 300, 65, 65);
	    botaoFase10.setFont(fonte);
	    botaoFase10.setContentAreaFilled(false);
	    botaoFase10.setBorderPainted(false);
	    botaoFase10.setFocusPainted(false);
	    add(botaoFase10);
	    	
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setSize(650, 410);
	    setVisible(true);
	    setLocationRelativeTo(null);
	    setLayout(new BorderLayout());
	    //cont.add(label);
	    //add(tela);
	    
	    //adicionando elementos ao container
	    add(botao);
	    cont.add(botaoFase1);
	    cont.add(botaoFase2);
	    cont.add(botaoFase3);
	    cont.add(botaoFase4);
	    cont.add(botaoFase5);
	    cont.add(botaoFase6);
	    cont.add(botaoFase7);
	    cont.add(botaoFase8);
	    cont.add(botaoFase9);
	    cont.add(botaoFase10);
	    add(label);
	    criaJanela();
	}
	
	public void criaJanela(){
	}
	
	public static void main(String[] args) {
	    Fases lc  = new Fases();
	    lc.criaJanela();
	}
}
