
class Mamifero extends Animal{
    protected float pesoKg;
    protected int tiempoGestion;
    protected boolean peligroExtincion;
    protected String pelaje;
    protected int criasCamada;
    protected String dieta;
    protected String tamano;
    protected float alimetacionDiaria;
    protected float areaHabitad;

    public Mamifero(String nombreCientifico, String habitad, int esperanzaVida, double costoMantenimietno, float pesoKg, int tiempoGestion, boolean pelibroExticion, String pelaje, int criasCamada, String dieta, String tamano, float alimetacionDiaria, float areaHabitad){
        super(nombreCientifico, habitad, esperanzaVida, costoMantenimietno);
        this.pesoKg=pesoKg;
        this.tiempoGestion=tiempoGestion;
        this.peligroExtincion=pelibroExticion;
        this.pelaje=pelaje;
        this.criasCamada=criasCamada;
        this.dieta=dieta;
        this.tamano=tamano;
        this.alimetacionDiaria=alimetacionDiaria;
        this.areaHabitad=areaHabitad;
    }
    public void setPesoKg(float pesoKg) {
        this.pesoKg = pesoKg;
    }
    public float getPesoKg() {
        return pesoKg;
    }
    public void setTiempoGestion(int tiempoGestion) {
        this.tiempoGestion = tiempoGestion;
    }
    public int getTiempoGestion() {
        return tiempoGestion;
    }
    public void setPelibroExticion(boolean pelibroExticion) {
        this.peligroExtincion = pelibroExticion;
    }
    public boolean getPeligroEstincion() {
        return peligroExtincion;
    }
    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }
    public String getPelaje() {
        return pelaje;
    }
    public void setCriasCamada(int criasCamada) {
        this.criasCamada = criasCamada;
    }
    public int getCriasCamada() {
        return criasCamada;
    }
    public void setDieta(String dieta) {
        this.dieta = dieta;
    }
    public String getDieta() {
        return dieta;
    }
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    public String getTamano() {
        return tamano;
    }
    public void setAlimetacionDiaria(float alimetacionDiaria) {
        this.alimetacionDiaria = alimetacionDiaria;
    }
    public float getAlimetacionDiaria() {
        return alimetacionDiaria;
    }
    public void setAreaHabitad(float areaHabitad) {
        this.areaHabitad = areaHabitad;
    }
    public float getAreaHabitad() {
        return areaHabitad;
    }

    
}