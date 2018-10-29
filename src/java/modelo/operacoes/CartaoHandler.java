
package modelo.operacoes;

import javax.swing.JOptionPane;
import modelo.operadores.Motorista;


public class CartaoHandler extends Pagamento{
    
    @Override
    protected double handlePagamento(double valor) {
        double valorRestante = super.perguntaPagamento("Valor a ser pago no cartão: R$", valor);
        JOptionPane.showMessageDialog(null, "Conectando com a administradora do cartão... - Valor restante: R$" + valorRestante);
        return valorRestante;
    }
    
}
