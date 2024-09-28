class Felino extends Mamifero{
    protected String especie;
    protected String colorPelaje;
    protected float tamanof;
    protected float tamanoCola;
    protected float vMax;



    public Felino(String nombreCientifico, String habitad, int esperanzaVida, double costoMantenimietno, float pesoKg, int tiempoGestion, boolean pelibroExticion, String pelaje, int criasCamada, String dieta, String tamano, float alimetacionDiaria, float areaHabitad, String especie, String colorPelaje, float tamanof, float tamanoCola, float vMax){
        super(nombreCientifico, habitad, esperanzaVida, costoMantenimietno, pesoKg, tiempoGestion,pelibroExticion, pelaje, criasCamada, dieta,tamano, alimetacionDiaria,areaHabitad);
        this.especie=especie;
        this.colorPelaje=colorPelaje;
        this.tamanof=tamanof;
        this.tamanoCola=tamanoCola;
        this.vMax=vMax;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getEspecie() {
        return especie;
    }
    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }
    public String getColorPelaje() {
        return colorPelaje;
    }
    public void setTamanof(float tamanof) {
        this.tamanof = tamanof;
    }
    public float getTamanof() {
        return tamanof;
    }
    public void setTamanoCola(float tamanoCola) {
        this.tamanoCola = tamanoCola;
    }
    public float getTamanoCola() {
        return tamanoCola;
    }
    public void setvMax(float vMax) {
        this.vMax = vMax;
    }
    public float getvMax() {
        return vMax;
    }
    
}
