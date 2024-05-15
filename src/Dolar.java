public class Dolar extends Moeda{
    public Dolar(double valorMoeda){
        super(valorMoeda,"Dolar");

    }
    public void info(){
        System.out.println("Dolar: " +valorMoeda);

    }
    public double Converter(){
        return valorMoeda * 5.11;

    }
}
