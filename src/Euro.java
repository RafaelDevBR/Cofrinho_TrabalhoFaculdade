public class Euro extends Moeda {
    public Euro(double valorMoeda){
        super(valorMoeda,"Euro");
    }

    void info(){
        System.out.println("Euro: " +valorMoeda);
    }
    @Override
    public double Converter(){
        return valorMoeda * 6.2;
    }
}
