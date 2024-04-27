import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

    public static int Opcion;

    public static String temporal;

    public static void main(String[] args) {

        ArrayList<Contactos> Registro = new ArrayList<Contactos>();
       
        JOptionPane.showMessageDialog(null,"Bienvenido a la agenda de contactos" );
        menu ();
    }

    public static void menu (){
        for(;;){
        temporal = JOptionPane.showInputDialog(null,"Digite una opción \n1. Añadir contacto \n2.Buscar contacto \n3. Eliminar contacto \n4. Salir");
        Opcion = Integer.parseInt(temporal);
        
        
        switch (Opcion){
            
            case 1:
            agendar ();


            break;

            case 2:
            JOptionPane.showMessageDialog(null,"2" );
            break;


            case 3:
            JOptionPane.showMessageDialog(null,"3" );
            break;

            case 4:
            JOptionPane.showMessageDialog(null,"4" );
            break;

            default:
            JOptionPane.showMessageDialog(null,"marque bien" );
            break;
        }

    }

    }

    public static void agendar (){

        JOptionPane.showInputDialog(null,"Ingrese el nombre del contacto: " );
        JOptionPane.showInputDialog(null,"Ingrese el número del contacto: " );
            
}

}