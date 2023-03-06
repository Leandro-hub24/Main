import javax.swing.JOptionPane;

public class clase3a {
    public static void main(String[] args) {
        int cuentaA = 0, valor = 0, suma = valor;
        String cadena = JOptionPane.showInputDialog("Ingrese una frase: ");
        while (valor <= cadena.length()-1){
            if(cadena.charAt(valor) == 'a'){
                cuentaA++;
                valor++;
            }else{
                valor++;
            }
        }
        System.out.println(cuentaA); 

        while (valor <= cadena.length()-1){
            if(cadena.substring(valor, suma).equals("a"))
                cuentaA++;
        valor++;
        }
        System.out.println(cuentaA); 

        System.out.println(cadena.substring(5, cadena.length()));
    }
}
