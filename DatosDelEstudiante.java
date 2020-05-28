/*
Implemente un algoritmo que le permita Ingresar por teclado el 
nombre de la universidad, el departamento, la carrera, nombre de la materia
nombres completos del estudiante, nivel, numero de cedula, pais de origen, ciudad, 
canton, provincia, ID, sexo.

 */
package datosdelestudiante;

/**
 *
 * @author: Medardo Rene Chango Caguana 
 */
import java.util.Scanner;
public class DatosDelEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in); 
        System.out.println("-Ingrese en nombre de la universidad :");
        String nombreUniversidad=objeto.nextLine();
        
        System.out.println("-Ingrese el Departamento :");
        String departamento=objeto.nextLine();
        
        System.out.println("-Ingrese la carrera :");
        String carrera=objeto.nextLine();
        
        System.out.println("-Ingrese Mareria :");
        String materia=objeto.nextLine();
        
        System.out.println("-Nombre del estudiante :");
        String estudiante=objeto.nextLine();
        
        System.out.println("-Ingrese el nivel:");
        String nivel=objeto.nextLine();
        
        System.out.println("-Ingrese el numero de cedula:");
        String cedula=objeto.nextLine();
        
        System.out.println("-Ingrese el pais de origen :");
        String pais=objeto.nextLine();
        
        System.out.println("-Ingrese el canton :");
        String canton=objeto.nextLine();
        
        System.out.println("-Ingrese la provincia :");
        String provincia=objeto.nextLine();
        
        System.out.println("-Ingrese su ID :");
        String ID=objeto.nextLine();
        
        System.out.println("-Intrese el tipo de sexo :");
        String sexo=objeto.nextLine();
        
        System.out.println("BIENVENIDO A LA "+nombreUniversidad +estudiante);
        
        
        
        
    }
    
}
