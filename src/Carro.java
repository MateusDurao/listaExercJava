public class Carro {
    private String marca;
    private String modelo;
    private int ano;


    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro(){
        this("Desconhecido", "Desconhecido", 0);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        if (ano < 1886 || ano > 2026){
            System.out.println("Erro!!");
        }else {
            this.ano = ano;
        }
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
