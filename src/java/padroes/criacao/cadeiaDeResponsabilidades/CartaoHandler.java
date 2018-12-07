
package padroes.criacao.cadeiaDeResponsabilidades;
import modelo.operacoes.Pagamento;


public class CartaoHandler extends CadeiaPagamento {
    protected void handlerPagamento(Pagamento pagamento) {
        System.out.println("Realizado pagamento via Cartão de Crédito no valor de R$ " + pagamento.getValor() +"\n"
                + "Dados do cliente:\n" 
                + pagamento.getMotorista().getNomeCompleto() + "\n"
                + pagamento.getMotorista().getCpf() + "\n"
                + pagamento.getMotorista().getCnh());
    }
}
