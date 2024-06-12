package view;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class TelaImc {
    private JLabel labelTitulo = new JLabel("Índice de Massa Corporal - IMC");
    private JPanel painelTitulo = new JPanel();
    private Random gerador = new Random();

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
        painelTitulo.setBackground(new Color(gerador.nextInt()));
        painelTitulo.setLayout(null);

        labelTitulo.setBounds(10,10,200,30);
        painelTitulo.add(labelTitulo);








        tela.getContentPane().add(painelTitulo);



        //SEMPRE NO FINAL
        tela.setVisible(true);
    }

}
