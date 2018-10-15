/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.operacoes;

import modelo.operadores.Motorista;
import modelo.operacoes.Forma_Pagamento;

public class Recarga {
    private int id;
    private int valor;
    private Forma_Pagamento formaPagamento;
    private Motorista motorista;

    public Recarga(int id, int valor, Forma_Pagamento formaPagamento, Motorista motorista) {
        this.id = id;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.motorista = motorista;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Forma_Pagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Forma_Pagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
    
    
}


    
    
    


    

    

    
    
  
