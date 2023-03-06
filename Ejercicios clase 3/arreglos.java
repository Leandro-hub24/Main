
public class arreglos {
    public static void main(String[] args) {
        /* int []arreglo1 = new int[10];
        arreglo1[0] = 23;
        arreglo1[1] = 45;
        int ingreso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor entero: "));
        for(int i = 0; i < arreglo1.length; i++){
            arreglo1[i] = ingreso * (i+1);
            System.out.println("Arreglo["+i+"] = "+arreglo1[i]);
        } */
        int [][] mosaico = new int[2][3];
        mosaico[0][0] = 4747;
        mosaico[0][1] = 4746;
        mosaico[0][2] = 10;
        mosaico[1][0] = 8747;
        mosaico[1][1] = 4777;
        mosaico[1][2] = 5;

        
        

        for(int i = 0; i < mosaico.length; i++){
            for(int j = 0; j < mosaico[0].length; j++){
                System.out.print(mosaico[i][j]+", ");
            }
            System.out.println("");
        }
    }
}
