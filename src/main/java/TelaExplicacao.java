import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaExplicacao extends JFrame {
    public JPanel panelExpli;
    private JComboBox comboBoxExplicacao;
    private JButton btnExibir;
    private JTextArea textArea1;


    private String encapsulamento;

    private String heranca;


    private String sobrecarga;

    private String polimorfismo;

    public JPanel getPanelExplicacao() {
        return panelExpli;
    }

    public void setPanelExplicacao(JPanel panelExplicacao) {
        this.panelExpli = panelExplicacao;
    }

    public JComboBox getComboBoxExplicacao() {
        return comboBoxExplicacao;
    }

    public void setComboBoxExplicacao(JComboBox comboBoxExplicacao) {
        this.comboBoxExplicacao = comboBoxExplicacao;
    }

    public JButton getBtnExibir() {
        return btnExibir;
    }

    public void setBtnExibir(JButton btnExibir) {
        this.btnExibir = btnExibir;
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public void setTextArea1(JTextArea textArea1) {
        this.textArea1 = textArea1;
    }

    public String getEncapsulamento() {
        return encapsulamento;
    }

    public void setEncapsulamento(String encapsulamento) {
        this.encapsulamento = encapsulamento;
    }

    public String getHeranca() {
        return heranca;
    }

    public void setHeranca(String heranca) {
        this.heranca = heranca;
    }

    public String getSobrecarga() {
        return sobrecarga;
    }

    public void setSobrecarga(String sobrecarga) {
        this.sobrecarga = sobrecarga;
    }

    public String getPolimorfismo() {
        return polimorfismo;
    }

    public void setPolimorfismo(String polimorfismo) {
        this.polimorfismo = polimorfismo;
    }

    public TelaExplicacao()  {
    comboBoxExplicacao.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {




        }
    });
        btnExibir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(comboBoxExplicacao.getSelectedIndex() == 0){
                    textArea1.setText("O polimorfismo é um dos conceitos fundamentais da programação orientada a objetos (POO)" +
                            " e é amplamente utilizado em Java." +
                            " O termo polimorfismo se refere à " +
                            "capacidade de um objeto assumir diferentes " +
                            "formas, ou seja, uma mesma operação pode ser realizada por diferentes objetos de classes diferentes.");
                } else if (comboBoxExplicacao.getSelectedIndex() == 1) {

                    textArea1.setText("\n" +
                            "Encapsulamento, Polimorfismo, Herança em Java\n" +
                            "A herança é um mecanismo da Orientação a Objeto que permite criar novas classes a partir de classes já existentes,\\n" +
                            " aproveitando-se das características existentes na classe a ser estendida." +
                            " Este mecanismo é muito interessante, pois promove um grande reuso e reaproveitamento de código existente.");

                } else if (comboBoxExplicacao.getSelectedIndex() == 2) {
                    textArea1.setText("O Encapsulamento serve para controlar o acesso aos atributos e métodos de uma classe. " +
                            "É uma forma eficiente de proteger os dados manipulados dentro da classe, além de determinar onde esta classe poderá ser manipulada." +
                            " Usamos o nível de acesso mais restritivo, private, que faça sentido para um membro particular.");

                } else if (comboBoxExplicacao.getSelectedIndex() == 3) {
                    textArea1.setText("A sobrecarga (overload) consiste em permitir, dentro da mesma classe, mais de um método com o mesmo nome." +
                            " Entretanto, eles necessariamente devem possuir argumentos diferentes para funcionar.");

                }
            }
        });
    }
}
