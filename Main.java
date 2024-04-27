import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

    public static ArrayList<Contactos> Registro = new ArrayList<Contactos>();
    public static int Opcion;
    public static String temporal;
    public static String nombreContacto;
    public static String numeroRegistro;

    public static void main(String[] args) {

        
       
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

        nombreContacto = JOptionPane.showInputDialog(null,"Ingrese el nombre del contacto: ");
        numeroRegistro = JOptionPane.showInputDialog(null,"Ingrese el número del contacto: ");
            
    Contactos instancia = new Contactos();
    instancia.setNombre(nombreContacto);
    instancia.setNumeroContacto(numeroRegistro);

    Registro.add(instancia);
}

}