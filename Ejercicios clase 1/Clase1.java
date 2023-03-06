import javax.swing.JOptionPane;

/*public class Clase1 {
    /*public static void main(String[] args){
        int edad = 0;
        String dato_pedido = JOptionPane.showInputDialog("Ingrese su edad");
        edad = Integer.parseInt(dato_pedido.trim());
        if(edad >= 0 && edad <= 100){
            System.out.println("La edad es " +edad+ " años.");
            int año_actual = 2023;
            System.out.println("Calcularemos su año de nacimiento.");
            int nacimiento = año_actual - edad;
            System.out.println("Su año de nacimiento es " +nacimiento+".");
        }else{
            System.out.println("La edad ingresada no es valida.");
        }
        System.out.println("Finalizó en programa.");
    }
}*/

public class Clase1 {
    public static void main(String[] args){
    
        String let = JOptionPane.showInputDialog("Ingrese una letra; ").trim().toLowerCase();
        System.out.println("La letra ingresa es " +let+ ".");
        if(let.equals("a") || let.equals("A") || let.equals("e") || let.equals("E") || let.equals("i") || let.equals("I") || let .equals("o") || let .equals("O") || let.equals("u") || let.equals("U")){
            System.out.println("La letra ingresada es una vocal.");
        }else{
            System.out.println("La letra ingresada es una consonante.");
        }
    }
}
