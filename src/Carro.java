public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private static int totalCarros = 0;

    public void incrementTotalCarros(){
        totalCarros++;
    }

    public static final int ANO_PRIMEIRO_CARRO = 1886;

    public void setAno(int ano) {
        int anoAtual = java.time.Year.now().getValue();

        if (ano < ANO_PRIMEIRO_CARRO || ano > anoAtual) {
            System.out.println("Ano Inválido! Deve estar entre " + ANO_PRIMEIRO_CARRO + " e " + anoAtual);
        }
    }
    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        incrementTotalCarros();
    }

    public Carro(){
        this("Desconhecido", "Desconhecido", 0);
        incrementTotalCarros();
    }

    public static void imprimirTotal() {
        System.out.println("Total de carros criados: " + totalCarros);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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

    public static int getTotalCarros() {
        return totalCarros;
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
