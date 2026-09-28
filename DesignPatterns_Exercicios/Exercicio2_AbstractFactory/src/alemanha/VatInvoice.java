package alemanha;
import product.*;
public class VatInvoice implements DocumentoFiscal {
 private final ContextoPedido c; public VatInvoice(ContextoPedido c){this.c=c;}
 public String gerar(double valor){double vat=c.produtoEssencial()?.07:.19; return String.format("VAT Invoice | Umsatzsteuer %.2f%% | VAT-ID: %s | total: EUR %.2f",vat*100,c.identificadorVendedor(),valor*(1+vat));}
}
