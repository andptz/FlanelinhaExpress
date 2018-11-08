package controlPaginasWeb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PagLogin extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. 
                
                Modelo do Carro: <input type="text" name="modelo_car" /><br />
                Placa: <input type="text" name="placa" /><br />
                Renavam: <input type="text" name="renavam" /><br />
                Ano: <input type="text" name="ano" /><br />            
                Kilometragem: <input type="text" name="kilometragem" /><br />
                Acessório: <input type="text" name="acessorio" /><br />            
                Valor: <input type="text" name="valor" /><br />  
            
            
            */
            
            response.sendRedirect("pagPosLogin/generic.html");
            
            
            
        } finally {
            out.close();
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    public String getServletInfo() {
        return "Servlet Recebe Dados";
    }// </editor-fold>

}
