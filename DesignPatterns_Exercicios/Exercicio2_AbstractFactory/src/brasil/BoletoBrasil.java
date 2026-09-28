package brasil;
import product.*;
public class BoletoBrasil implements Pagamento { public String processar(double valor){return String.format("Boleto | compensação: 3 dias úteis | total: R$ %.2f",valor);} }
