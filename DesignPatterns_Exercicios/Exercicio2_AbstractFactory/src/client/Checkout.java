package client;
import product.*;
public class Checkout {
 public final String finalizar(FabricaCheckout fabrica, double valor, String endereco){
  DocumentoFiscal fiscal=fabrica.criarDocumentoFiscal(); Pagamento pagamento=fabrica.criarPagamento(); EtiquetaEnvio etiqueta=fabrica.criarEtiqueta();
  return "===== RELATÓRIO DO PEDIDO =====\n" + fiscal.gerar(valor)+"\n"+pagamento.processar(valor)+"\n"+etiqueta.gerar(endereco)+"\n";
 }
}
