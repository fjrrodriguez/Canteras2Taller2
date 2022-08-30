
package tallerdos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Francy Ramirez
 */
public class TallerDos {
    //Arreglo dinamico para guardar cada objeto creado de la clase NavesEspaciales
    public static ArrayList<NavesEspaciales>lista=new ArrayList<NavesEspaciales>();
    //Objeto de la clase NavesEsaciales
    public static NavesEspaciales nv;
    //Inicio de clase Main
    public static void main(String[] args) {
        //variables para la seleccion de opciones de los menus de la clase main
        int opc;
        int op;
        //Objeto de la clase Scanner para recibir datos
        Scanner entrada=new Scanner(System.in);
        //Objeto de la clase TallerDos 
        TallerDos pp=new TallerDos();
        //Inicio de ciclo do while para implementacion del menu princial 
        do{
            //opciones del menu principal
        System.out.println("NAVES ESPACIALES ACME");
            System.out.println("1. Crear nave espacial\n2. Consultar naves guardadas\n3. Salir");
            System.out.print("Seleccione una opcion:  ");
            opc=entrada.nextInt();
            switch(opc){
                case 1: 
                    //Opciones caso 1 para la creacion de las naves espaciales
                    System.out.println("1. Vehiculo lanzadera\n2. Satelite\n3. Nave no tripulada\n4. Nave tripulada");
                    op=entrada.nextInt();
                    switch(op){
                        case 1:
                            //Metodo crear Nave Lanzadera
                            pp.crearNLanzadera();
                            break;
                        case 2:
                            //Metodo crear Satelite  
                            pp.crearSatelite();
                            break;
                        case 3:
                            //Metodo crear nave no tripulada
                            pp.crearNNTripulada();
                            break;
                        case 4:
                            //Metodo creae nave tripulada
                            pp.crearTripulada();
                            break;
                        default:
                            //caso por defecto, dado que no se ingrese una ocion valida del menu 
                            System.out.println("Opcion no valida");
                    }
                    
                    break;
                case 2:
                    //Ciclo for que permite visualizar las naves espaciales creadas y guardadas en el arreglo "lista"
                    for(NavesEspaciales listan:lista){
                        listan.mostrar();
                        }
                    break;
                case 3:
                    //Opcion para Finalizar la ejecucion del menu principal
                    System.out.println("Saliendo....");
                    System.exit(0);
                    break;
                default:
                     System.out.println("Opcion no valida");
            }
        }while(opc<3);
        //Finalizacion del ciclo do while
        System.out.println("__________________________________________________________________________________________");
    }//Finalizacion de la clase Main
    
    //Metodo Crear Lanzadera
    public void crearNLanzadera(){
        //variable tipo cadena para asignacion del nombre del vehiculo lanzadera
        String name;
        //Variable tipo cadena para el nombre del combustible
        String fuel;
        //Variable de tipo entero para asigacion del peso del vehiculo lanzadera
        int weight;
        //Variablede tipo entero para la asignacion del peso de la carga 
        int capacidad;
        //Variable de tipo flotante para la asinacion de la fuerza de empuje del vehiculo lanzasera para el despegue 
        float empuje;
        //Variable de tipo entero para la selecion de las opciones del menu 
        int op;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("==========================================");
        //Asignacion de valores ingresadas por el usuario para cada variable 
        System.out.println("Registrando datos Vehiculo Lanzadera");
        System.out.print("Nombre: ");
        name=entrada.nextLine();
        System.out.print("Peso (en toneladas): ");
        weight=entrada.nextInt();
        System.out.print("Nombre del combustible: ");
        fuel=entrada.nextLine();
        entrada.next();
        System.out.print("Carga(en toneladas): ");
        capacidad=entrada.nextInt();
        System.out.print("Capacidad de empuje(en toneladas): ");
        empuje=entrada.nextFloat();
        //Inicializacion del objeto nv que recibe los parametros requeridos por el constructor de la clase VehiculoLanzadera
        nv = new VehiculoLanzadera(name, weight, fuel, capacidad, empuje);
        //Se carga el objeto de la clase VehiculoLanzadera al arreglo de objetos de NavesEspaciales 
        lista.add(nv);
        System.out.println("¿El vehiculo lanzadera va a despegar?: \n1. SI\n2. NO");
        op=entrada.nextInt();
           if(op==1){
            System.out.println(nv.despegar());
            nv.nave(); 
            nv.propulsion();
            }
           else{ 
               System.out.println("El vehiculo estara disponible ara proximas misiones. ");
           }
       System.out.println("__________________________________________________________________________________________"); 
    }//Finalizacion del metodo crearNLanzadera
    
    //Inicio del metodo crearSatelite
    public void crearSatelite(){
        //variable tipo cadena para asignacion del nombre del satelite 
        String name;
        //Variable de tipo entero para asigacion del peso del satelite
        int weight;
        //Variable tipo cadena para el nombre del combustible
        String fuel;
        //Variable bolleana para la asigacion de estado del satelite
        boolean orbitando=false;
        //Variable de tipo entero para la selecion de las opciones del menu 
        int opc;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("==========================================");
        //Asignacion de valores ingresadas por el usuario para cada variable 
        System.out.println("Registrando datos Satelite");
        System.out.print("Nombre: ");
        name=entrada.nextLine();
        System.out.print("Peso (en toneladas): ");
        weight=entrada.nextInt();
        System.out.print("Nombre del combustible: ");
        fuel=entrada.nextLine();
        entrada.next();
        System.out.println("Estado del satelite: \n1. En orbita\n2. Inactivo");
        opc=entrada.nextInt();
        
                if(opc==1){
                    orbitando=true;
                }
                else if(opc==2){
                    orbitando=false;
                }
        //Inicializacion del objeto nv que recibe los parametros requeridos por el constructor de la clase Satelite
        nv= new Satelite(name, weight, fuel, orbitando);
         //Se carga el objeto de la clase Satelite al arreglo de objetos de NavesEspaciales 
        lista.add(nv);
        nv.nave();
        nv.propulsion();
     System.out.println("__________________________________________________________________________________________");
    }//Finalizacion del metodo crearSatelite
    
    //Inicio metodo para crear nave no tripulada 
    public void crearNNTripulada(){
        //variable tipo cadena para asignacion del nombre de la nave no tripulada 
        String name;
        //Variable de tipo entero para asigacion del peso de la nave no tripulada 
        int weight;
        //Variable tipo cadena para el nombre del combustible
        String fuel;
        //Variable de tipo entera para la asigacion de la fuerza de empuje de la nave para el despegue
        int empuje;
         //Variable bolleana para la asigacion de estado de la nave no trupulada
        boolean estado=false;
        //Variable de tipo entero para la selecion de las opciones del menu 
        int opc;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("==========================================");
        //Asignacion de valores ingresadas por el usuario para cada variable 
        System.out.println("Registrando datos de nave no tripulada");
        System.out.print("Nombre: ");
        name=entrada.nextLine();
        System.out.print("Peso (en toneladas): ");
        weight=entrada.nextInt();
        System.out.print("Nombre del combustible: ");
        fuel=entrada.nextLine();
        entrada.next();
        System.out.print("Capacidad de empuje (en toneladas): ");
        empuje=entrada.nextInt();
        System.out.println("Estado de la nave: \n1. Activa \n2. Inactiva");
        opc=entrada.nextInt();
        switch(opc){
            case 1:
                if(opc==1){
                    estado=true;
                }
                break;
            case 2:
                if(opc==2){
                    estado=false;
                }
                break;
        }
        //Inicializacion del objeto nv que recibe los parametros requeridos por el constructor de la clase NaveNoTripulada
        nv= new NaveNoTripulada(name, weight, fuel,empuje,estado);
         //Se carga el objeto de la clase NaveNoTripulada al arreglo de objetos de NavesEspaciales 
        lista.add(nv);
        nv.nave();
        nv.propulsion();
        System.out.println("__________________________________________________________________________________________");
    }//Finalizacion del metodo crearNNTripulada
    
    //Inicio de metodo para crear naves tripuladas
    public void crearTripulada(){
        //variable tipo cadena para asignacion del nombre de la nave tripulada
        String name;
        //Variable de tipo entero para asigacion del peso de la nave tripulada
        int weight;
        //Variable tipo cadena para el nombre del combustible
        String fuel;
        
        int npersonas;
         //Variable bolleana para la asigacion de estado de la nave tripulada 
        boolean estado=false;
        //Variable de tipo entero para la selecion de las opciones del menu 
        int opc;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("==========================================");
        //Asignacion de valores ingresadas por el usuario para cada variable
        System.out.println("Registrando datos de nave tripulada");
        System.out.print("Nombre: ");
        name=entrada.nextLine();
        System.out.print("Peso (en toneladas): ");
        weight=entrada.nextInt();
        System.out.print("Nombre del combustible: ");
        fuel=entrada.nextLine();
        entrada.next();
        System.out.println("Numero de tripulantes: ");
        npersonas=entrada.nextInt();
        System.out.println("Estado de la nave: \n1. Activa \n2. Inactiva");
        opc=entrada.nextInt();
        switch(opc){
            case 1:
                if(opc==1){
                    estado=true;
                }
                break;
            case 2:
                if(opc==2){
                    estado=false;
                }
                break;
        }
        //Inicializacion del objeto nv que recibe los parametros requeridos por el constructor de la clase Tripulada
        nv = new Tripulada(name, weight, fuel,npersonas,estado);
        lista.add(nv);
        nv.nave();
        nv.propulsion();
        System.out.println("__________________________________________________________________________________________");
    }//Finalizacion de metodo crearTripulada
}//Finalizacion clase TallerDos