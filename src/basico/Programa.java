package basico;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Programa implements ActionListener {
	 JFrame janela = new JFrame(); //JFrame chamado janela
	 JPanel painel1 = new JPanel(); //Criado um painel 
	 JPanel painel2 =new JPanel();
	 JLabel rotulo1 = new JLabel("Painel 1", JLabel.CENTER);
	 JLabel rotulo2 = new JLabel("Painel 2", JLabel.CENTER);
	 
	 //Criamos dois botoes e um painel para alterar entre os paineis
	 JPanel painelSelecao = new JPanel();
	 JButton botao1 = new JButton("Painel 1");
	 JButton botao2 = new JButton("Painel 2");
	 JButton botao3 = new JButton("Painel 3");
	 
	 //criamos o painelCard que será gerenciado pelo CardLayout
	 JPanel painelCard = new JPanel();
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Programa();

	}
	 private Programa() {
		 janela.setTitle("Exemplo de um CardLayout");
		 janela.setSize(300,200);
		 janela.setLocation(50,50);
		 janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 janela.setLayout(new BorderLayout());
		 
		 painelSelecao.setLayout(new GridLayout(1,2));
		 painelSelecao.add(botao1);
		 painelSelecao.add(botao2);
		 painel1.add(rotulo1);
		 painel2.add(rotulo2);
		 
		 painelCard.setLayout(new CardLayout());
		 painelCard.add(painel1,"p1");
		 painelCard.add(painel2,"p2");
		 
		 //adiciona os paineis a janela
		 janela.add("North", painelSelecao);
		 janela.add("East", painelCard);
		 
		 //registra os botoes para tratarmos os eventos por eles
		 botao1.addActionListener(this);
		 botao2.addActionListener(this);
		 
		 janela.setVisible(true);
		 
		 
		 
		 
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		CardLayout cl = (CardLayout) painelCard.getLayout();
		if (e.getSource()==botao1) {
			cl.show(painelCard, "p1");
		}
		if (e.getSource()== botao2) {
			 cl.show(painelCard, "p2");
		}
		  
		
	}

}
