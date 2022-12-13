package app;

import javax.swing.*;

public class Numero {
    public static void main(String[] args) {

        String a="";
        int num = 0;
        String saida="";

        a = JOptionPane.showInputDialog("Entre com o número: ");
        num = Integer.parseInt(a);

        saida += " O antecessor de " + num + " é " + antecessor(num);
        saida += "\n O sucessor de " + num + " é " + sucessor(num);

        JOptionPane.showMessageDialog(null,saida);

    }

    public static Integer antecessor(Integer numero){
        return numero - 1;
    }

    public static Integer sucessor(Integer numero){
        return numero + 1;
    }
}
