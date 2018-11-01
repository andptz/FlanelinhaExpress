
package modelo.operacoes;

import java.awt.List;
import javax.swing.JOptionPane;
import modelo.operadores.Motorista;

public abstract class Pagamento implements IPagamentoHandler{
    private int id;
    private double valor;
    private String data;
    private boolean status;
    private Motorista motorista;

    public Pagamento(int id, double valor, String data, boolean status, Motorista motorista) {
        this.id = id;
        this.valor = valor;
        this.data = data;
        this.status = status;
        this.motorista = motorista;
    }

    public Pagamento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor!=0)
            this.valor = valor;
        else
             throw new IllegalArgumentException("Valor vazio");
    }
    
    
    private IPagamentoHandler pagamentoHandler;
    @Override
    public void setNextHandler(IPagamentoHandler handler){
        this.pagamentoHandler = handler;
    }
    
    
    public void processHandler(String tipoPagamento, double valor, Motorista motorista){
        
        if (this.getClass().getName().equalsIgnoreCase(tipoPagamento))
            valor = handlePagamento(valor, motorista);
        
        if (pagamentoHandler != null && valor > 0)
            this.pagamentoHandler.processHandler(tipoPagamento, valor, motorista);
    }
    
    
    protected double perguntaPagamento(String mensagem, double valor){
        String valorPagamento = JOptionPane.showInputDialog("Valor: ");
        double valorRestante = valor - Double.parseDouble(valorPagamento);
        return valorRestante;
    }
    
    protected abstract double handlePagamento(double valor, Motorista motorista);
}
