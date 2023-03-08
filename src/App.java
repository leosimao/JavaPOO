public class App {
    public static void main(String[] args) throws Exception {
        int contagem = 0;
        Carro camaro = new Carro();
        camaro.cor = "amarelo";

        Anunciante leonardo = new Anunciante();
        leonardo.nome = "Leonardo";
        
        System.out.println(leonardo.nome);
    };
}