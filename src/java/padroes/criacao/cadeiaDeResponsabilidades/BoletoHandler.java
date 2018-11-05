
package padroes.criacao.cadeiaDeResponsabilidades;

//import javax.swing.JOptionPane;
import modelo.operacoes.Pagamento;
import modelo.operadores.Motorista;


public class BoletoHandler extends Pagamento{  
    @Override
    protected double handlePagamento(double valor, Motorista motorista) {
        double valorRestante = super.perguntaPagamento("Valor a ser pago no cartão: R$", valor);
        System.out.println("\nGerando boleto com o valor restante: R$" + valorRestante);
        System.out.println("\nMotorista: " + motorista.getNomeCompleto());
        System.out.println("\nCPF: " + motorista.getCpf());
        //JOptionPane.showMessageDialog(null, "Gerando boleto para: \nValor restante: R$" + valorRestante 
        //                            + " Motorista: " + motorista.getNomeCompleto());
        return valorRestante;
    }
}
