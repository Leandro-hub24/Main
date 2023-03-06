import javax.swing.JOptionPane;

public class clase3ejercicio2 {
        public static void main(String[] args) {
            
            String abc = "abcdefghijklmnñopqrstuvwxyz ";

            String frase = JOptionPane.showInputDialog("Ingrese una frase: ").toLowerCase();

            for(int i = 0; i < frase.length(); i++){
                for(int j = 0; j < abc.length(); j++){
                        if(frase.charAt(i) == abc.charAt(j)){
                                if(j == abc.length()){
                                        System.out.print(abc.charAt(2));
                                }else if(j == abc.length()-1){
                                        System.out.print(abc.charAt(1));
                                }else{
                                        System.out.print(abc.charAt(j+2));
                                }                               
                        }                        
                }
            }
        }
}
