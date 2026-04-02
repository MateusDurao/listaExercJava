//import java.util.ArrayList;
//import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        ArrayList<Carro> listaCarro = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);

        Carro c1 = new Carro("VW", "gol", 2026);

        Carro carro = new Carro();


        System.out.println("marca do carro: " + c1.getMarca() + "\nmodelo do carro: " + c1.getModelo() + "\nano de carro: " + c1.getAno());
        System.out.println("marca do carro: " + carro.getMarca() + "\nmodelo do carro: " + carro.getModelo() + "\nano de carro: " + carro.getAno());

        //o primeiro carro nasce com valores específicos e válidos definidos na hora da instanciação
        // ja o outro carro nasce com os valores ja pre definidos pelo metodo construtor sem parametros


    }
}