package alemanha;
import product.*;
public class Sepa implements Pagamento { public String processar(double valor){return String.format("SEPA Direct Debit | total: EUR %.2f",valor);} }
