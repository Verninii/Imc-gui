package view;

import model.Imc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TelaImc {
    private JLabel labelTitulo = new JLabel("Índice de Massa Corporal - IMC");
    private JPanel painelTitulo = new JPanel();
    private Random gerador = new Random();
    private JLabel lblPeso = new JLabel("Peso: ");
    private JTextField txtPeso = new JTextField();
    private JLabel lblAltura =  new JLabel("Altura: ");
    private JTextField txtAltura = new JTextField();
    private JLabel lblTituloResultadoImc = new JLabel("Resultado do IMC:");
    private JLabel lblResultadoImc = new JLabel();
    private JLabel lblStatusImc = new JLabel();
    private JButton btnCalcular = new JButton("Calcular");
    private JButton btnLimpar = new JButton("Limpar");

    private String imagePath = "../images/";
    private Icon iconBtnCalcular = new ImageIcon(getClass().getResource(imagePath + "calc2.png"));
    private Icon iconBtnLimpar = new ImageIcon(getClass().getResource(imagePath + "restart24.png"));

    Imc calcularImc = new Imc();

    //metodo construtor metodo igual o nome da classe
    public TelaImc(){
    criarTela();
    }

    public void criarTela(){
        JFrame tela = new JFrame();
        tela.setTitle("Calculadora IMC");
        tela.setSize(500,300);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);     //quando fechar o programa e acaba
        tela.setLayout(null);         //tirar o auxilio do java no layout quando coloca null

        //DEFINIR O PAINEL DE TITULO
        painelTitulo.setBounds(0,0,500,50);
        painelTitulo.setBackground(Color.red);
        painelTitulo.setLayout(null);

        labelTitulo.setBounds(10,10,200,30);
        labelTitulo.setFont(new Font("Arial",Font.BOLD,12));
        painelTitulo.add(labelTitulo);

        // COMPONENTES TELA
        lblPeso.setBounds(10,70,150,30);
        txtPeso.setBounds(10,100,150,35);
        txtPeso.setFont(new Font("Arial",Font.BOLD,24));

        lblAltura.setBounds(10,140,150,30);
        txtAltura.setBounds(10,170,150,35);
        txtAltura.setFont(new Font("Arial",Font.BOLD,24));

        lblTituloResultadoImc.setBounds(300,70,250,30);
        lblTituloResultadoImc.setFont(new Font("Arial",Font.BOLD,15));
        lblTituloResultadoImc.setForeground(Color.RED); //cor do texto//

        lblResultadoImc.setBounds(300,90,250,30);
        lblResultadoImc.setFont(new Font("Arial",Font.BOLD,20));
        lblResultadoImc.setForeground(Color.BLUE);

        lblStatusImc.setBounds(300,110,250,30);
        lblStatusImc.setForeground(Color.BLUE);
        lblStatusImc.setFont(new Font("Arial",Font.BOLD,20));
        //lblStatusImc.setHorizontalAlignment(JLabel.CENTER);//

        btnCalcular.setBounds(10,220,120,30);
        btnCalcular.setBackground(Color.GREEN);
        btnCalcular.setForeground(Color.BLACK);
        btnCalcular.setFont(new Font("Arial",Font.BOLD,10));

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularImc();
            }
        });

        btnLimpar.setBounds(135,220,120,30);
        btnLimpar.setBackground(Color.GREEN);
        btnLimpar.setForeground(Color.BLACK);
        btnLimpar.setFont(new Font("Arial",Font.BOLD,10));

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparTela();
            }
        });

        //Imagem
        btnCalcular.setIcon(iconBtnCalcular);
        btnLimpar.setIcon(iconBtnLimpar);

        tela.getContentPane().add(painelTitulo);
        tela.getContentPane().add(lblPeso);
        tela.getContentPane().add(txtPeso);
        tela.getContentPane().add(lblAltura);
        tela.getContentPane().add(txtAltura);
        tela.getContentPane().add(lblTituloResultadoImc);
        tela.getContentPane().add(lblResultadoImc);
        tela.getContentPane().add(lblStatusImc);
        tela.getContentPane().add(btnCalcular);
        tela.getContentPane().add(btnLimpar);

        //SEMPRE NO FINAL
        tela.setVisible(true);
    }

    private void limparTela(){
        txtAltura.setText("");
        txtPeso.setText("");
        lblStatusImc.setText("");
        lblResultadoImc.setText("");
        txtPeso.requestFocus();
    }

    private void calcularImc(){
        System.out.println("Feature in Development");
    }

    }

