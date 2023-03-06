import javax.swing.JOptionPane;

public class clase3ejercicio1b {
    public static void main(String[] args) {
        
        int a, b, i = 0;
        int[]vector = new int[3];

        String a1 = JOptionPane.showInputDialog("Ingrese un número: ");
        vector[0] = Integer.parseInt(a1);
        String b1 = JOptionPane.showInputDialog("Ingrese otro número: ");
        vector[1] = Integer.parseInt(b1);
        String c1 = JOptionPane.showInputDialog("Ingrese un último número: ");
        vector[2] = Integer.parseInt(c1);

        String pre = JOptionPane.showInputDialog("Desea ordenarlos de forma ascendente (1) o decreciente(2): opción 1 o 2");
        b = Integer.parseInt(pre);

        switch(b){

            case(1):
            while(vector[0] > vector[1] || vector[0] > vector[2] || vector[1] > vector[2]){

                if(vector[i] > vector[i+1]){
                     a = vector[i];
                     vector[i] = vector[i+1];
                     vector[i+1] = a;
                }
                i++;
                if(i == 2){
                 i = 0;
                }
            }
            break;

            case(2):
            while(vector[0] < vector[1] || vector[0] < vector[2] || vector[1] < vector[2]){

                if(vector[i] < vector[i+1]){
                     a = vector[i];
                     vector[i] = vector[i+1];
                     vector[i+1] = a;
                }
                i++;
                if(i == 2){
                 i = 0;
                }
            }
            break;

            default:

            System.out.println("Opción ingresada no valida.");
        }

        for(int j = 0; j < vector.length; j++){
            System.out.print(vector[j]+" ");
        }

    }    
}
