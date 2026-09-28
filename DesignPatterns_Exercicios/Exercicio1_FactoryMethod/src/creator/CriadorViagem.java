package creator;
import model.*; import java.util.concurrent.atomic.AtomicLong;
public class CriadorViagem extends CriadorApolice { private static final AtomicLong SEQ=new AtomicLong(1); protected Apolice criarApolice(DadosContratacao d){return new ApoliceViagem(String.format("VIA-%06d",SEQ.getAndIncrement()),d);} }
