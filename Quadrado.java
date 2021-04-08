import javax.swing.JOptionPane;

public class Quadrado {

    public static void main(String[] args){

        int input;
        String str = "*";

        // loop para forçar o usuario a digitar um valor valido
        do{
            input = Integer.parseInt(JOptionPane.showInputDialog("Valor :"));
            if(input > 20){
                JOptionPane.showMessageDialog(null, "Valor nao aceito! Digite novamente");
            }
        }while(input >20);
        
        // loop para exibir a string multiplicada
        for (int linha = 1; linha <= input; linha++) {
            System.out.print(str.repeat(input) + "\n");

        }
    }
}
