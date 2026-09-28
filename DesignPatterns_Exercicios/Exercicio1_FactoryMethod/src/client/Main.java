package client;
import model.*; import creator.CriadorApolice;
public class Main {
    public static void main(String[] args) {
        emitir("auto", DadosContratacao.auto("João Silva", 80000, 23, 1, 60000));
        emitir("residencial", DadosContratacao.residencial("Maria Souza", 600000, true, true));
        emitir("vida", DadosContratacao.vida("Carlos Lima", 40, false, 300000, false));
        emitir("viagem", DadosContratacao.viagem("Ana Costa", 10, true, 50000, true));
    }
    private static void emitir(String tipo, DadosContratacao dados) {
        CriadorApolice criador = SeletorCriador.selecionar(tipo);
        Apolice apolice = criador.processarContratacao(dados);
        System.out.println("===== " + tipo.toUpperCase() + " =====");
        System.out.println(apolice.gerarResumo());
        System.out.println();
    }
}
