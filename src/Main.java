public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("tuffCars", "67", 2025);
        Carro carro2 = new Carro("tuffCars", "61", 2025);

//        System.out.println("1º carro \n marca: " + carro1.marca + "\n modelo: " + carro1.modelo + "\n ano: " + carro1.ano);
//        System.out.println("2º carro \n marca: " + carro2.marca + "\n modelo: " + carro2.modelo + "\n ano: " + carro2.ano);

        carro1.Exibir(); // esse metodo retorna valor
        int idade = carro1.idadeDoCarro(); // esse metodo executa uma ação
        System.out.println("idade do carro: " + idade);



    }
}