/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.operacoes;

import modelo.operacoes.Cartao;

public class Tipo_Cartao {
    private int id;
    private String descricao;

    public Tipo_Cartao(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Tipo_Cartao(String descricao) {
        this.descricao = descricao;
    }
    
    public Tipo_Cartao(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
