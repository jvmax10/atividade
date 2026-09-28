package model;
import java.util.List;
public class ApoliceViagem extends Apolice {
    private final DadosContratacao d;
    public ApoliceViagem(String numero, DadosContratacao d) { super(numero, d.segurado); this.d = d; }
    public double calcularPremio() { return d.diasViagem * 15.0 + (d.internacional ? 100.0 : 0.0); }
    public void validarCobertura() { if (d.internacional && (d.coberturaAssistenciaUsd < 30000 || !d.possuiPassaporte)) throw new IllegalArgumentException("Viagem internacional exige assistência médica mínima de US$ 30.000,00 e passaporte."); }
    public List<String> listarDocumentos() { return d.internacional ? List.of("Itinerário de viagem", "Passaporte") : List.of("Itinerário de viagem"); }
}
