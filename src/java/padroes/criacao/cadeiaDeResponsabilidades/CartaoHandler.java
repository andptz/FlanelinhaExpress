
package padroes.criacao.cadeiaDeResponsabilidades;

import javax.swing.JOptionPane;
import modelo.operacoes.CadeiaPagamento;
import modelo.operacoes.Pagamento;
import modelo.operadores.Motorista;


public class CartaoHandler extends CadeiaPagamento {
    @Override
    protected void handlePagamento(Pagamento pagamento) {
        System.out.println("Realizado pagamento via Cartão de Crédito no valor de R$ " + pagamento.getValor() +"\n"
                + "Dados do cliente:\n" 
                + pagamento.getMotorista().getNomeCompleto() + "\n"
                + pagamento.getMotorista().getCpf() + "\n"
                + pagamento.getMotorista().getCnh());
    }
}
