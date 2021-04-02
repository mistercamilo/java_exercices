import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;

public class SequenciaCrescente{

    public static void main(String[] args){
        
        int i = 0;
        int input;
        ArrayList<Integer> array = new ArrayList<Integer>();

        ArrayList<Integer> arraySorted = new ArrayList<Integer>();

        do{
            input = Integer.parseInt(JOptionPane.showInputDialog("Valor :"));
            array.add(input);
            i++;
        }
        while (input != 0);
        
        System.out.println("Array normal:");
        System.out.println(array);
        
        System.out.println("Array ordenado:");
        Collections.sort(array);
        System.out.println(array);

        boolean isEqual = array.equals(arraySorted);

        if (isEqual == true){
            System.out.println("Está em ordem crescente.");
        }else{
            System.out.println("Não está em ordem crescente.");
        }
     }
}
