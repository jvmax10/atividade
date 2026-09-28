package alemanha;
import product.*;
public class FabricaAlemanha implements FabricaCheckout {
 private final ContextoPedido c; public FabricaAlemanha(ContextoPedido c){this.c=c;}
 public DocumentoFiscal criarDocumentoFiscal(){return new VatInvoice(c);} public Pagamento criarPagamento(){return new Sepa();} public EtiquetaEnvio criarEtiqueta(){return new DeutschePost();}
}
