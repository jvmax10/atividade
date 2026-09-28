package eua;
import product.*;
public class Usps implements EtiquetaEnvio { public String gerar(String endereco){return "USPS | ZIP+4: 90210-1234 | Endereço: "+endereco;} }
