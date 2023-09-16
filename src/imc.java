import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class imc {
    public static void main(String[] args) throws Exception {
      String altura = JOptionPane.showInputDialog(null, "Digite sua altura: ", "Altura", JOptionPane.INFORMATION_MESSAGE);
      String peso = JOptionPane.showInputDialog(null, "Digite seu peso: " , "Peso", JOptionPane.INFORMATION_MESSAGE);
      float altura2 = Float.parseFloat(altura);
      float peso2 = Float.parseFloat(peso);
      float altura3 = altura2 * altura2;
      float imc = peso2 / altura3;
      DecimalFormat df = new DecimalFormat ("#.##");
      String imcFormatado = df.format(imc);
      JOptionPane.showMessageDialog(null, "Seu IMC é igual a: " + imcFormatado + "!", "IMC", JOptionPane.INFORMATION_MESSAGE);

      if (imc < 18.5) {
       JOptionPane.showMessageDialog(null, "Cuidado, você está abaixo do peso!", "Abaixo do peso", JOptionPane.INFORMATION_MESSAGE);
    } else if (imc < 24.9) {
        JOptionPane.showMessageDialog(null, "Parabéns, você está saudável!", "Saudável", JOptionPane.INFORMATION_MESSAGE);
    } else if (imc < 29.9) {
        JOptionPane.showMessageDialog(null, "Cuidado, você está acima do peso!", "Acima do peso", JOptionPane.INFORMATION_MESSAGE);
    } else if (imc < 34.9) {
        JOptionPane.showMessageDialog(null, "Cuidado, você está com obesidade Grau 1!", "Obesidade Grau 1", JOptionPane.INFORMATION_MESSAGE);
    } else if (imc < 39.9) {
        JOptionPane.showMessageDialog(null, "Cuidado, você está com obesidade Grau 2!", "obesidade Grau 2", JOptionPane.INFORMATION_MESSAGE );
    } else {
        JOptionPane.showMessageDialog(null, "Cuidado, você está com obesidade Grau 3!", "Obesidade Grau 3", JOptionPane.INFORMATION_MESSAGE);
    }

    }
}
