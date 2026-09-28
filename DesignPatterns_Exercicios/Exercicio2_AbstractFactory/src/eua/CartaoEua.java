package eua;
import product.*;
public class CartaoEua implements Pagamento { public String processar(double valor){return String.format("Cartão de crédito | verificação AVS | total: US$ %.2f",valor);} }
