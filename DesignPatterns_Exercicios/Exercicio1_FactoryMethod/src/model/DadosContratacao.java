package model;

public class DadosContratacao {
    public final String segurado;
    public final double valorFipe;
    public final int idadeCondutor;
    public final int anosHabilitacao;
    public final double coberturaTerceiros;
    public final double valorImovel;
    public final boolean altoPadrao;
    public final boolean possuiEscrituraOuLocacao;
    public final int idadeSegurado;
    public final boolean fumante;
    public final double capitalSegurado;
    public final boolean possuiAtestadoMedico;
    public final int diasViagem;
    public final boolean internacional;
    public final double coberturaAssistenciaUsd;
    public final boolean possuiPassaporte;

    public DadosContratacao(String segurado, double valorFipe, int idadeCondutor, int anosHabilitacao,
                            double coberturaTerceiros, double valorImovel, boolean altoPadrao,
                            boolean possuiEscrituraOuLocacao, int idadeSegurado, boolean fumante,
                            double capitalSegurado, boolean possuiAtestadoMedico, int diasViagem,
                            boolean internacional, double coberturaAssistenciaUsd, boolean possuiPassaporte) {
        this.segurado = segurado; this.valorFipe = valorFipe; this.idadeCondutor = idadeCondutor;
        this.anosHabilitacao = anosHabilitacao; this.coberturaTerceiros = coberturaTerceiros;
        this.valorImovel = valorImovel; this.altoPadrao = altoPadrao;
        this.possuiEscrituraOuLocacao = possuiEscrituraOuLocacao; this.idadeSegurado = idadeSegurado;
        this.fumante = fumante; this.capitalSegurado = capitalSegurado;
        this.possuiAtestadoMedico = possuiAtestadoMedico; this.diasViagem = diasViagem;
        this.internacional = internacional; this.coberturaAssistenciaUsd = coberturaAssistenciaUsd;
        this.possuiPassaporte = possuiPassaporte;
    }

    public static DadosContratacao auto(String nome, double fipe, int idade, int habilitacao, double terceiros) {
        return new DadosContratacao(nome, fipe, idade, habilitacao, terceiros, 0, false, false, 0, false, 0, false, 0, false, 0, false);
    }
    public static DadosContratacao residencial(String nome, double imovel, boolean alto, boolean documento) {
        return new DadosContratacao(nome, 0, 0, 0, 0, imovel, alto, documento, 0, false, 0, false, 0, false, 0, false);
    }
    public static DadosContratacao vida(String nome, int idade, boolean fumante, double capital, boolean atestado) {
        return new DadosContratacao(nome, 0, 0, 0, 0, 0, false, false, idade, fumante, capital, atestado, 0, false, 0, false);
    }
    public static DadosContratacao viagem(String nome, int dias, boolean internacional, double coberturaUsd, boolean passaporte) {
        return new DadosContratacao(nome, 0, 0, 0, 0, 0, false, false, 0, false, 0, false, dias, internacional, coberturaUsd, passaporte);
    }
}
