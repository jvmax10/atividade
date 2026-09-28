package model;

import java.time.LocalDate;
import java.util.List;

public abstract class Apolice {
    private final String numero;
    private final String segurado;
    private final LocalDate dataEmissao;

    protected Apolice(String numero, String segurado) {
        this.numero = numero;
        this.segurado = segurado;
        this.dataEmissao = LocalDate.now();
    }

    public abstract double calcularPremio();
    public abstract void validarCobertura();
    public abstract List<String> listarDocumentos();

    public String gerarResumo() {
        validarCobertura();
        return "Apólice: " + numero + "\n" +
               "Segurado: " + segurado + "\n" +
               "Data de emissão: " + dataEmissao + "\n" +
               String.format("Prêmio: R$ %.2f%n", calcularPremio()) +
               "Documentos exigidos: " + String.join(", ", listarDocumentos());
    }

    public String getNumero() { return numero; }
    public String getSegurado() { return segurado; }
}
