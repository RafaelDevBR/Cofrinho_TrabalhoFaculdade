abstract public class Moeda {
    protected double valorMoeda;
    protected String tipoMoeda;

    public Moeda(double valorMoeda, String tipoMoeda){
        this.valorMoeda = valorMoeda;
        this.tipoMoeda = tipoMoeda;
    }
    public double getValorMoeda(){
        return valorMoeda;
    }
    public String getMoeda(){
        return tipoMoeda;
    }
    abstract void info();
    abstract double Converter();
}
