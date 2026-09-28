package creator;
import model.Apolice;
import model.DadosContratacao;
public abstract class CriadorApolice {
    protected abstract Apolice criarApolice(DadosContratacao dados);
    public final Apolice processarContratacao(DadosContratacao dados) {
        Apolice apolice = criarApolice(dados);
        apolice.validarCobertura();
        apolice.gerarResumo();
        return apolice;
    }
}
