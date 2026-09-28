package client;
import product.*;
public final class SeletorFabrica {
 private SeletorFabrica(){}
 public static FabricaCheckout selecionar(String pais, ContextoPedido c){
  try {
   String p=pais.trim();
   String nomeClasse="Fabrica"+Character.toUpperCase(p.charAt(0))+p.substring(1).toLowerCase();
   String pacote=p.toLowerCase();
   return (FabricaCheckout)Class.forName(pacote+"."+nomeClasse).getDeclaredConstructor(ContextoPedido.class).newInstance(c);
  } catch(Exception e){throw new IllegalArgumentException("País não suportado: "+pais,e);}
 }
}
