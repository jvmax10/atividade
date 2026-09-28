package creator;
import model.*; import java.util.concurrent.atomic.AtomicLong;
public class CriadorAuto extends CriadorApolice { private static final AtomicLong SEQ=new AtomicLong(1); protected Apolice criarApolice(DadosContratacao d){return new ApoliceAuto(String.format("AUTO-%06d",SEQ.getAndIncrement()),d);} }
