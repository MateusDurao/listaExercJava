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


        Carro.imprimirTotal();

        //Um metodo static não consegue acessar um atributo de instância
        // diretamente porque eles operam em contextos de memória diferentes.

    }
}