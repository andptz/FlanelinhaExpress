
package modelo.operacoes;

import modelo.operadores.Motorista;


public interface IPagamentoHandler {
    public void setNextHandler(IPagamentoHandler handler);
    public void processHandler(String tipoPagamento, double valor, Motorista motorista);
}
