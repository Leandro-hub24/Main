import javax.swing.JOptionPane;

public class clase3{
    public static void main(String[] args) {
        /* 
        String respuesta = "si";
        while(respuesta.equals("si")){
        String cadena = JOptionPane.showInputDialog("Ingrese una frase: ");
        System.out.println(cadena.charAt(0));
        System.out.println("posición 6: "+cadena.charAt(6));
        System.out.println("Longitud total "+cadena.length());
        System.out.println("Última posición--> "+(cadena.length()-1));
        System.out.println("Última posición--> "+(cadena.charAt(cadena.length()-1)));
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());
        System.out.println("Longitud sin espacios laterales: "+cadena.trim().length());
        respuesta = JOptionPane.showInputDialog("¿Quiere repetir este código? si o no").trim().toLowerCase();
        }
        */  
        int cuentaA = 0, valor = 0;
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
    } 
}