package Animais;

public class Cachorro extends Animal{
    //ATRIBUTOS (STRING)
    static int numeroDeCachorros;
    private int tamanhoDoRabo;
    private String estadoDeEspirito;

    //CONSTRUTORES

    //construtor padrão - não recebe atributos
//    public Cachorro(){}

    //construtores adicionados - incluem informações necessarias
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        super(nome, cor, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeCachorros ++;
    }

    //METODOS

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public String getNome() { return this.nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }
    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }
//    public String getEstadoDeEspirito() {
//        return estadoDeEspirito;
//    }


    public String pegar() { return "Bolinha"; }
    public String interagir(String acao) {

        //enum (switch)
        switch (acao){
            case "Carinho": this.estadoDeEspirito = "Feliz";break;
            case "Vai dormir!": this.estadoDeEspirito = "Bravo";break;
            case "Pisar na patinha": this.estadoDeEspirito = "Triste";break;
            default: this.estadoDeEspirito = "Neutro";break;
        }

        return this.estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("AU AU!");
    }
}


//        if (acao.equals("carinho")){
//            this.estadoDeEspirito = "Feliz";
//        }else if (acao.equals("vai dormir!")){
//            this.estadoDeEspirito = "Bravo";
//        }else{
//            this.estadoDeEspirito = "Neutro";
//        }
//        return estadoDeEspirito;
//    }
//
//}
