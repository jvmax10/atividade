package brasil;
import product.*;
public class PixBrasil implements Pagamento { public String processar(double valor){return String.format("Pix | desconto 5%% | total: R$ %.2f",valor*.95);} }
