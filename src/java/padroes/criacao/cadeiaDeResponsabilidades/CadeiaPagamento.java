
package padroes.criacao.cadeiaDeResponsabilidades;
import modelo.operacoes.Pagamento;

public abstract class CadeiaPagamento implements IPagamentoHandler{
    private IPagamentoHandler pagamentoHandler;
    
    @Override
    public void setNextHandler(IPagamentoHandler handler){
        this.pagamentoHandler = handler;
    }
        
    @Override
    public void processHandler(String tipoPagamento, Pagamento pagamento){
        if (pagamento.getValor()>0){
            if (tipoPagamento.equalsIgnoreCase("cartão de crédito")){
                this.pagamentoHandler.processHandler(tipoPagamento, pagamento);
            }
            else{
                this.setNextHandler(pagamentoHandler);
            }
        }
        else
            System.out.println("Valor inválido!");
    }
}

