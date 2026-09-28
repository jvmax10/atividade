package brasil;
import product.*;
public class FabricaBrasil implements FabricaCheckout {
 private final ContextoPedido c; public FabricaBrasil(ContextoPedido c){this.c=c;}
 public DocumentoFiscal criarDocumentoFiscal(){return new NotaFiscalBrasil(c);}
 public Pagamento criarPagamento(){return "boleto".equalsIgnoreCase(c.metodoPagamento()) ? new BoletoBrasil() : new PixBrasil();}
 public EtiquetaEnvio criarEtiqueta(){return new CorreiosBrasil();}
}
