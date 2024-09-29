import java.util.ArrayList;

public class Funsionamiento {

    private ArrayList<Felino>felinos=new ArrayList<>();
    private ArrayList<Primate>primates=new ArrayList<>();
    private ArrayList<String>habitad=new ArrayList<>();

    public ArrayList<Felino> getFelinos() {
        return felinos;
    }
    public ArrayList<String> getHabitad() {
        return habitad;
    }
    public ArrayList<Primate> getPrimates() {
        return primates;
    }

    public float calcularAlimentacionD(float pesoKg,String tamano, String fom){
        float comida=0;

        if (tamano=="Pequeño" && fom=="Felino") {
            comida=pesoKg*15;
        } else if (tamano=="Mediano" && fom=="Felino") {
            comida=pesoKg*25;
        } else if (tamano=="Grande" && fom=="Felino") {
            comida=pesoKg*35;
        } else if (tamano=="Pequeño" && fom=="Primate") {
            comida=pesoKg*25;
        } else if (tamano=="Mediano" && fom=="Primate") {
            comida=pesoKg*20;
        } else if (tamano=="Grande" && fom=="Primate") {
            comida=pesoKg*15;
        }
        return comida;
    }

    public float calcularAreaHabitad(String tamano, String fom){
        float area=0;

        if (tamano=="Pequeño" && fom=="Felino") {
            area=30;
        } else if (tamano=="Mediano" && fom=="Felino") {
            area=75;
        } else if (tamano=="Grande" && fom=="Felino") {
            area=150;
        } else if (tamano=="Pequeño" && fom=="Primate") {
            area=50;
        } else if (tamano=="Mediano" && fom=="Primate") {
            area=150;
        } else if (tamano=="Grande" && fom=="Primate") {
            area=400;
        }
        return area;
    }

    public double calcularCostoMantenimientoM(String tamano, float alimetacionDiaria, String dieta){
        double mantenimienoM=0;
        if (tamano=="Pequeño" && dieta=="Carnívora") {
            mantenimienoM= (100 + 0.11*alimetacionDiaria)*30;
        } else if (tamano=="Mediano" && dieta=="Carnívora") {
            mantenimienoM= (250 + 0.11*alimetacionDiaria)*30;
        } else if (tamano=="Grande" && dieta=="Carnívora") {
            mantenimienoM= (400 + 0.11*alimetacionDiaria)*30;
        } else if (tamano=="Pequeño" && dieta=="Omnívora") {
            mantenimienoM= (100 + 0.15*alimetacionDiaria)*30;
        } else if (tamano=="Mediano" && dieta=="Omnívora") {
            mantenimienoM= (250 + 0.15*alimetacionDiaria)*30;
        } else if (tamano=="Grande" && dieta=="Carnívora") {
            mantenimienoM= (400 + 0.15*alimetacionDiaria)*30;
        }
        return mantenimienoM;
    }

    public void agregarPrimate(Primate primate){
        primates.add(primate);
    }

    public void agregarFelino(Felino felino){
        felinos.add(felino);
    }

    public void agregarHabitad(String nombre){
        habitad.add(nombre);
    }

    public float costoConstruccionArrea(float areaHabitad){
        float costo=0;

        costo= areaHabitad*50;

        return costo;
    }

    public String mostrarInformacionAnimalEspecifico(String nombre) {
        for (Felino felino : felinos) {
            if (felino.getNombreCientifico().equalsIgnoreCase(nombre)) {
                return "\nAnimal: " + felino.getNombreCientifico() + "\n" + "Tipo: Felino\n" + "Costo de mantenimiento mensual: Q" + felino.getCostoMantenimietno() + "\n" + "Tamaño del recinto: " + felino.getAreaHabitad() + " metros cuadrados\n" + "Cantidad diaria de comida: " + felino.getAlimetacionDiaria() + " kg\n";
            }
        }
    
        for (Primate primate : primates) {
            if (primate.getNombreCientifico().equalsIgnoreCase(nombre)) {
                return "\nAnimal: " + primate.getNombreCientifico() + "\n" +"Tipo: Primate\n" + "Costo de mantenimiento mensual: Q" + primate.getCostoMantenimietno() + "\n" + "Tamaño del recinto: " + primate.getAreaHabitad() + " metros cuadrados\n" + "Cantidad diaria de comida: " + primate.getAlimetacionDiaria() + " kg\n";
            }
        }
    
        return "No se deberia poder ver esto";
    }

    public String mostrarInformacionAnimalEspecificoF(Felino felino) {

        return "\nAnimal: " + felino.getNombreCientifico() + "\n" + "Tipo: Felino\n" + "Costo de mantenimiento mensual: Q" + felino.getCostoMantenimietno() + "\n" + "Tamaño del recinto: " + felino.getAreaHabitad() + " metros cuadrados\n" + "Cantidad diaria de comida: " + felino.getAlimetacionDiaria() + " kg\n";
    }
    
    public String mostrarInformacionAnimalEspecificoP(Primate felino) {

        return "\nAnimal: " + felino.getNombreCientifico() + "\n" + "Tipo: Primate\n" + "Costo de mantenimiento mensual: Q" + felino.getCostoMantenimietno() + "\n" + "Tamaño del recinto: " + felino.getAreaHabitad() + " metros cuadrados\n" + "Cantidad diaria de comida: " + felino.getAlimetacionDiaria() + " kg\n";
    }

    public boolean revisarExistenciaHabitad(String nombre){
        for(String habitadS : habitad){
            if (habitadS.equals(nombre)) {
                return true;
            }
        }
        return false;

    }
    

}
