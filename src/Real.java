public class Real extends Moeda {
    public Real(double valorMoeda){
        super(valorMoeda, "Real");

    }
    void info(){
        System.out.println("Real: " +valorMoeda);

    }

    public double Converter() {
        return valorMoeda;
    }
}
