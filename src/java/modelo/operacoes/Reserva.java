/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.operacoes;


import modelo.componentes.Veiculo;
import modelo.componentes.Vaga;
import modelo.operacoes.Pagamento;

public class Reserva {
    private int id;
    private String horaReserva;
    private String dataReserva;
    private String horaSaida;
    private Pagamento pagamento;
    private Veiculo veiculo;
    private Vaga vaga;

    public Reserva(int id, String horaReserva, String dataReserva, String horaSaida, Pagamento pagamento, Veiculo veiculo, Vaga vaga) {
        this.id = id;
        this.horaReserva = horaReserva;
        this.dataReserva = dataReserva;
        this.horaSaida = horaSaida;
        this.pagamento = pagamento;
        this.veiculo = veiculo;
        this.vaga = vaga;
    }

    

    public Reserva(){}

    public int getId() {
        return id;
    }

    public String getHoraReserva() {
        return horaReserva;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHoraReserva(String horaReserva) {
        if (horaReserva.equals(""))
            throw new IllegalArgumentException("Hora inválida");
        else
            this.horaReserva = horaReserva;
    }

    public void setDataReserva(String dataReserva) {
        if (dataReserva.equals(""))
            throw new IllegalArgumentException("Data inválida");
        else
            this.dataReserva = dataReserva;
    }
    
    
}


