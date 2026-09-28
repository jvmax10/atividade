package client;
import product.*;
public class Main {
 public static void main(String[] args){Checkout checkout=new Checkout();
  System.out.println(checkout.finalizar(SeletorFabrica.selecionar("Brasil",new ContextoPedido("PR","",false,false,"CNPJ 12.345.678/0001-90","pix")),1000,"Curitiba - PR"));
  System.out.println(checkout.finalizar(SeletorFabrica.selecionar("EUA",new ContextoPedido("","California",false,false,"EIN 12-3456789","cartao")),1000,"Los Angeles, CA"));
  System.out.println(checkout.finalizar(SeletorFabrica.selecionar("Alemanha",new ContextoPedido("","",false,true,"VAT-ID DE123456789","sepa")),1000,"Berlin, Germany"));
 }
}
