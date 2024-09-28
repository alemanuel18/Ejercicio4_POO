class Primate extends Mamifero{
    protected String especie;
    protected int inteligenciaLV;
    protected String estructuraSocial;
    protected float tamanoCerebro;

    public Primate(String nombreCientifico, String habitad, int esperanzaVida, double costoMantenimietno, float pesoKg, int tiempoGestion, boolean pelibroExticion, String pelaje, int criasCamada, String dieta, String tamano, float alimetacionDiaria, float areaHabitad, String especie, int inteligenciaLV, String estructuraSocial, float tamanoCerebro){
        super(nombreCientifico, habitad, esperanzaVida, costoMantenimietno, pesoKg, tiempoGestion,pelibroExticion, pelaje, criasCamada, dieta,tamano, alimetacionDiaria,areaHabitad);
        this.especie=especie;
        this.inteligenciaLV=inteligenciaLV;
        this.estructuraSocial=estructuraSocial;
        this.tamanoCerebro=tamanoCerebro;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getEspecie() {
        return especie;
    }
    public void setInteligenciaLV(int inteligenciaLV) {
        this.inteligenciaLV = inteligenciaLV;
    }
    public int getInteligenciaLV() {
        return inteligenciaLV;
    }
    public void setEstructuraSocial(String estructuraSocial) {
        this.estructuraSocial = estructuraSocial;
    }
    public String getEstructuraSocial() {
        return estructuraSocial;
    }
    public void setTamanoCerebro(int tamanoCerebro) {
        this.tamanoCerebro = tamanoCerebro;
    }
    public float getTamanoCerebro() {
        return tamanoCerebro;
    }
    
}
