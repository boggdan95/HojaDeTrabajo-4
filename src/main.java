import java.util.Scanner;

/**
 * @author Boggdan Barrientos, Diego De Leon, Jasmin Valdez
 * @15 de agosto de 2015
 */

public class main {
	
	static int entradaTeclado = 0;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FactoryCalculadora calculadoraPostfix = new FactoryCalculadora();
		
		int a = 0;
		
		while(a == 0){
        System.out.println("Bienvenido a la calculadora");
        System.out.println("Seleccione el metodo de Stack que desee \n1. Vector\n2. ArrayList\n3. Lista Simplemente Enlazada\n4. Lista Doblemente Enlazada\n5. Lista Circular");
        System.out.println("Ingrese la opción numérica deseada:");
        
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        try {
			entradaTeclado = entradaEscaner.nextInt();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("POR FAVOR! Ingrese un número");
			a = 0;
		}
       try {
		if (entradaTeclado > 0 && entradaTeclado <=5){
		    	a = 1;
		   }
		   else{
			   a =0;
		   }
		   
			calculadoraPostfix.crearObjeto((int)entradaTeclado);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("POR FAVOR! Ingrese un número");
		a = 0;
	}
	   }
       
        
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