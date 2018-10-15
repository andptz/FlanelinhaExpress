/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import modelo.componentes.Estacionamento;
import modelo.componentes.Vaga;
import modelo.operadores.Funcionario;
import builder.BuilderEstacionamento;
import modelo.componentes.LocalizacaoGPS;
import modelo.locais.Endereco;

/**
 *
 * @author Cacherow
 */
public class DiretorEstacionamento {
    public DiretorEstacionamento(){}
    public Estacionamento builder(Endereco endereco, Vaga vaga,Funcionario funcionario, LocalizacaoGPS gps, String nome, double ValorHora,String logradouro, String cep, String bairro, String cidade, String estado,String latitude, String longitude,int[] listaSensores,String matricula) throws Exception{
        Estacionamento estacionamento = new Estacionamento();
        BuilderEstacionamento BE = new BuilderEstacionamento(estacionamento,endereco,vaga,funcionario,gps);
        BE.addEndereco(logradouro, cep, bairro, cidade, estado);
        BE.addEstacionamento(nome, ValorHora);
        BE.addFuncionario(matricula);
        BE.addLocalizacao(latitude, longitude);
        BE.addVaga(listaSensores);
        return estacionamento;
    }
}
