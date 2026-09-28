package eua;
import product.*;
public class FabricaEua implements FabricaCheckout {
 private final ContextoPedido c; public FabricaEua(ContextoPedido c){this.c=c;}
 public DocumentoFiscal criarDocumentoFiscal(){return new SalesInvoice(c);} public Pagamento criarPagamento(){return new CartaoEua();} public EtiquetaEnvio criarEtiqueta(){return new Usps();}
}
