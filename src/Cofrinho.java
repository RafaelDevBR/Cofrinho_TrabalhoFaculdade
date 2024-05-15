import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Cofrinho {

    Scanner input = new Scanner(System.in);

    private ArrayList<Moeda> listarMoeda = new ArrayList<>();
    public void MenuCofre(){
        System.out.println("[1] Adicionar moeda ao cofre:");
        System.out.println("[2] Remover moedas do cofre:");
        System.out.println("[3] Listar moedas do cofre:");
        System.out.println("[4] Total de moeda convertidas para o real:");
        System.out.println("[5] Encerrar programa");

    }
    public void adicionarMoedas(){
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha a Moeda:");
        System.out.println("1 - REAL");
        System.out.println("2 - DOLAR");
        System.out.println("3 - EURO");
        int opcao = input.nextInt();
        double valor;
        switch (opcao){
            case 1:
                System.out.println("Digite o valor:");
                valor = input.nextDouble();
                listarMoeda.add(new Real(valor));
                break;
            case 2:
                System.out.println("Digite o valor:");
                valor = input.nextDouble();
                listarMoeda.add(new Dolar(valor));
                break;
            case 3:
                System.out.println("Digite o valor:");
                valor = input.nextDouble();
                listarMoeda.add(new Euro(valor));
                break;

        }

    }
    public void listar(){
        for( Moeda m: listarMoeda){
            m.info();
        }

    }
    public void remover(){
        if(listarMoeda.isEmpty()){
            System.out.println("O cofre esta vazio");
            return;
        }
        System.out.println("Escolha a Moeda:");
        System.out.println("1 - REAL");
        System.out.println("2 - DOLAR");
        System.out.println("3 - EURO");
        int opcaoMoeda = input.nextInt();
        String tipoMoeda;
        switch (opcaoMoeda){
            case 1:
                tipoMoeda = "Real";
                break;
            case 2:
                tipoMoeda = "Dolar";
                break;
            case 3:
                tipoMoeda = "Euro";
                break;

            default:
                System.out.println("Opção invalida");
                return;


        }
        System.out.println("Digite o valor:");
        double  valor = input.nextDouble();

        boolean MoedaEncontrada = false;
        Iterator<Moeda> iterator = listarMoeda.iterator();
        while(iterator.hasNext()){
            Moeda moeda = iterator.next();
            if(moeda.getMoeda().equals(tipoMoeda) && moeda.getValorMoeda() == valor){
                iterator.remove();
                MoedaEncontrada = true;
                break;
            }
        }
    }
    public double Somar(){

        double total = 0.0;
        for(Moeda moeda : listarMoeda){
            total+=moeda.Converter();
        }
        System.out.printf("Total convertido para real:%.2f\n",total);
        return  total;
    }


}
