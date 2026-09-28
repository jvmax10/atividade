package brasil;
import product.*;
public class CorreiosBrasil implements EtiquetaEnvio { public String gerar(String endereco){return "Correios | CEP: 80000-000 | Endereço: "+endereco;} }
