
public class ejercicio1d {
    public static void main(String[] args){
        int numeroInicio = 5;
        int numeroFin = 14;
        int n;

        for(int i = numeroFin; i >= numeroInicio; i--){
            n = i % 2; 
            if(n == 0){
                System.out.println(i);
            }
        }
    }    
}
