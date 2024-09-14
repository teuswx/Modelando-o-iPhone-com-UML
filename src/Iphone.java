import funcoes.*;
public class Iphone {
    public static void main(String[] args) throws Exception {
        AparelhoTelefonico aparelho = new AparelhoTelefonico();
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        NavegadorInternet navegador = new NavegadorInternet();

        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica("Bad one");

        aparelho.ligar("(37) 998675423");
        aparelho.atender();
        aparelho.iniciarCorreioVoz();

        navegador.exibirPagina("https://web.dio.me/track/coding-the-future-claro-java-spring-boot");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}