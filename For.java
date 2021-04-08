import javax.swing.JOptionPane;

public class For {

    public static void main(String[] args){

        int array[] = {0,1,2,3,4,8,6,7,8,4,9,3,5,4,5,4,4,2,67,88};  

        System.out.println("Dentro do FOR");
        for (int a = 0; a <= (array.length - 1); a++) {
            if (array[a] == 4){
                System.out.print(array[a] + "\n");
            }
        }
        int a = 0;

        System.out.println("Dentro do WHILE");
        while (a <= (array.length - 1)){
            if (array[a] == 4){
                System.out.print(array[a] + "\n");
            }
            a++;
        }
    }
}
