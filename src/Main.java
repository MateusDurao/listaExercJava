//import java.util.ArrayList;
//import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        ArrayList<Carro> listaCarro = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);

        Carro c1 = new Carro("VW", "gol", 2026);
        Carro c2 = new Carro("toyota", "rav4", 2025);
        Carro c3 = new Carro("genesis", "g80", 2025);
        Carro c4 = new Carro("ferrari", "sf90", 2022);
        Carro c5 = new Carro("skoda", "octavia", 2010);


        System.out.println(Carro.getTotalCarros());

        //acessando Carro.totalCarros a gente acessa o valor do atributo que
        //não esta associado a mais nenhum objeto, a gente pega um valor que esta
        //associado a classe, e nao a um objeto

        //atributos static pertencem a classe e são compartilhados por todos os
        //objetos, ja os atributos de instância pertencem a cada objeto
        //de forma individual


    }
}