package model;
import java.util.List;
public class ApoliceAuto extends Apolice {
    private final DadosContratacao d;
    public ApoliceAuto(String numero, DadosContratacao d) { super(numero, d.segurado); this.d = d; }
    public double calcularPremio() { double anual = d.valorFipe * .08; if (d.idadeCondutor < 25) anual *= 1.30; if (d.anosHabilitacao < 2) anual *= 1.20; return anual / 12; }
    public void validarCobertura() { if (d.coberturaTerceiros < 50000) throw new IllegalArgumentException("Cobertura contra terceiros deve ser de no mínimo R$ 50.000,00."); }
    public List<String> listarDocumentos() { return List.of("CNH", "CRLV", "Comprovante de residência"); }
}
