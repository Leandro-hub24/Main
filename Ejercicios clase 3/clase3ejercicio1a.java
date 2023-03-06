import javax.swing.JOptionPane;

public class clase3ejercicio1a {
    public static void main(String[] args) {
        
        int cont = 0, i = 0;
        String cadena = JOptionPane.showInputDialog("Ingrese una frase: ").toLowerCase();
        System.out.println(cadena.length());
        String letra = JOptionPane.showInputDialog("Ingrese una letra que desee contar dentro de la frase ingresada: ").toLowerCase();
        while (i <= cadena.length()-1){
            if(cadena.charAt(i) == letra.charAt(0)){
                cont++;
                i++;
            }else{
                i++;
            }
        }
        System.out.println(cont);    
    }
}
