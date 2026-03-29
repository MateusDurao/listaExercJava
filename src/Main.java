import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carro> listaCarro = new ArrayList<>();


        Carro carro1 = new Carro("tuffCars", "67", 2025);
        listaCarro.add(carro1);
        Carro carro2 = new Carro("tuffCars", "61", 2025);
        listaCarro.add(carro2);
        Carro carro3 = new Carro("tuffCars", "41", 2025);
        listaCarro.add(carro3);


        for(Carro c : listaCarro){
            c.Exibir();
        }




//        carro1.Exibir(); // esse metodo retorna valor
//        int idade = carro1.idadeDoCarro(); // esse metodo executa uma ação
//        System.out.println("idade do carro: " + idade);



    }
}