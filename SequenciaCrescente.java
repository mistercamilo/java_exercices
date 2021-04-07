import javax.swing.JOptionPane;
import java.util.ArrayList;

public class SequenciaCrescente {

    public static void main(String[] args) {

        int i = 0;
        int input;
        boolean isCrescente = true;
        ArrayList<Integer> array = new ArrayList<Integer>();

        do {
            input = Integer.parseInt(JOptionPane.showInputDialog("Valor :"));
            array.add(input);
            i++;
        } while (input != 0);

        System.out.println("Tamanho do array :" + array.size());
        for (int a = 0; a < (array.size() - 2); a++) {
            if (array.get(a) > array.get(a + 1)) {
                // System.out.println(array.get(a) + " > " + array.get(a + 1));
                isCrescente = false;
                break;
            } else {
                // System.out.println(array.get(a) + " < " + array.get(a + 1));
                isCrescente = true;
            }
        }
        if (isCrescente) {
            System.out.println(array + "Sim");
        } else {
            System.out.println(array + "Nao");
        }
    }
}
