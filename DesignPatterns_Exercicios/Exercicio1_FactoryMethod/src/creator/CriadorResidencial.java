package creator;
import model.*; import java.util.concurrent.atomic.AtomicLong;
public class CriadorResidencial extends CriadorApolice { private static final AtomicLong SEQ=new AtomicLong(1); protected Apolice criarApolice(DadosContratacao d){return new ApoliceResidencial(String.format("RES-%06d",SEQ.getAndIncrement()),d);} }
