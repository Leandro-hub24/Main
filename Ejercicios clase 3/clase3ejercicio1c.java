
public class clase3ejercicio1c {
    public static void main(String[] args) {
        
        int []vector = new int[5];
        int x = 7, sum = 0;
        vector[0] = 12;
        vector[1] = 35;
        vector[2] = 23;
        vector[3] = 3;
        vector[4] = 6;

        for(int i = 0; i < vector.length; i++){
            if(vector[i] > x){
                sum += vector[i];
            } 
        }

        System.out.println(sum);
    }
}
