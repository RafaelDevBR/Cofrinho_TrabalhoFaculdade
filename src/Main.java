import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cofrinho menu = new Cofrinho();
        Cofrinho moeda = new Cofrinho();
        Scanner input = new Scanner(System.in);
        int opcaoMenu;
        while (true){
            menu.MenuCofre();
            opcaoMenu= input.nextInt();

            if(opcaoMenu == 1){
                moeda.adicionarMoedas();
            }else if(opcaoMenu == 2){
                moeda.remover();
            }else if(opcaoMenu == 3){
                moeda.listar();
            }else if(opcaoMenu == 4){
                moeda.Somar();

            }else if( opcaoMenu  == 5){

                break;
            }
        }





    }
}