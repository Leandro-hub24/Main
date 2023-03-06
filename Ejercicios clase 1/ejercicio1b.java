public class ejercicio1b {
    public static void main(String[] args){
        int numeroInicio = 5;
        int numeroFin = 14;
        int n;

        while(numeroInicio <= numeroFin){
            n = numeroInicio % 2; 
            if(n == 0){
                System.out.println(numeroInicio);
                numeroInicio++;
            }else{
                numeroInicio++;
            }
        }
    }    
}
