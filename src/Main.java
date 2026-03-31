//import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Carro> listaCarro = new ArrayList<>();

        Carro c1 = new Carro();
        c1.setMarca("Volkswagen");
        c1.setModelo("T-cross");
        c1.setAno(2024);


        System.out.println("marca do carro: " + c1.getMarca() + "\n modelo do carro: " + c1.getModelo() + "\n ano de carro: " + c1.getAno());
    }
}