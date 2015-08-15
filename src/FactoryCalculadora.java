
import java.io.FileNotFoundException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author @author Boggdan Barrientos, Diego De Leon, Jasmin Valdez
 * @param <E>
 */
public class FactoryCalculadora<P, E> implements ADTCalculadora{
    
    private String datosPosfix; 
    private double Resultado;
    private ADTStack Lista;    
  
    public void crearObjeto(int i){
        switch(i){
        case 1:
           Lista = new StackVector<E>();
           break;
        case 2:
           Lista = new StackArrayList<E>();
           break;
        case 3:
        	Lista = new StackSE<E>();
       	    break;
        case 4:
        	Lista = new StackDE<E>();
        	break;
        case 5:
        	Lista = new StackC<E>();
       	    break; 
               }     	
      }
    
    
    /* (non-Javadoc)
     * @see ADTCalculadora#readFile(java.lang.String)
     */
    public void readFile(String file) throws FileNotFoundException {
        // TODO Auto-generated method stub
        // tiene que tener el valor: file = "datos.txt"
        FileReader fr = new FileReader(file);
        BufferedReader bf = new BufferedReader(fr);

        try {
                datosPosfix = bf.readLine();
        } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        
        System.out.println(datosPosfix);		
	
    }
    
    /* (non-Javadoc)
     * @see ADTCalculadora#calcular()
     */
    public double calcular() throws Exception{
	char[] cadenaChar = datosPosfix.toCharArray();

	for (int i = 0; i < datosPosfix.length(); i++){
		if (cadenaChar[i]== '+'){
                    Lista.push((double) Lista.pop()+ (double) Lista.pop());
		}
                else if (cadenaChar[i]== '-'){
                    Lista.push((double)Lista.pop()- (double)Lista.pop());
		}
                else if (cadenaChar[i]== '*'){
                    Lista.push((double)Lista.pop()* (double)Lista.pop());
		}            
                else if (cadenaChar[i]== '/'){
                    double x =(double) Lista.pop();
                    double y =(double) Lista.pop();
                    Lista.push(y/x);
		}
                else if (cadenaChar[i]== ' '){
                    ;
		}else {
                    Lista.push(Double.parseDouble(""+cadenaChar[i]));
                            }
	}    

        Resultado = (double) Lista.pop();

        return Resultado;
        
    }
}

