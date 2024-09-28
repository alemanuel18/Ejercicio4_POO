class Animal{
    protected String nombreCientifico;
    protected String habitad;
    protected int esperanzaVida;
    protected double costoMantenimietno;

    public Animal(String nombreCientifico, String habitad, int esperanzaVida, double costoMantenimietno){
        this.nombreCientifico=nombreCientifico;
        this.habitad=habitad;
        this.esperanzaVida=esperanzaVida;
        this.costoMantenimietno=costoMantenimietno;
    }

    public void setEsperanzaVida(int esperanzaVida) {
        this.esperanzaVida = esperanzaVida;
    }
    public int getEsperanzaVida() {
        return esperanzaVida;
    }
    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }
    public String getHabitad() {
        return habitad;
    }
    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }
    public String getNombreCientifico() {
        return nombreCientifico;
    }
    
    public void setCostoMantenimietno(float costoMantenimietno) {
        this.costoMantenimietno = costoMantenimietno;
    }
    public double getCostoMantenimietno() {
        return costoMantenimietno;
    }
    

}