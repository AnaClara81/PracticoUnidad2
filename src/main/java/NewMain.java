
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anace
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ArrayList usuarios = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        //String dato = "";
        //System.out.println("Ingrese una letra para comenzar");
        //dato = scanner.next();
        
        //while(dato.equals("0")){
             System.out.println("Ingresa el nombre del usuario");
            String nombre = scanner.next();
            usuarios.add(nombre);
           //System.out.println("Escribe 0 si desea seguir agregando" );
           // dato = scanner.next();
             System.out.println("Ingresa el apellido del usuario");
            String apellido = scanner.next();
            usuarios.add(apellido);
           //System.out.println("Escribe 0 si desea seguir agregando" );
           // dato = scanner.next();
            System.out.println("Ingresa edad del usuario");
            int edad = scanner.nextInt();
            usuarios.add(edad);
            
            System.out.println("Ingresa hobbie del usuario");
            String hobbie = scanner.next();
            usuarios.add(hobbie);
            
             System.out.println("Ingresa el editor de codigo preferido del usuario");
            String editor = scanner.next();
            usuarios.add(editor);
            
             System.out.println("Ingresa el sistema operativo que utiliza el usuario");
            String sistema = scanner.next();
            usuarios.add(sistema);
            
    
      System.out.println("Los datos del usuario son:\n Nombre: " +  nombre+ "\n Apellido:"+apellido+ 
              "\n Edad:" +edad+"\n Hobbie: "+hobbie+ "\n Editor: "+editor+"\n Sistema: "+sistema);
       
}
        }
     
        

