
package padroes.criacao.cadeiaDeResponsabilidades;

import modelo.operacoes.Pagamento;

public interface IPagamentoHandler {
    public void setNextHandler(IPagamentoHandler handler);
    public void processHandler(String tipoPagamento, Pagamento pagamento);
}