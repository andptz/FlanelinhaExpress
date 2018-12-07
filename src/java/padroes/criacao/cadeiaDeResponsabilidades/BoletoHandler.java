
package padroes.criacao.cadeiaDeResponsabilidades;

//import javax.swing.JOptionPane;
//import modelo.operacoes.CadeiaPagamento;
import modelo.operacoes.Pagamento;
//import modelo.operadores.Motorista;


public class BoletoHandler extends CadeiaPagamento {
    protected void handlerPagamento(Pagamento pagamento) {
        System.out.println("Realizado pagamento via Boleto no valor de R$ " + pagamento.getValor() +"\n"
                + "Dados do cliente:\n" 
                + pagamento.getMotorista().getNomeCompleto() + "\n"
                + pagamento.getMotorista().getCpf() + "\n"
                + pagamento.getMotorista().getCnh());
    }
}
