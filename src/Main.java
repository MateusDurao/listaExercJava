//import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Carro> listaCarro = new ArrayList<>();

        Carro c1 = new Carro("VW", "gol", 2026);
        Carro c2 = new Carro("VW", "gol", 2026);
        //usando metodo construtor o código fica mais legivel



        System.out.println("marca do carro: " + c1.getMarca() + "\nmodelo do carro: " + c1.getModelo() + "\nano de carro: " + c1.getAno());
        System.out.println("marca do carro: " + c2.getMarca() + "\nmodelo do carro: " + c2.getModelo() + "\nano de carro: " + c2.getAno());
    }
}