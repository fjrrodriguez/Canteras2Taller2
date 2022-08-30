
package tallerdos;

import java.util.Scanner;

/**
 * @author Francy Ramirez
 */
//Clase Tripulada hereda de la clase NavesEspaciales 
public class Tripulada extends NavesEspaciales{
    
    //Atributos con modificador de acceso privado 
    private int npersonas;
    private boolean estado;
    
    //Constructor de la clase Tripulada
    public Tripulada(String name, int weight,String fuel,int npersonas,boolean estado){
        super(name,weight,fuel);
        this.estado=estado;
        this.npersonas=npersonas;
    }
    
    //Metodo get que retorna el numero de tripulantes de la nave
    public int getNPersonas(){
        return npersonas;
    }
    
    //Sobreescritura del metodo nave() de la clase NavesEspaciales en el cual se le asigna una actividad a la nave 
    @Override
    public void nave(){
        int op;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Enviar la nave a: \n1. Mision espacial\n2.Exerimentacion y entrenamiento\n3. Tareas de mantenimiento ");
        op=entrada.nextInt();
        switch(op){
            case 1:
                System.out.println(misionE(estado));
                break;
            case 2:
                System.out.println(experimentar(estado));
                break;
            case 3:
                System.out.println(mantener(estado));
        }
    }
    
   //Sobreescritura del metodo despegar() de la clase NavesEspaciales 
    @Override
    public String despegar() {
       return "Iniciando despegue ... ";
    }
    
    //Sobreescritura del metodo mostrar() de la clase NavesEspaciales
    @Override
    public void mostrar(){
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-..-.-.-.-.-.-.-.-.-.-.-.-");       
        System.out.println("Nave espacial tripulada: "+super.getName());
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-..-.-.-.-.-.-.-.-.-.-.-.-");

    }
    
    //Metodo mision Espacial
    public String misionE(boolean estado){
        this.estado=estado;
        if(estado==true){
        return "La nave se dirige a una mision espacial con "+getNPersonas()+" tripulantes a bordo";
        }
        else{
            return "La nave no se encuentra activa";
        }
    }
    
    //Metodo Experiementar 
    public String experimentar(boolean estado){
        this.estado=estado;
        if(estado==true){
        return "La nave se dirige experimentacion y entrenamiento en el espacio  con "+getNPersonas()+" tripulantes a bordo";
        } else{
            return "La nave no se encuentra activa";
        }
    }
        
   //Metodo mantener 
    public String mantener(boolean estado){
        this.estado=estado;
        if(estado==true){
        return "La nave se dirige a realizar una tarea de mantenimiento en el espacio con "+getNPersonas()+" tripulantes a bordo";
        }
        else{
            return "La nave no se encuentra activa";
        }
    }   
}//Finalizacion de clase Tripulada
