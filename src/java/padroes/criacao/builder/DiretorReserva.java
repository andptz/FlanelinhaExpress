/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroes.criacao.builder;
import modelo.componentes.Vaga;
import modelo.componentes.Veiculo;
import modelo.operacoes.Pagamento;
import modelo.operacoes.Reserva;
import modelo.operadores.Motorista;
import modelo.utilidade.ClasseRelacoes;
/**
 *
 * @author Cacherow
 */
public class DiretorReserva {
    public DiretorReserva(){}
    public Reserva builder(Pagamento pagamento, Veiculo veiculo, Vaga vaga, String horaReserva, String dataReserva, String horaSaida,double valor, String data, boolean status, String cnh, String placa, int ano, String modelo, String marca, String cor, int numero, String tipoPagamento)throws Exception{
        Reserva reserva = new Reserva();
        BuilderReserva BR = new BuilderReserva(reserva, pagamento, veiculo, vaga);
        BR.addReserva(horaReserva, dataReserva, horaSaida);
        BR.addPagamento(valor, data, status, cnh, tipoPagamento);
        BR.addVeiculo(placa, ano, modelo, marca, cor, cnh);
        BR.addVaga(numero);
        return reserva;  
    }
}
