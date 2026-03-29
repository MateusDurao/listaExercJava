public class Carro {
    String marca;
    String modelo;
    int ano;


    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }


    public void Exibir(){
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("ano: " + ano);
    }

    public int idadeDoCarro(){
        return 2026 - ano;
    }
}
