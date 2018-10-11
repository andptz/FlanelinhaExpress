/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.utilidade;

import java.util.ArrayList;
import modelo.componentes.Vaga;
import modelo.operadores.Funcionario;
import modelo.operadores.Motorista;

/**
 *
 * @author 20131BSI0084
 */
public class ClasseRelacoes {
    
    //private static ArrayList<Vaga> listaSensor;
    private static int[] listaSensor;
    private static ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
    private static ArrayList<Motorista> listaMotoristas = new ArrayList<Motorista>();
    private static ArrayList<Vaga> listaVagas = new ArrayList<Vaga>();

    public ClasseRelacoes() {
    }
    
    public static ArrayList<Vaga> retornaVagas(int[] listaSensor){
        ArrayList<Vaga> novasVagas = new ArrayList<Vaga>(){};
        for(int i=0;i<listaSensor.length;i++){
            Vaga vaga = new Vaga();
            vaga.setCodigo(listaSensor[i]);
            novasVagas.add(vaga);
        }
        return novasVagas;
    }
    
    
     public static void addFuncionario(Funcionario funcionario){
         ClasseRelacoes.listaFuncionarios.add(funcionario);         
     }
     
     public static Motorista getMotorista(String cnh){
        int i = 0;
        for(;cnh != listaMotoristas.get(i).getCnh() || i<listaMotoristas.size() ;i++){}
        if (cnh == listaMotoristas.get(i).getCnh()){
                return listaMotoristas.get(i);
        }
        else{
            return null;
        }
    }
     
    public static Vaga getVaga(int numero){
        int i = 0;
        for(;numero != listaVagas.get(i).getCodigo() || i<listaVagas.size() ;i++){}
        if (numero == listaVagas.get(i).getCodigo()){
                return listaVagas.get(i);
        }
        else{
            return null;
        }
    }

     public static Funcionario getFuncionario(String matricula){
        int i = 0;
        for(;matricula != listaFuncionarios.get(i).getMatricula() || i<listaFuncionarios.size() ;i++){}
        if (matricula == listaFuncionarios.get(i).getMatricula()){
                return listaFuncionarios.get(i);
        }
        else{
            return null;
        }
    }
}
