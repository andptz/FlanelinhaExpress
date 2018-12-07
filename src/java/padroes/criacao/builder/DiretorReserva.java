
package padroes.criacao.builder;
import modelo.componentes.Vaga;
import modelo.componentes.Veiculo;
import modelo.operacoes.Pagamento;
import modelo.operacoes.Reserva;

public class DiretorReserva {
    public DiretorReserva(){}
    public Reserva builder(Pagamento pagamento, Veiculo veiculo, Vaga vaga, String horaReserva, String dataReserva, String horaSaida,double valor, String data, boolean status, String cnh, String placa, int ano, String modelo, String marca, String cor, int numero, String tipoPagamento)throws Exception{
        Reserva reserva = new Reserva();
        BuilderReserva BR = new BuilderReserva(reserva, pagamento, veiculo, vaga);
        BR.addReserva(horaReserva, dataReserva, horaSaida);
        //BR.addPagamento(valor, data, status, cnh, tipoPagamento);
        BR.addPagamento(pagamento, tipoPagamento);
        BR.addVeiculo(placa, ano, modelo, marca, cor, cnh);
        BR.addVaga(numero);
        return reserva;  
    }
}
