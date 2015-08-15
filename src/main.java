import java.util.Scanner;

/**
 * @author Boggdan Barrientos, Diego De Leon, Jasmin Valdez
 *
 */

public class main {
	
	static int entradaTeclado = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FactoryCalculadora calculadoraPostfix = new FactoryCalculadora();
        System.out.println("Bienvenido a la calculadora");
        System.out.println("Seleccione el metodo de Stack que desee \n1. Vector\n2. ArrayList\n3. Lista Simplemente Enlazada\n4. Lista Doblemente Enlazada\n5. Lista Circular");
        System.out.println("Ingrese la opcion numerica deseada:");
        
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        try {
			entradaTeclado = entradaEscaner.nextInt();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
       
        
		calculadoraPostfix.crearObjeto((int)entradaTeclado);
		
       
        
        try{        
        	calculadoraPostfix.readFile("datos.txt");
        }
        catch (Exception e){
        	System.out.println("No se puede encontrar el documento datos.txt");
        }
        
        try{
            System.out.println("El resultado es: "+calculadoraPostfix.calcular());        	
        }
        catch (Exception e){
        	System.out.println("Los datos del documento no pueden ser procesados");
        	System.out.println("Revise el formato e intente nuevamente");
        }
   }
    
}