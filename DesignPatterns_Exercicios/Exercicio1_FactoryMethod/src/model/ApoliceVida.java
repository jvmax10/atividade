package model;
import java.util.List;
public class ApoliceVida extends Apolice {
    private final DadosContratacao d;
    public ApoliceVida(String numero, DadosContratacao d) { super(numero, d.segurado); this.d = d; }
    public double calcularPremio() { double premio = (d.idadeSegurado * 12) + (d.capitalSegurado * .002); return d.fumante ? premio * 1.50 : premio; }
    public void validarCobertura() { if (d.capitalSegurado > 500000 && !d.possuiAtestadoMedico) throw new IllegalArgumentException("Capital acima de R$ 500.000,00 exige atestado médico."); }
    public List<String> listarDocumentos() { return d.capitalSegurado > 500000 ? List.of("Documento de identidade", "CPF", "Atestado médico") : List.of("Documento de identidade", "CPF"); }
}
