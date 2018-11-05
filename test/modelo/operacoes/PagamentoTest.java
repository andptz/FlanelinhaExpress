/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.operacoes;

import modelo.operadores.Motorista;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import padroes.criacao.cadeiaDeResponsabilidades.IPagamentoHandler;

/**
 *
 * @author User
 */
public class PagamentoTest {
    
    public PagamentoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Pagamento.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Pagamento instance = new PagamentoImpl();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Pagamento.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Pagamento instance = new PagamentoImpl();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class Pagamento.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Pagamento instance = new PagamentoImpl();
        String expResult = "";
        String result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class Pagamento.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        String data = "";
        Pagamento instance = new PagamentoImpl();
        instance.setData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isStatus method, of class Pagamento.
     */
    @Test
    public void testIsStatus() {
        System.out.println("isStatus");
        Pagamento instance = new PagamentoImpl();
        boolean expResult = false;
        boolean result = instance.isStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Pagamento.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        boolean status = false;
        Pagamento instance = new PagamentoImpl();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMotorista method, of class Pagamento.
     */
    @Test
    public void testGetMotorista() {
        System.out.println("getMotorista");
        Pagamento instance = new PagamentoImpl();
        Motorista expResult = null;
        Motorista result = instance.getMotorista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMotorista method, of class Pagamento.
     */
    @Test
    public void testSetMotorista() {
        System.out.println("setMotorista");
        Motorista motorista = null;
        Pagamento instance = new PagamentoImpl();
        instance.setMotorista(motorista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class Pagamento.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Pagamento instance = new PagamentoImpl();
        double expResult = 0.0;
        double result = instance.getValor();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class Pagamento.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        double valor = 0.0;
        Pagamento instance = new PagamentoImpl();
        instance.setValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNextHandler method, of class Pagamento.
     */
    @Test
    public void testSetNextHandler() {
        System.out.println("setNextHandler");
        IPagamentoHandler handler = null;
        Pagamento instance = new PagamentoImpl();
        instance.setNextHandler(handler);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of processHandler method, of class Pagamento.
     */
    @Test
    public void testProcessHandler() {
        System.out.println("processHandler");
        String tipoPagamento = "";
        double valor = 0.0;
        Motorista motorista = null;
        Pagamento instance = new PagamentoImpl();
        instance.processHandler(tipoPagamento, valor, motorista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of perguntaPagamento method, of class Pagamento.
     */
    @Test
    public void testPerguntaPagamento() {
        System.out.println("perguntaPagamento");
        String mensagem = "";
        double valor = 0.0;
        Pagamento instance = new PagamentoImpl();
        double expResult = 0.0;
        double result = instance.perguntaPagamento(mensagem, valor);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handlePagamento method, of class Pagamento.
     */
    @Test
    public void testHandlePagamento() {
        System.out.println("handlePagamento");
        double valor = 0.0;
        Motorista motorista = null;
        Pagamento instance = new PagamentoImpl();
        double expResult = 0.0;
        double result = instance.handlePagamento(valor, motorista);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PagamentoImpl extends Pagamento {

        public double handlePagamento(double valor, Motorista motorista) {
            return 0.0;
        }
    }
    
}
