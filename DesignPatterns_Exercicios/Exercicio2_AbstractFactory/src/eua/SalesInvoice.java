package eua;
import product.*;
public class SalesInvoice implements DocumentoFiscal {
 private final ContextoPedido c; public SalesInvoice(ContextoPedido c){this.c=c;}
 public String gerar(double valor){double tax=switch(c.estadoEua()){case "California"->.0725;case "Texas"->.0625;case "Oregon"->0.0;default->0.0;}; return String.format("Sales Invoice | estado: %s | sales tax %.2f%% | EIN: %s | total: US$ %.2f",c.estadoEua(),tax*100,c.identificadorVendedor(),valor*(1+tax));}
}
