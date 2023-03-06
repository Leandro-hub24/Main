import javax.swing.JOptionPane;

public class ejercicio2 {
    public static void main(String[] args) {
        
        float sueldo;
        int vehiculos, an, inmuebles;

        String a = JOptionPane.showInputDialog("Ingrese sus ingresos mensuales totales del hogar: ");
        sueldo = Integer.parseInt(a.trim());

        if(sueldo >= 489083){
            System.out.println("Pertenece al segmento de ingresos altos");
        }else{
            String b = JOptionPane.showInputDialog("¿Posee vehículos?").trim().toLowerCase();
            if(b.equals("si")){
                String c = JOptionPane.showInputDialog("¿Cuántos vehículos posee?").trim();
                vehiculos = Integer.parseInt(c);
                if(vehiculos >=3){
                    String d = JOptionPane.showInputDialog("¿Cuántos años de antigüedad posee su vehículo mas reciente?").trim();
                    an = Integer.parseInt(d);
                    if(an < 5){
                        System.out.println("Pertenece al segmento de ingresos altos");
                    }else{
                        String e = JOptionPane.showInputDialog("¿Cuántos inmuebles posee?").trim();
                    inmuebles = Integer.parseInt(e);
                    if(inmuebles >= 3){
                        System.out.println("Pertenece al segmento de ingresos altos");
                    }else{
                        String f = JOptionPane.showInputDialog("¿Posee una embarcación, una aeronave de lujo o es titular de activos societarios que demuestren capacidad económica plena?").trim().toLowerCase();
                        if(f.equals("si")){
                            System.out.println("Pertenece al segmento de ingresos altos");
                        }else if(f.equals("no")){
                            System.out.println("No pertenece al segmento de ingresos altos");
                        }
                    }
                    }
                }else{
                    String e = JOptionPane.showInputDialog("¿Cuántos inmuebles posee?").trim();
                    inmuebles = Integer.parseInt(e);
                    if(inmuebles >= 3){
                        System.out.println("Pertenece al segmento de ingresos altos");
                    }else{
                        String f = JOptionPane.showInputDialog("¿Posee una embarcación, una aeronave de lujo o es titular de activos societarios que demuestren capacidad económica plena?").trim().toLowerCase();
                        if(f.equals("si")){
                            System.out.println("Pertenece al segmento de ingresos altos");
                        }else if(f.equals("no")){
                            System.out.println("No pertenece al segmento de ingresos altos");
                        }
                    }
                }
            }else{
                String e = JOptionPane.showInputDialog("¿Cuántos inmuebles posee?").trim();
                    inmuebles = Integer.parseInt(e);
                    if(inmuebles >= 3){
                        System.out.println("Pertenece al segmento de ingresos altos");
                    }else{
                        String f = JOptionPane.showInputDialog("¿Posee una embarcación, una aeronave de lujo o es titular de activos societarios que demuestren capacidad económica plena?").trim().toLowerCase();
                        if(f.equals("si")){
                            System.out.println("Pertenece al segmento de ingresos altos");
                        }else if(f.equals("no")){
                            System.out.println("No pertenece al segmento de ingresos altos");
                        }
                    }
            }
        }
    }
}
