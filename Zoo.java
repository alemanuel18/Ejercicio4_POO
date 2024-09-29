
import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    
    public static void main(String[] args) {

        Funsionamiento funcionamiento=new Funsionamiento();

        int eleccion=menu();
        int eleccion2;
        int eleccion3;

        String nombre;
        String habitad;
        String dieta;
        String tamano;
        float pesoKg;
        float alimetacionDiaria;
        float areaHabitad;

        Scanner teclado=new Scanner(System.in);

        while (eleccion!=3) {
            if (eleccion == 1) {
                eleccion2=menu2();
                if (eleccion2==1) {
                    nombre=ingresarString(1);
                    habitad=ingresarString(2);
                    pesoKg=ingresarfloat(1);
                    dieta=menu4();
                    tamano=menu5();
                    areaHabitad=funcionamiento.calcularAreaHabitad(tamano, "Felino");
                    alimetacionDiaria=funcionamiento.calcularAlimentacionD(pesoKg, tamano, "Felino");

                    Felino felino=new Felino(nombre, habitad, ingresarint(1), funcionamiento.calcularCostoMantenimientoM(tamano, alimetacionDiaria, dieta), pesoKg, ingresarint(2), peligroExtincion(), menu3(), ingresarint(3), dieta, tamano, alimetacionDiaria, areaHabitad, ingresarString(3), ingresarString(4), ingresarfloat(2), ingresarfloat(3), ingresarfloat(4));

                    System.out.println(funcionamiento.mostrarInformacionAnimalEspecificoF(felino));

                if (funcionamiento.revisarExistenciaHabitad(habitad)) {
                    System.out.println("El habitad ya existe");
                    eleccion3=menu8();
                    if (eleccion3==1) {
                        funcionamiento.agregarFelino(felino);
                        System.out.println("Se a agregado al felino");
                    }else{
                        System.out.println("No se agego al felino");
                    }
                }else{
                    System.out.println("El habitad no existe.\nEl costo de construccion es de Q"+funcionamiento.costoConstruccionArrea(areaHabitad));
                    eleccion3=menu8();
                    if (eleccion3==1) {
                        funcionamiento.agregarHabitad(habitad);
                        funcionamiento.agregarFelino(felino);
                        System.out.println("Se a agregado al felino\nSe a creado el habitad");
                    }else{
                        System.out.println("No se agego al felino");
                    }
                }
                }else{
                    nombre=ingresarString(1);
                    habitad=ingresarString(2);
                    pesoKg=ingresarfloat(1);
                    dieta=menu4();
                    tamano=menu5();
                    areaHabitad=funcionamiento.calcularAreaHabitad(tamano, "Primate");
                    alimetacionDiaria=funcionamiento.calcularAlimentacionD(pesoKg, tamano, "Primate");

                    Primate primate=new Primate(nombre, habitad, ingresarint(1), funcionamiento.calcularCostoMantenimientoM(tamano, alimetacionDiaria, dieta), pesoKg, ingresarint(2), peligroExtincion(), menu3(), ingresarint(3), dieta, tamano, alimetacionDiaria, areaHabitad, ingresarString(5), menu6(), menu7(), ingresarfloat(5));

                    System.out.println(funcionamiento.mostrarInformacionAnimalEspecificoP(primate));

                    if (funcionamiento.revisarExistenciaHabitad(habitad)) {
                        System.out.println("El habitad ya existe");
                        eleccion3=menu8();
                        if (eleccion3==1) {
                            funcionamiento.agregarPrimate(primate);
                            System.out.println("Se a agregado al primate");
                        }else{
                            System.out.println("No se agego al primate");
                        }
                    }else{
                        System.out.println("El habitad no existe.\nEl costo de construccion es de Q"+funcionamiento.costoConstruccionArrea(areaHabitad));
                        eleccion3=menu8();
                        if (eleccion3==1) {
                            funcionamiento.agregarHabitad(habitad);
                            funcionamiento.agregarPrimate(primate);
                            System.out.println("Se a agregado al primate\nSe a creado el habitad");
                        }else{
                            System.out.println("No se agego al primate");
                        }
                    }
                }
                eleccion=menu();
            }else if (eleccion==2) {
                if (funcionamiento.getFelinos().isEmpty() && funcionamiento.getPrimates().isEmpty()) {
                    System.out.println("No existe ningun animal");
                }else{
                    System.out.println(funcionamiento.mostrarInformacionAnimalEspecifico(seleccionarAnimal(funcionamiento)));
                }
                eleccion=menu();
            }
        }
        System.out.println("Gracias por preferirnos, hasta la proxima.");
    }

    public static int menu(){
        //Se inicializan las variables
        //Se crean los objetos

        Scanner teclado=new Scanner(System.in);
        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        

        while (verificador==false) {
            System.out.println("\nMenu\nSeleccione lo que deses realizar\n1. Ingresar nuevo animal\n2. Mostrar informacion importante del animal\n3. Salir");
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi<1 ||eleccionUsuarioi>3){
                    System.out.println("Ingrese una de las opciones del menu");
                }else
                verificador=true;
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return eleccionUsuarioi;

    }

    public static int menu2(){
        //Se inicializan las variables
        //Se crean los objetos

        Scanner teclado=new Scanner(System.in);
        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        

        while (verificador==false) {
            System.out.println("\nQue tipo de mamifero ingresara\n1. Felino\n2. Primate");
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi<1 ||eleccionUsuarioi>2){
                    System.out.println("Ingrese una de las opciones del menu");
                }else
                verificador=true;
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return eleccionUsuarioi;
    }

    public static String menu3(){
        //Se inicializan las variables
        //Se crean los objetos

        Scanner teclado=new Scanner(System.in);
        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        

        while (verificador==false) {
            System.out.println("\nQue tipo de pelaje tiene el mamifero\n1. Corto \n2. Largo\n3. Grueso\n4. Ausente");
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi<1 ||eleccionUsuarioi>4){
                    System.out.println("Ingrese una de las opciones del menu");
                }else{
                    if (eleccionUsuarioi==1) {
                        eleccionUsuarioS="Corto";
                        verificador=true;   
                    } else if (eleccionUsuarioi==2) {
                        eleccionUsuarioS="Largo";
                        verificador=true;   
                    } else if (eleccionUsuarioi==3) {
                        eleccionUsuarioS="Grueso";
                        verificador=true;   
                    } else if (eleccionUsuarioi==4) {
                        eleccionUsuarioS="Ausente";
                        verificador=true;   
                    }
                }
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return eleccionUsuarioS;
    }

    public static String menu4(){
        //Se inicializan las variables
        //Se crean los objetos

        Scanner teclado=new Scanner(System.in);
        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        

        while (verificador==false) {
            System.out.println("\nQue tipo de dieta tiene el mamifero\n1. Carnivora \n2. Omnivora");
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi<1 ||eleccionUsuarioi>2){
                    System.out.println("Ingrese una de las opciones del menu");
                }else{
                    if (eleccionUsuarioi==1) {
                        eleccionUsuarioS="Carnívora";
                        verificador=true;   
                    } else if (eleccionUsuarioi==2) {
                        eleccionUsuarioS="Omnívora";
                        verificador=true;   
                    }
                }
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return eleccionUsuarioS;
    }

    public static String menu5(){
        //Se inicializan las variables
        //Se crean los objetos

        Scanner teclado=new Scanner(System.in);
        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        

        while (verificador==false) {
            System.out.println("\nQue tamaño tiene el mamifero\n1. Pequeño\n2. Mediano\n3. Grande");
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi<1 ||eleccionUsuarioi>3){
                    System.out.println("Ingrese una de las opciones del menu");
                }else{
                    if (eleccionUsuarioi==1) {
                        eleccionUsuarioS="Pequeño";
                        verificador=true;   
                    } else if (eleccionUsuarioi==2) {
                        eleccionUsuarioS="Mediano";
                        verificador=true;   
                    } else if (eleccionUsuarioi==3) {
                        eleccionUsuarioS="Grande";
                        verificador=true;   
                    }
                }
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return eleccionUsuarioS;
    }
    
    public static int menu6(){
        //Se inicializan las variables
        //Se crean los objetos

        Scanner teclado=new Scanner(System.in);
        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        

        while (verificador==false) {
            System.out.println("\nMenu\nIndica el nivel de inteligencia del primate en una escala del 1 al 10");
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi<1 ||eleccionUsuarioi>10){
                    System.out.println("En una escala del 1 al 10");
                }else
                verificador=true;
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return eleccionUsuarioi;

    }

    public static String menu7(){
        //Se inicializan las variables
        //Se crean los objetos

        Scanner teclado=new Scanner(System.in);
        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        

        while (verificador==false) {
            System.out.println("\nQue tipo de pelaje tiene el mamifero\n1. Solitario\n2. Grupal\n3. Familiar\n4. Jerárquico");
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi<1 ||eleccionUsuarioi>4){
                    System.out.println("Ingrese una de las opciones del menu");
                }else{
                    if (eleccionUsuarioi==1) {
                        eleccionUsuarioS="Corto";
                        verificador=true;   
                    } else if (eleccionUsuarioi==2) {
                        eleccionUsuarioS="Largo";
                        verificador=true;   
                    } else if (eleccionUsuarioi==3) {
                        eleccionUsuarioS="Grueso";
                        verificador=true;   
                    } else if (eleccionUsuarioi==4) {
                        eleccionUsuarioS="Ausente";
                        verificador=true;   
                    }
                }
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return eleccionUsuarioS;
    }

    public static int menu8(){
        //Se inicializan las variables
        //Se crean los objetos

        Scanner teclado=new Scanner(System.in);
        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        

        while (verificador==false) {
            System.out.println("\nMenu\n¿Deseas agregar al animal?\n1. Si\n2. No");
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi<1 ||eleccionUsuarioi>2){
                    System.out.println("Ingrese una de las opciones del menu");
                }else
                verificador=true;
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return eleccionUsuarioi;

    }

    public static String ingresarString(int accion){
        Scanner teclado=new Scanner(System.in);
        String datoString="";
        if (accion==1) {
            System.out.println("Ingrese el nombre cientifico del animal.");
            datoString=teclado.nextLine();
        } else if (accion==2) {
            System.out.println("Ingrese el nombre el habitad");
            datoString=teclado.nextLine();  
        } else if (accion==3) {
            System.out.println("Ingrese el nombre de la especie del felino");
            datoString=teclado.nextLine();  
        } else if (accion==4) {
            System.out.println("Ingrese el color del pelaje del falino");
            datoString=teclado.nextLine();  
        } else if (accion==5) {
            System.out.println("Ingrese el nombre de la especie del primate");
            datoString=teclado.nextLine(); 
        }
        return datoString;
    }

    public static int ingresarint(int accion){
        Scanner teclado=new Scanner(System.in);
        String Es;
        int Ei=0;
        boolean verificador=false;

        while (verificador==false) {
            if (accion==1) {
                System.out.println("Ingrese la esperanza de vida del animal");   
            } else if (accion==2) {
                System.out.println("Ingrese la tiempo de gestion en meses del animal");   
            } else if (accion==3) {
                System.out.println("Ingrese el numero promedio de crias por camada");   
            } 
            Es=teclado.nextLine();

            try { 
                Ei=Integer.parseInt(Es);
                verificador=true;
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return Ei;
    }

    public static float ingresarfloat(int accion){
        Scanner teclado=new Scanner(System.in);
        String Es;
        float Ei=0;
        boolean verificador=false;

        while (verificador==false) {
            if (accion==1) {
                System.out.println("Ingrese el peso en Kg del animal");   
            } else if (accion==2) {
                System.out.println("Ingrese el tamaño del felino en metros");   
            } else if (accion==3) {
                System.out.println("Ingrese el tamaño de la cola");   
            } else if (accion==4) {
                System.out.println("Ingrese la velocidad maxima del felino");   
            } else if (accion==5) {
                System.out.println("Ingrese el tamaño del cerebro del primate");   
            }
            Es=teclado.nextLine();

            try { 
                Ei=Float.parseFloat(Es);
                verificador=true;
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero");
            } 
        }
        return Ei;
    }

    public static boolean peligroExtincion(){
        //Se inicializan las variables
        //Se crean los objetos

        Scanner teclado=new Scanner(System.in);
        String eleccionUsuarioS="";
        int eleccionUsuarioi=0;
        boolean verificador=false;
        boolean peligro=false;
        

        while (verificador==false) {
            System.out.println("\nMenu\n¿Este animal se encuentra en peligro de extincion?\n1. Si\n2. No");
            eleccionUsuarioS=teclado.nextLine();

            try { 
                eleccionUsuarioi=Integer.parseInt(eleccionUsuarioS);
                if(eleccionUsuarioi<1 ||eleccionUsuarioi>2){
                    System.out.println("Ingrese una de las opciones del menu");
                }else{
                    if (eleccionUsuarioi==1) {
                        peligro=true;
                        verificador=true;
                    }else if (eleccionUsuarioi==2) {
                        peligro=false;
                        verificador=true;
                    }
                }
                
            } catch (Exception e) {
                System.out.println("Ingrese un numero entero");
            } 
        }
        return peligro;
    }

    public static String seleccionarAnimal(Funsionamiento funcionamiento) {
        Scanner teclado = new Scanner(System.in);
        
        // Initialize variables for user input and verification
        String eleccionUsuarioS = "";
        int eleccionUsuarioi = 0;
        boolean verificador = false;
    
        // Get lists of animals
        ArrayList<Primate> primates = funcionamiento.getPrimates();
        ArrayList<Felino> felinos = funcionamiento.getFelinos();
    
        // Show the list of primates
        System.out.println("Lista de Primates:");
        for (int i = 0; i < primates.size(); i++) {
            Primate primate = primates.get(i);
            System.out.println((i + 1) + ". " + primate.getNombreCientifico());
        }
    
        // Show the list of felinos
        System.out.println("Lista de Felinos:");
        for (int i = 0; i < felinos.size(); i++) {
            Felino felino = felinos.get(i);
            System.out.println((i + 1 + primates.size()) + ". " + felino.getNombreCientifico());
        }
    
        // User selection loop
        while (verificador == false) {
            System.out.println("\nSeleccione el número del animal que desea:");
            String seleccion = teclado.nextLine();
    
            try {
                eleccionUsuarioi = Integer.parseInt(seleccion);
                if (eleccionUsuarioi < 1 || eleccionUsuarioi > (primates.size() + felinos.size())) {
                    System.out.println("Ingrese una de las opciones del menu");
                } else {
                    verificador = true;
    
                    // Determine if the selection is a primate or felino
                    if (eleccionUsuarioi <= primates.size()) {
                        eleccionUsuarioS = primates.get(eleccionUsuarioi - 1).getNombreCientifico();
                    } else {
                        eleccionUsuarioS = felinos.get(eleccionUsuarioi - primates.size() - 1).getNombreCientifico();
                    }
                }
            } catch (Exception e) {
                System.out.println("Ingrese un número entero");
            }
        }
        
        return eleccionUsuarioS; // Return the scientific name of the selected animal
    }
    

}
