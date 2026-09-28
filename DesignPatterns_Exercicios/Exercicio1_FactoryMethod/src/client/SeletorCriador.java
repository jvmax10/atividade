package client;
import creator.CriadorApolice;
public final class SeletorCriador {
    private SeletorCriador() {}
    public static CriadorApolice selecionar(String tipo) {
        try {
            String nome = "creator.Criador" + Character.toUpperCase(tipo.charAt(0)) + tipo.substring(1).toLowerCase();
            return (CriadorApolice) Class.forName(nome).getDeclaredConstructor().newInstance();
        } catch (ReflectiveOperationException | RuntimeException e) { throw new IllegalArgumentException("Tipo de apólice não suportado: " + tipo, e); }
    }
}
