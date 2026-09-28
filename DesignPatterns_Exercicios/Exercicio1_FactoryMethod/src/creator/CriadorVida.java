package creator;
import model.*; import java.util.concurrent.atomic.AtomicLong;
public class CriadorVida extends CriadorApolice { private static final AtomicLong SEQ=new AtomicLong(1); protected Apolice criarApolice(DadosContratacao d){return new ApoliceVida(String.format("VID-%06d",SEQ.getAndIncrement()),d);} }
