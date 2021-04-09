/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova.pkg1.parte.i;

import java.awt.Color;
import static java.awt.Color.blue;
import static java.awt.Color.pink;
import static java.awt.Color.red;
import static java.awt.Color.white;
import static java.awt.Color.yellow;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javafx.scene.paint.Color.color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.event.MouseInputAdapter;

/**
 *
 * @author carolayne
 */
public class Jogo extends JFrame {

    private Baralho baralho;
    private Jogador jogadorUm;
    private Jogador jogadorDois;
    private Jogador jogadorDaVez;
    private CartaBaralho cartaAtualJogadorUm;
    private CartaBaralho cartaAtualJogadorDois;
    private Integer totalJogadas;
    private Integer pontosJogadorUm;
    private Integer pontosJogadorDois;
    private int numeroDeVitoriaJUm;
    private int numeroDeVitoriaJDois;

    // panels
    private JPanel panel;
    private JPanel mainPanel;
    private JPanel menuPanel;

    // buttons
    private JButton botao1;
    private JButton botao2;
    private JButton botao3;
    private JButton botao4;
    private JButton botao5;
    private JButton botao6;
    private JButton botao7;
    private JButton botao8;
    private JButton botao9;
    private JButton botao10;
    private JButton jogarNovamente;

    public JTextField pontuacaoJogadorUm;
    public JTextField pontuacaoJogadorDois;
    public JTextField placarJogadorUm;
    public JTextField placarJogadorDois;

    /**
     * Creates new form Jogo
     */
    public Jogo() {

        this.baralho = new Baralho();
        this.jogadorUm = new Jogador("Carolayne", baralho.puxarMao());
        this.jogadorDois = new Jogador("Carol", baralho.puxarMao());
        this.jogadorDaVez = jogadorUm;
        this.totalJogadas = 0;
        this.pontosJogadorUm = 0;
        this.pontosJogadorDois = 0;

        this.panel = new JPanel();
        this.panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        this.mainPanel = new JPanel();
        this.mainPanel.setLayout(new GridLayout(2, 5, 30, 30));

        this.menuPanel = new JPanel();
        this.menuPanel.setLayout(new FlowLayout());

        JLabel labelPontuacaoJogadorUm = new JLabel("Jogador UM");
        JLabel labelPontuacaoJogadorDois = new JLabel("Jogador DOIS");

        JLabel labelPlacarJogadorUm = new JLabel("PLACAR JOGADOR UM");
        JLabel labelPlacarJogadorDois = new JLabel("PLACAR JOGADOR DOIS");

        this.pontuacaoJogadorUm = new JTextField(0);
        this.pontuacaoJogadorUm.setColumns(25);
        this.pontuacaoJogadorUm.setEditable(false);
        this.pontuacaoJogadorDois = new JTextField(0);
        this.pontuacaoJogadorDois.setColumns(25);
        this.pontuacaoJogadorDois.setEditable(false);

        this.placarJogadorUm = new JTextField(0);
        this.placarJogadorUm.setColumns(5);
        this.placarJogadorUm.setEditable(false);

        this.placarJogadorDois = new JTextField(0);
        this.placarJogadorDois.setColumns(5);
        this.placarJogadorDois.setEditable(false);

        this.botao1 = new JButton();
        this.botao2 = new JButton();
        this.botao3 = new JButton();
        this.botao4 = new JButton();
        this.botao5 = new JButton();
        this.botao6 = new JButton();
        this.botao7 = new JButton();
        this.botao8 = new JButton();
        this.botao9 = new JButton();
        this.botao10 = new JButton();
        this.jogarNovamente = new JButton("Jogar Novamente");

        this.botao1.addActionListener((ActionEvent e) -> {
            if (botao1.getIcon() == null && jogadorDaVez.equals(jogadorUm)) {
                botao1.setIcon(this.jogadorUm.getMao().get(0).getImagem());
                cartaAtualJogadorUm = this.jogadorUm.getMao().get(0);
                jogadorDaVez = jogadorDois;
                this.totalJogadas++;
                if (totalJogadas % 2 == 0) {
                    calcularPontos();
                }
            }
        });

        this.botao2.addActionListener((ActionEvent e) -> {
            if (botao2.getIcon() == null && jogadorDaVez.equals(jogadorUm)) {
                botao2.setIcon(this.jogadorUm.getMao().get(1).getImagem());
                cartaAtualJogadorUm = this.jogadorUm.getMao().get(1);
                jogadorDaVez = jogadorDois;
                this.totalJogadas++;
                if (totalJogadas % 2 == 0) {
                    calcularPontos();
                }
            }
        });

        this.botao3.addActionListener((ActionEvent e) -> {
            if (botao3.getIcon() == null && jogadorDaVez.equals(jogadorUm)) {
                botao3.setIcon(this.jogadorUm.getMao().get(2).getImagem());
                cartaAtualJogadorUm = this.jogadorUm.getMao().get(2);
                jogadorDaVez = jogadorDois;
                this.totalJogadas++;
                if (totalJogadas % 2 == 0) {
                    calcularPontos();
                }
            }
        });

        this.botao4.addActionListener((ActionEvent e) -> {
            if (botao4.getIcon() == null && jogadorDaVez.equals(jogadorUm)) {
                botao4.setIcon(this.jogadorUm.getMao().get(3).getImagem());
                cartaAtualJogadorUm = this.jogadorUm.getMao().get(3);
                jogadorDaVez = jogadorDois;
                this.totalJogadas++;
                if (totalJogadas % 2 == 0) {
                    calcularPontos();
                }
            }
        });

        this.botao5.addActionListener((ActionEvent e) -> {
            if (botao5.getIcon() == null && jogadorDaVez.equals(jogadorUm)) {
                botao5.setIcon(this.jogadorUm.getMao().get(4).getImagem());
                cartaAtualJogadorUm = this.jogadorUm.getMao().get(4);
                jogadorDaVez = jogadorDois;
                this.totalJogadas++;
                if (totalJogadas % 2 == 0) {
                    calcularPontos();
                }
            }
        });

        this.botao6.addActionListener((ActionEvent e) -> {
            if (botao6.getIcon() == null && jogadorDaVez.equals(jogadorDois)) {
                botao6.setIcon(this.jogadorDois.getMao().get(0).getImagem());
                cartaAtualJogadorDois = this.jogadorDois.getMao().get(0);
                jogadorDaVez = jogadorUm;
                this.totalJogadas++;
                if (totalJogadas % 2 == 0) {
                    calcularPontos();
                }
            }
        });

        this.botao7.addActionListener((ActionEvent e) -> {
            if (botao7.getIcon() == null && jogadorDaVez.equals(jogadorDois)) {
                botao7.setIcon(this.jogadorDois.getMao().get(1).getImagem());
                cartaAtualJogadorDois = this.jogadorDois.getMao().get(1);
                jogadorDaVez = jogadorUm;
                this.totalJogadas++;
                if (totalJogadas % 2 == 0) {
                    calcularPontos();
                }
            }
        });

        this.botao8.addActionListener((ActionEvent e) -> {
            if (botao8.getIcon() == null && jogadorDaVez.equals(jogadorDois)) {
                botao8.setIcon(this.jogadorDois.getMao().get(2).getImagem());
                cartaAtualJogadorDois = this.jogadorDois.getMao().get(2);
                jogadorDaVez = jogadorUm;
                this.totalJogadas++;
                if (totalJogadas % 2 == 0) {
                    calcularPontos();
                }
            }
        });

        this.botao9.addActionListener((ActionEvent e) -> {
            if (botao9.getIcon() == null && jogadorDaVez.equals(jogadorDois)) {
                botao9.setIcon(this.jogadorDois.getMao().get(3).getImagem());
                cartaAtualJogadorDois = this.jogadorDois.getMao().get(3);
                jogadorDaVez = jogadorUm;
                this.totalJogadas++;
                if (totalJogadas % 2 == 0) {
                    calcularPontos();
                }
            }
        });

        this.botao10.addActionListener((ActionEvent e) -> {
            if (botao10.getIcon() == null && jogadorDaVez.equals(jogadorDois)) {
                botao10.setIcon(this.jogadorDois.getMao().get(4).getImagem());
                cartaAtualJogadorDois = this.jogadorDois.getMao().get(4);
                jogadorDaVez = jogadorUm;
                this.totalJogadas++;
                if (totalJogadas % 2 == 0) {
                    calcularPontos();
                }
            }
        });

        this.jogarNovamente.addActionListener((ActionEvent e) -> {
            reiniciar();
        });

        // mainPanel
        this.mainPanel.add(botao1);
        this.mainPanel.add(botao2);
        this.mainPanel.add(botao3);
        this.mainPanel.add(botao4);
        this.mainPanel.add(botao5);
        this.mainPanel.add(botao6);
        this.mainPanel.add(botao7);
        this.mainPanel.add(botao8);
        this.mainPanel.add(botao9);
        this.mainPanel.add(botao10);

        // menuPanel
        this.menuPanel.add(labelPontuacaoJogadorUm);
        this.menuPanel.add(pontuacaoJogadorUm);
        this.menuPanel.add(labelPontuacaoJogadorDois);
        this.menuPanel.add(pontuacaoJogadorDois);

        this.menuPanel.add(jogarNovamente);

        this.menuPanel.add(labelPlacarJogadorUm);
        this.menuPanel.add(placarJogadorUm);
        this.menuPanel.add(labelPlacarJogadorDois);
        this.menuPanel.add(placarJogadorDois);

        this.panel.add(mainPanel);
        this.panel.add(menuPanel);
        this.add(panel);
    }

    public void reiniciar() {
        this.baralho = new Baralho();
        this.jogadorUm.setMao(baralho.puxarMao());
        this.jogadorDois.setMao(baralho.puxarMao());
        this.jogadorDaVez = jogadorUm;
        this.totalJogadas = 0;
        this.pontosJogadorUm = 0;
        this.pontosJogadorDois = 0;

        this.pontuacaoJogadorUm.setText("0");
        this.pontuacaoJogadorDois.setText("0");
//        this.placarJogadorUm.setText("0");
//        this.placarJogadorDois.setText("0");

        this.botao1.setIcon(null);
        this.botao2.setIcon(null);
        this.botao3.setIcon(null);
        this.botao4.setIcon(null);
        this.botao5.setIcon(null);
        this.botao6.setIcon(null);
        this.botao7.setIcon(null);
        this.botao8.setIcon(null);
        this.botao9.setIcon(null);
        this.botao10.setIcon(null);
//        
        botao1.setForeground(white);
        botao2.setForeground(white);
        botao3.setForeground(white);
        botao4.setForeground(white);
        botao5.setForeground(white);

        botao6.setForeground(white);
        botao7.setForeground(white);
        botao8.setForeground(white);
        botao9.setForeground(white);
        botao10.setForeground(white);

    }

    public void calcularPontos() {
        Integer pontosCartaUm = this.cartaAtualJogadorUm.getCarta().getPontos();
        Integer pontosCartaDois = this.cartaAtualJogadorDois.getCarta().getPontos();;

        if (pontosCartaUm > pontosCartaDois) {
            this.pontosJogadorUm += (pontosCartaUm + pontosCartaDois);
        } else if (pontosCartaUm < pontosCartaDois) {
            this.pontosJogadorDois += (pontosCartaUm + pontosCartaDois);
        }

        this.pontuacaoJogadorUm.setText(this.pontosJogadorUm.toString());
        this.pontuacaoJogadorDois.setText(this.pontosJogadorDois.toString());

        if (this.totalJogadas == 10) {
            if (this.pontosJogadorUm > this.pontosJogadorDois) {
                JOptionPane.showMessageDialog(this, "Jogador UM");
//                botao1.setBackground(pink);
//                botao2.setBackground(pink);
//                botao3.setBackground(pink);
//                botao4.setBackground(pink);
//                botao5.setBackground(pink);

            } else if (this.pontosJogadorUm < this.pontosJogadorDois) {
                JOptionPane.showMessageDialog(this, "Jogador DOIS");
//                botao6.setBackground(pink);
//                botao7.setBackground(pink);
//                botao8.setBackground(pink);
//                botao9.setBackground(pink);
//                botao10.setBackground(pink);
            } else {
                JOptionPane.showMessageDialog(this, "EMPATE");
            }

            if (this.pontosJogadorUm > this.pontosJogadorDois) {
                this.numeroDeVitoriaJUm++;
                this.placarJogadorUm.setText(String.valueOf(numeroDeVitoriaJUm));

            } else if (this.pontosJogadorUm < this.pontosJogadorDois) {
                this.numeroDeVitoriaJDois++;
                this.placarJogadorDois.setText(String.valueOf(numeroDeVitoriaJDois));
            } else {

            }

        }

    }

    public static void main(String args[]) {
        Jogo jogo = new Jogo();
        jogo.setSize(1000, 1000);
        jogo.setVisible(true);

    }
}
