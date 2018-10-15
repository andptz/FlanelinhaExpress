/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.operacoes;

import modelo.operacoes.Forma_Pagamento;

public class Paypal extends Forma_Pagamento{
    private String conta;

    public Paypal(String conta, int id) {
        super(id);
        this.conta = conta;
    }

    public Paypal(String conta) {
        this.conta = conta;
    }
    
    public Paypal(){}

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }
    
    
    
}
