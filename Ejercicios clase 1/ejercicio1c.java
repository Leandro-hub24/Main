import javax.swing.JOptionPane;

public class ejercicio1c {
    public static void main(String[] args){
        int numeroInicio = 5;
        int numeroFin = 14;
        int n;
        String a;

        a = JOptionPane.showInputDialog("Deseas ver los numeros pares (ingrese P) o los numeros impares (ingrese I): ").trim().toLowerCase();

        while(numeroInicio <= numeroFin){
            n = numeroInicio % 2;
            switch(a){
                case("p"):
                    if(n == 0){
                        System.out.println(numeroInicio);
                        numeroInicio++;
                    }else{
                        numeroInicio++;
                    }
                    break;
                case("i"):
                    if(n != 0){
                        System.out.println(numeroInicio);
                        numeroInicio++;
                    }else{
                        numeroInicio++;
                    }
                    break;
                default:
                    System.out.println("Error, la letra ingresada no es valida.");
                    numeroInicio = numeroFin + 1;
            }
        }  
    }      
}

