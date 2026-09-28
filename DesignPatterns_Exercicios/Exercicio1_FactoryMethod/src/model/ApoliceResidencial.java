package model;
import java.util.List;
public class ApoliceResidencial extends Apolice {
    private final DadosContratacao d;
    public ApoliceResidencial(String numero, DadosContratacao d) { super(numero, d.segurado); this.d = d; }
    public double calcularPremio() { double anual = d.valorImovel * .015; if (d.altoPadrao) anual *= 1.25; return anual / 12; }
    public void validarCobertura() { if (!d.possuiEscrituraOuLocacao) throw new IllegalArgumentException("É obrigatória escritura ou contrato de locação."); }
    public List<String> listarDocumentos() { return List.of("Escritura ou contrato de locação", "Comprovante de residência"); }
}
