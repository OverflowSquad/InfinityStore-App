package telas;

import classes.Produto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroProduto extends JFrame {
    //declaração de atributos
    private JLabel jlNomeProduto,jlCategoriaProduto,jlPrecoProduto,jlDimensaoProduto,jlDimensaoProdutoL, jlDimensaoProdutoC, jlDimensaoProdutoA, jlQuantidadeProduto, jlCodigoProduto;
    private JTextField jtfNomeProduto,jtfCategoriaProduto, jtfPrecoProduto, jtfDimensaoProdutoL, jtfDimensaoProdutoC, jtfDimensaoProdutoA, jtfQuantidadeProduto, jtfCodigoProduto;
    private JButton jbCadastrar,jbMostrar;
    private Produto produto;

    public TelaCadastroProduto(String titulo) throws HeadlessException {
        super(titulo);
        setSize(265,385);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
        criarEventos();
    }

    private void iniciarComponentes() {
        //criação de objetos
        jlNomeProduto = new JLabel("Nome do produto: ");
        jlCategoriaProduto = new JLabel("Categoria: ");
        jlPrecoProduto = new JLabel("Preço: ");
        jlDimensaoProduto = new JLabel("Dimensões: (centímetros)");
        jlDimensaoProdutoL = new JLabel("L: ");
        jlDimensaoProdutoC = new JLabel("C: ");
        jlDimensaoProdutoA = new JLabel("A: ");
        jlQuantidadeProduto = new JLabel("Quantidade: ");
        jlCodigoProduto = new JLabel("Código do produto:");
        jtfNomeProduto = new JTextField();
        jtfCategoriaProduto = new JTextField();
        jtfPrecoProduto = new JTextField();
        jtfDimensaoProdutoL = new JTextField();
        jtfDimensaoProdutoC = new JTextField();
        jtfDimensaoProdutoA = new JTextField();
        jtfQuantidadeProduto = new JTextField();
        jtfCodigoProduto = new JTextField();
        jbCadastrar = new JButton("Cadastrar");
        jbMostrar = new JButton("Mostrar");

        //adicionar objetos na tela
        add(jlNomeProduto);
        add(jlCategoriaProduto);
        add(jlPrecoProduto);
        add(jlDimensaoProduto);
        add(jlDimensaoProdutoL);
        add(jlDimensaoProdutoC);
        add(jlDimensaoProdutoA);
        add(jlQuantidadeProduto);
        add(jlCodigoProduto);
        add(jtfNomeProduto);
        add(jtfCategoriaProduto);
        add(jtfPrecoProduto);
        add(jtfDimensaoProdutoL);
        add(jtfDimensaoProdutoC);
        add(jtfDimensaoProdutoA);
        add(jtfQuantidadeProduto);
        add(jtfCodigoProduto);
        add(jbCadastrar);
        add(jbMostrar);

        //dimensionar objetos na tela;
        jlNomeProduto.setBounds(10,10,230,20);
        jtfNomeProduto.setBounds(10,30,230,20);
        jlCategoriaProduto.setBounds(10,60,230,20);
        jtfCategoriaProduto.setBounds(10,80,230,20);
        jlPrecoProduto.setBounds(10,110,230,20);
        jtfPrecoProduto.setBounds(10,130,230,20);
        jlDimensaoProduto.setBounds(10,160,230,20);
        jlDimensaoProdutoL.setBounds(10,180,20,20);
        jtfDimensaoProdutoL.setBounds(30,180,50,20);
        jlDimensaoProdutoC.setBounds(90,180,20,20);
        jtfDimensaoProdutoC.setBounds(110,180,50,20);
        jlDimensaoProdutoA.setBounds(170,180,20,20);
        jtfDimensaoProdutoA.setBounds(190,180,50,20);
        jlQuantidadeProduto.setBounds(10,210,230,20);
        jtfQuantidadeProduto.setBounds(10,230,230,20);
        jlCodigoProduto.setBounds(10,260,230,20);
        jtfCodigoProduto.setBounds(10,280,230,20);
        jbCadastrar.setBounds(10,310,110,20);
        jbMostrar.setBounds(130,310,110,20);

    }

    //Evento da ação do botão
    private void criarEventos() {
        jbCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //declaração de variáveis locais
                String nomeProduto,categoriaProduto;
                double precoProduto,dimensaoProdutoL,dimensaoProdutoC,dimensaoProdutoA;
                int quantidadeProduto,codigoProduto;
                //entrada
                if (jtfNomeProduto.getText().isEmpty() || jtfCategoriaProduto.getText().isEmpty() || jtfPrecoProduto.getText().isEmpty() || jtfDimensaoProdutoL.getText().isEmpty() || jtfDimensaoProdutoC.getText().isEmpty() || jtfDimensaoProdutoA.getText().isEmpty() || jtfQuantidadeProduto.getText().isEmpty() || jtfCodigoProduto.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Algo está faltando!");
                }
                else {
                    nomeProduto = jtfNomeProduto.getText();
                    categoriaProduto = jtfCategoriaProduto.getText();
                    precoProduto = Double.parseDouble(jtfPrecoProduto.getText());
                    dimensaoProdutoL = Double.parseDouble(jtfDimensaoProdutoL.getText());
                    dimensaoProdutoC = Double.parseDouble(jtfDimensaoProdutoC.getText());
                    dimensaoProdutoA = Double.parseDouble(jtfDimensaoProdutoA.getText());
                    quantidadeProduto = Integer.parseInt(jtfQuantidadeProduto.getText());
                    codigoProduto = Integer.parseInt(jtfCodigoProduto.getText());
                    produto = new Produto(nomeProduto,categoriaProduto,precoProduto,dimensaoProdutoL,dimensaoProdutoC,dimensaoProdutoA,quantidadeProduto,codigoProduto);
                }

            }
        });
        jbMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,produto.mostrarDados());
            }
        });
    }
}
