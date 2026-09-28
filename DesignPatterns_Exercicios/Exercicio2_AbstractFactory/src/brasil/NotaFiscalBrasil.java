package brasil;
import product.*;
public class NotaFiscalBrasil implements DocumentoFiscal {
 private final ContextoPedido c; public NotaFiscalBrasil(ContextoPedido c){this.c=c;}
 public String gerar(double valor){String cfop=c.interestadual()?"6.102":"5.102"; double icms=c.interestadual()?.12:.18; return String.format("NF-e | CFOP %s | ICMS %.2f%% | Chave: 35260912345678000123550010000012345678901234 | Valor: R$ %.2f",cfop,icms*100,valor);}
}
