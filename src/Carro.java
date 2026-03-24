public class Carro {
    String marca;
    String modelo;
    int ano;


    public Carro(String marca, String modelo, int ano){
        this.modelo = modelo;
        this.marca = marca;
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


}
