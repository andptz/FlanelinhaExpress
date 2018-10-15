/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;
import java.util.ArrayList;
import modelo.componentes.Estacionamento;
import modelo.componentes.Vaga;
import modelo.locais.Bairro;
import modelo.locais.Cidade;
import modelo.operadores.Funcionario;
import modelo.locais.Endereco;
import modelo.locais.Estado;
import modelo.componentes.LocalizacaoGPS;
import modelo.utilidade.ClasseRelacoes;

/**
 *
 * @author Cacherow
 */
public class BuilderEstacionamento {
    private Estacionamento estacionamento;
    private Endereco endereco;
    private Vaga vaga;
    private Funcionario funcionario;
    private LocalizacaoGPS gps;
    

    public BuilderEstacionamento(Estacionamento estacionamento, Endereco endereco, Vaga vaga, Funcionario funcionario, LocalizacaoGPS gps) {
        this.estacionamento = estacionamento;
        this.endereco = endereco;
        this.vaga = vaga;
        this.funcionario = funcionario;
        this.gps = gps;
    }

    BuilderEstacionamento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addEstacionamento(String nome, double ValorHora){
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.setNome(nome);
        estacionamento.setValorHora(ValorHora);
        
    }

    public void addEndereco(String logradouro, String cep, String bairro, String cidade, String estado){
        Endereco endereco = new Endereco();
        endereco.setLogradouro(logradouro);
        endereco.setCep(cep);
        endereco.getBairro().setNome(bairro);
        endereco.getCidade().setNome(cidade);
        endereco.getEstado().setNome(estado);
        estacionamento.setEndereco(endereco);
    }
    
    public void addLocalizacao(String latitude, String longitude){
        LocalizacaoGPS gps = new LocalizacaoGPS();
        gps.setLatitude(latitude);
        gps.setLongitude(longitude);
        estacionamento.setGps(gps);
    }
    
    //Recebe um array com os códigos dos sensores das vagas, cria um vetor de vagas, adiciona as vagas a esse vetor, adicionar o vetor novo ao estacionamento
    public void addVaga(int[] Sensores){
        //Cria lista vagas aonde cada vaga vai estar atrelado a um sensor da lista
        ArrayList<Vaga> novasVagas = ClasseRelacoes.retornaVagas(Sensores);
        estacionamento.setListaVagas(novasVagas);
    }
    
    
    //Recebe matricula de um funcionário e busca se tal funcionário existe, se sim relaciona ao estacionamento, se não dá erro
    public void addFuncionario(String matricula){
        
        Funcionario funcionario = ClasseRelacoes.getFuncionario(matricula);        
        estacionamento.setFuncionario(funcionario);
    }
}
