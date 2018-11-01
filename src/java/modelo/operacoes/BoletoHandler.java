
package modelo.operacoes;

import javax.swing.JOptionPane;
import modelo.operadores.Motorista;


public class BoletoHandler extends Pagamento{  
    @Override
    protected double handlePagamento(double valor, Motorista motorista) {
        double valorRestante = super.perguntaPagamento("Valor a ser pago no cartão: R$", valor);
        JOptionPane.showMessageDialog(null, "Gerando boleto para: \nValor restante: R$" + valorRestante 
                                    + " Motorista: " + motorista.getNomeCompleto());
        return valorRestante;
    }
}
