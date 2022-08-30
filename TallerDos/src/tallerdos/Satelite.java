
package tallerdos;

/**
 * @author Francy Ramirez
 */
//Clase Satelite hereda de la clase NavesEspaciales 
public class Satelite extends NavesEspaciales {
    //Atributo con modificador de acces private 
    private boolean orbitando;
    
    //Constructor de la clase Satelite
    public Satelite(String name,int weight,String fuel,boolean orbitando){
        super(name,weight,fuel);
        this.orbitando=orbitando;
    }
    
    //Sobreescritura del metodo nave() de la clase NavesEspaciales
    @Override
    public void nave(){
        if(orbitando==false){
            System.out.println(despegar());   
        }else{
              System.out.println("El satelite se encuentra en orbita, no puede despegar de nuevo");
              }
        
    }
    
    //Sobreescritura del metodo despegar() de la clase NavesEspaciales
    @Override
    public String despegar() {
       return "Estoy despegando para orbitar alrededor del planeta tierra";
    }
    
    //Sobreescritura del metodo mostrar() de la clase NavesEspaciales
    @Override
    public void mostrar(){
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-..-.-.-.-.-.-.-.-.-.-.-.-");
        System.out.println("Satelite: "+super.getName());
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-..-.-.-.-.-.-.-.-.-.-.-.-");

    }
    
}
