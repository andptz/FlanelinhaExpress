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
public class BuilderReserva {
    private Reserva reserva;
    private Pagamento pagamento;
    private Veiculo veiculo;
    private Vaga vaga;

    public BuilderReserva(Reserva reserva, Pagamento pagamento, Veiculo veiculo, Vaga vaga) {
        this.reserva = reserva;
        this.pagamento = pagamento;
        this.veiculo = veiculo;
        this.vaga = vaga;
    }

    
    public void addReserva(String horaReserva, String dataReserva, String horaSaida){
        Reserva reserva = new Reserva();
        reserva.setDataReserva(dataReserva);
        reserva.setHoraReserva(horaReserva);
        reserva.setHoraSaida(horaSaida);
    }
    
    //Adiciona os atributos de Pagamento, relaciona cnh com um motorista existente e adiciona Pagamento à reserva
    public void addPagamento(double valor, String data, boolean status, String cnh){
        Pagamento pagamento = new Pagamento();
        pagamento.setValor(valor);
        pagamento.setData(data);
        pagamento.setStatus(status);
        
        Motorista motorista = ClasseRelacoes.getMotorista(cnh);
        pagamento.setMotorista(motorista);
        reserva.setPagamento(pagamento) ;
    }
    
    //Adiciona os atributos de veiculo e relaciona o motorista do veiculo
    public void addVeiculo(String placa, int ano, String modelo, String marca, String cor, String cnh){
        Veiculo veiculo =  new Veiculo();
        veiculo.setPlaca(placa);
        veiculo.setAno(ano);
        veiculo.setCor(cor);
        veiculo.setMarca(marca);
        veiculo.setModelo(modelo);
        
        Motorista motorista = ClasseRelacoes.getMotorista(cnh);
        veiculo.setMotorista(motorista);
        
        reserva.setVeiculo(veiculo);
    }
    
    //Relaciona a vaga à reserva
    public void addVaga(int numero){
        Vaga vaga = ClasseRelacoes.getVaga(numero);
        reserva.setVaga(vaga);
    }
}
