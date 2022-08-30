
package tallerdos;
/**
 * @author Francy Ramirez
 */
//Clase abstracta NavesEspaciales implementa de la interface SistemaPropulsion 
public abstract class NavesEspaciales implements SistemaPropulsion{
    //Atributos de la clase NavesEspaciales con modificador de acceso privado 
    //Nombre de la nave
    private String name;
    //Peso de la nave espacial
    private int weight;
    //Combustible 
    private String fuel;

    //Constructor de la clase NavesEspaciales 
    public NavesEspaciales(String name, int weight, String fuel) {
        this.name = name;
        this.weight = weight;
        this.fuel = fuel;
    }
    
    //Sobreescritura metodo propulsion 
    @Override
    public void propulsion(){
         System.out.println("Estoy usando un sistema de propulsion");;
    }
    
    //Metodos abstractos
    public abstract void nave();
    public abstract String despegar();
    public abstract void mostrar();
    
    //Metodo get que retorna el peso de la nave 
    public int getWeight(){
        return weight;
    }
    
    //Metodo para el retorno del nombre de la nave
    public String getName(){
        return name;
    }
    
    
}//Finalizacion de la clase Naves Espaciales
