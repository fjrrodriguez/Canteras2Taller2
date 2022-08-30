
package tallerdos;

/**
 * @author Francy Ramirez
 */
//Clase VehiculoLanzadera hereda de la clase NavesEspaciales 
public class VehiculoLanzadera extends NavesEspaciales{
    //Atributos de la clase con modoficador de acceso privado 
    private int capacidad;
    private float empuje;

    //constructor de la clase VehiculoLanzadera
    public VehiculoLanzadera(String name,int weight,String fuel,int capacidad, float empuje) {
        super(name,weight,fuel);
        this.capacidad = capacidad;
        this.empuje = empuje;
    }
    
    //Sobreescritura del metodo nave() de la clase NavesEspaciales
    @Override
    public void nave() {
        System.out.println("Vehiculo Lanzadera: "+getCapacidad()+ " toneladas de carga. "+maxcap(empuje,super.getWeight())+maxcap(capacidad));
    }
    
    //Sobreescritura del metodo despegar() de la clase NavesEspaciales
    @Override
    public String despegar(){
        return " Inicio de despegue ...  ";
    }
    
    //Metodo maxcap() permite validar si la nave se encuentra en capacidad para el despegue o por el contrario en una posible sobrecarga 
    public String maxcap(int capacidad){
       this.capacidad=capacidad;
        if(capacidad>120){
            return "Sobrecarga, no puede despegar. ";
        }else{
            return "Capacidad de carga optima.  ";
        }
    }
    
    //SOBRECARGA DEL METODO maxcap() permute validar si la capaidad del empuje es suficiente o no para el despegue de la nave   
    public String maxcap(float empuje,int weight){
        this.empuje=empuje;
        if(getWeight()>2900&&empuje<3500){
            return "Se necesita mas empuje para el despegue. ";
        }else{
            return "Capacidad de empuje optima. ";
        }   
    }
    
    //Metodo get para el retorno de la capacidad de carga de la nave 
    public int getCapacidad() {
        return capacidad;
    }
    
    
    //Sobreescritura del metodo mostrar() de la clase Naves Espaciales
    @Override
    public void mostrar(){
        
        System.out.println("Vehiculo lanzadera: "+ super.getName());
    }
    
}//Finalizacion de la clase VehiculoLanzadera
