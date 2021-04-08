import javax.swing.JOptionPane;
import java.util.ArrayList;

public class SequenciaCrescente {

    public static void main(String[] args) {

        int i = 0; // contador 
        int input; // variavel que recebera os valores
        boolean isCrescente = true; // esta variavel recebera true ou false se a sequencia for crescente ou nao 
        ArrayList<Integer> array = new ArrayList<Integer>(); // declaracao do array list para receber os valores 


        // loop para receber os valores
        do {
            input = Integer.parseInt(JOptionPane.showInputDialog("Valor :"));
            array.add(input);
            i++;
        } while (input != 0);

 
        // Descomente a linha abaixo para exibir o tamanho do array
        // System.out.println("Tamanho do array :" + array.size());

        // loop para percorrer os valores do array verificando se o primeiro elemento é maior ou nao que o posterior
        for (int a = 0; a < (array.size() - 2); a++) {
            
            if (array.get(a) > array.get(a + 1)) { // verifica se o elemento da posicao atual é maior que o proximo 

                // Descomente a linha abaixo para exibir as comparacoes dos numeros
                // System.out.println(array.get(a) + " > " + array.get(a + 1));
                isCrescente = false;
                break; // se o elemento da posicao atual for maior que o proximo sai do if e do loop

            } else { // se o elemento da posicao atual for menor que o proximo, continuar no loop ate percorrer todas as posicoes comparando

                // Descomente a linha abaixo para exibir as comparacoes dos numeros
                // System.out.println(array.get(a) + " < " + array.get(a + 1));
                isCrescente = true;
            }
        }
        if (isCrescente == true) {
            System.out.println(array + "Sim " + (array.size() - 1));
        } else {
            System.out.println(array + "Nao " + (array.size() - 1));
        }
    }
}
