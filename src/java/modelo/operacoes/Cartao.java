/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.operacoes;

import modelo.operacoes.Forma_Pagamento;

public class Cartao extends Forma_Pagamento{
    private String bandeira;
    private String numero;
    private int numParcelas;
    private Tipo_Cartao tipoCartao;

    public Cartao(String bandeira, String numero, int numParcelas, Tipo_Cartao tipoCartao, int id) {
        super(id);
        this.bandeira = bandeira;
        this.numero = numero;
        this.numParcelas = numParcelas;
        this.tipoCartao = tipoCartao;
    }

    public Cartao(String bandeira, String numero, int numParcelas, Tipo_Cartao tipoCartao) {
        this.bandeira = bandeira;
        this.numero = numero;
        this.numParcelas = numParcelas;
        this.tipoCartao = tipoCartao;
    }

    public Cartao(String bandeira, String numero, int numParcelas) {
        this.bandeira = bandeira;
        this.numero = numero;
        this.numParcelas = numParcelas;
    }
    
    public Cartao(){}

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getNumParcelas() {
        return numParcelas;
    }

    public void setNumParcelas(int numParcelas) {
        this.numParcelas = numParcelas;
    }

    public Tipo_Cartao getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(Tipo_Cartao tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    
}
