public class Factory<E>{
  
   Scanner ingreso= new Scanner(System.in);
   
   public List<E> getList(){
     if(ingreso.equals("Circular"))
        return new Circular<E>();
     if(ingreso.equals("DoblementeEnlazada"))
        return new DoblementeEnlazada<E>();
     if(ingreso.equals("SimplementeEnlazada"))
        return new SimplementeEnlazada<E>();
   }
  
}

}
