
package tallerdos;

import java.util.Scanner;

/**
 * @author Francy Ramierez
 */
public class NaveNoTripulada extends NavesEspaciales {
    //Atributos de la clase NaveNoTripulada con modificador de acceso privado
    private int empuje;
    private boolean estado;
    private String ms;
    
    //Constructor de la clase NavesNoTrupuladas 
    public NaveNoTripulada(String name,int weight,String fuel,int empuje, boolean estado){
       super(name,weight,fuel);
       this.empuje=empuje;
       this.estado=estado;
    }
    
    //Sobreescritura del Metodo nave de la clase NavesEspaciales
    @Override
    public void nave(){
        System.out.println("Nave espacial no tripulada se dirige a mision de estudio hacia  "+mision(estado)+"\n"+despegar());
    }
    
    //Sobreescritura del Metodo despegar de la clase NavesEspaciales
    @Override
    public String despegar() {
       return "Estoy despegando ... ";
    }
    
    //Sobreescritura del Metodo mostrar de la clase NavesEspaciales
    @Override
    public void mostrar(){
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-..-.-.-.-.-.-.-.-.-.-.-.-");
        System.out.println("Nave no tripulada: "+super.getName());
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-..-.-.-.-.-.-.-.-.-.-.-.-");

    }
    
    //COMPORTAMIENTO DE LA NAVE NO TRIPULADA
    //Metodo mision asigna una mision para las naves no tripuladas teniendo en cuenta el estado en el que se encientra la nave
    public String mision(boolean estado){
        this.estado=estado;
        if(estado==false){
            System.out.println("La nave esta inactiva no puede iniciar misiones de estudio");
        }
        else if(estado==true){
        int opc;
        Scanner entrada= new Scanner (System.in);
        System.out.println("Iniciar mision");
        System.out.println("A donde se va a dirigir la mision: ");
        System.out.println("1. Venus\n2. Marte\n3. El Sol\n4.La luna\n5. Saturno");
        opc=entrada.nextInt();
        switch(opc){
            case 1:
              ms="Venus";
              break;
            case 2:
              ms="Marte";
              break; 
            case 3:
              ms="El Sol";
              break;
            case 4:
              ms="La luna";
              break;
            case 5:
              ms="Saturno";
              break;
            default:
                System.out.println("Opcion no valida");
        }
      } 
        return ms;
    }
    
}//Finalizacion de la clase NaveNoTripualada
