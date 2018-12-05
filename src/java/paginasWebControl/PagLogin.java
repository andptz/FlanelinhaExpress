package paginasWebControl;

//import padroes.criacao.builder.DiretorEstacionamento;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.componentes.Estacionamento;
import modelo.locais.Bairro;
import modelo.locais.Cidade;
import modelo.locais.Endereco;
import modelo.locais.Estado;
import modelo.operadores.Pessoa;
import padroes.criacao.fabrica.FabricaPessoa;

import persistencia.operadores.PersistenciaPessoaJuridica;



public class PagLogin extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
             
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            
            Pessoa pessoa = FabricaPessoa.criaPessoa("juridica");
            
            //Banco
            PersistenciaPessoaJuridica p_adm = new PersistenciaPessoaJuridica();
            //pessoa = p_adm.loginPessoaJuridica(email,password);
            
            //Pra teste sem Banco:
            pessoa.setId(0);
            
            if(pessoa.getId()!=1){
            
             /*
               int cont = 0;
               ArrayList<Estacionamento> lstEst = new ArrayList<>();
               
               
               //PRA TESTE
               while(cont < 4){
                   
                   Estacionamento est = new Estacionamento();
                   Endereco end = new Endereco();
                   
                   Bairro bairro = new Bairro();
                   bairro.setNome("Serra Dourada" + cont);
                   
                   Estado estado = new Estado();
                   estado.setNome("ES");
                   
                   Cidade cid = new Cidade();
                   cid.setNome("Serra" + cont);
                   
                   end.setCidade(cid);
                   end.setBairro(bairro);
                   end.setEstado(estado);
                   end.setCep("21992-"+cont);
                   
                   est.setEndereco(end);
                   lstEst.add(est);
               }
               
               
              
               
               //DiretorEstacionamento dirEst = new DiretorEstacionamento();
                
            */   
                
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            
            out.println("<head>");
            out.println("<title>Flanelinha Express</title>");
            out.println("<link rel='stylesheet' type='text/css' href='" + request.getContextPath() +  "/pagPosLogin/assets/css/main.css' />");
            out.println("</head>");
            out.println("<div id=\"wrapper\">\n" +
"\n" +
"				<!-- Main -->\n" +
"					<div id=\"main\">\n" +
"						<div class=\"inner\">\n" +
"\n" +
"							<!-- Header -->\n" +
"								<header id=\"header\">\n" +
"									<h2>Home</h2>\n" +
"									<ul class=\"icons\">\n" +
"										<li><a href=\"#\" class=\"icon fa-twitter\"><span class=\"label\">Twitter</span></a></li>\n" +
"										<li><a href=\"#\" class=\"icon fa-facebook\"><span class=\"label\">Facebook</span></a></li>\n" +
"										<li><a href=\"#\" class=\"icon fa-snapchat-ghost\"><span class=\"label\">Snapchat</span></a></li>\n" +
"										<li><a href=\"#\" class=\"icon fa-instagram\"><span class=\"label\">Instagram</span></a></li>\n" +
"										\n" +
"									</ul>\n" +
"								</header>\n" +
"									<br>\n" +
"\n" +
"									<span class=\"image fit\"><img src=\""+ request.getContextPath() +"/pagPosLogin/images/large.png\" alt=\"\" /></span>\n" +
"									\n" +
"									\n" +
"									<br>\n" +
"									<h4>Estacionamentos</h4>\n" +
"									\n" +
"										<dl>\n" +
"\n" +
"											<dt>Estacionamento Norte</dt>\n" +
"												<dd>\n" +
"\n" +
"													<p>     Rua: \n" +
"														<br>Bairro: \n" +
"														<br>Municipio: \n" +
"														<br>Estado: \n" +
"														<br>CEP:\n" +
"													</p>\n" +
"													<ul class=\"actions\">\n" +
"														<li><a href=\"#\" class=\"button primary\">Ver</a></li>\n" +
"														<li><a href=\"#\" class=\"button\">Editar</a></li>\n" +
"													</ul>\n" +
"												</dd>\n" +
"\n" +
"											<dt>Estacionamento Sul</dt>\n" +
"												<dd>\n" +
"\n" +
"													<p>     Rua: \n" +
"														<br>Bairro: \n" +
"														<br>Municipio: \n" +
"														<br>Estado: \n" +
"														<br>CEP:\n" +
"													</p>\n" +
"													<ul class=\"actions\">\n" +
"														<li><a href=\"#\" class=\"button primary\">Ver</a></li>\n" +
"														<li><a href=\"#\" class=\"button\">Editar</a></li>\n" +
"													</ul>\n" +
"												</dd>\n" +
"											<dt>Estacionamento Leste</dt>\n" +
"												<dd>\n" +
"\n" +
"													<p>     Rua: \n" +
"														<br>Bairro: \n" +
"														<br>Municipio: \n" +
"														<br>Estado: \n" +
"														<br>CEP:\n" +
"													</p>\n" +
"													<ul class=\"actions\">\n" +
"														<li><a href=\"#\" class=\"button primary\">Ver</a></li>\n" +
"														<li><a href=\"#\" class=\"button\">Editar</a></li>\n" +
"													</ul>\n" +
"												</dd>\n" +
"											<dt>Estacionamento Oeste</dt>\n" +
"												<dd>\n" +
"\n" +
"													<p>     Rua: \n" +
"														<br>Bairro: \n" +
"														<br>Municipio: \n" +
"														<br>Estado: \n" +
"														<br>CEP:\n" +
"													</p>\n" +
"													<ul class=\"actions\">\n" +
"														<li><a href=\"#\" class=\"button primary\">Ver</a></li>\n" +
"														<li><a href=\"#\" class=\"button\">Editar</a></li>\n" +
"													</ul>\n" +
"												</dd>\n" +
"									</dl>									\n" +
"									\n" +
"\n" +
"									\n" +
"						</div>\n" +
"					</div>\n" +
"\n" +
"				<!-- Sidebar -->\n" +
"					<div id=\"sidebar\">\n" +
"						<div class=\"inner\">\n" +
"\n" +
"							<!-- Search -->\n" +
"								<section id=\"search\" class=\"alt\">\n" +
"									<form method=\"post\" action=\"#\">\n" +
"										<input type=\"text\" name=\"query\" id=\"query\" placeholder=\"Procurar\" />\n" +
"									</form>\n" +
"								</section>\n" +
"\n" +
"							<!-- Menu -->\n" +
"								<nav id=\"menu\">\n" +
"									<header class=\"major\">\n" +
"										<h2>_________________</h2>\n" +
"									</header>\n" +
"									<ul>\n" +
"										<li><a href=\"pagLogin\">Home</a></li>\n" +
"										<li><a href=\"pagMapa\">Mapa</a></li>\n" +
"										<li><a href=\"pagEstacionamento\">Estacionamento</a></li>\n" +
"										<li><a href=\"pagFuncionario\">Funcionário</a></li>\n" +
"										<li><a href=\"pagInicio\">Sair</a></li>\n" +
"									</ul>\n" +
"										\n" +
"								</nav>\n" +
"\n" +
"\n" +
"							<!-- Section -->\n" +
"								<section>\n" +
"									<header class=\"major\">\n" +
"										<h2>_________________________</h2>\n" +
"									</header>\n" +
"									<p>Somos a maior empresa de estacionamento da América Latina, por isso, ... \n" +
"									Conte com a segurança, conforto e proximidade que só a Estapar oferece para \n" +
"									você! ... Inteligente é a solução para você estacionar com comodidade e \n" +
"									segurança.</p>\n" +
"\n" +
"									<ul class=\"contact\">\n" +
"										<li class=\"fa-envelope-o\"><a href=\"#\">estacionamentoExemplo@gmail.com</a></li>\n" +
"										<li class=\"fa-phone\">(000) 000-0000</li>\n" +
"										\n" +
"									</ul>\n" +
"								</section>\n" +
"\n" +
"							\n" +
"						</div>\n" +
"					</div>\n" +
"\n" +
"			</div>\n" +
"\n" +
"		<!-- Scripts -->\n" +
"			<script src=\"assets/js/jquery.min.js\"></script>\n" +
"			<script src=\"assets/js/browser.min.js\"></script>\n" +
"			<script src=\"assets/js/breakpoints.min.js\"></script>\n" +
"			<script src=\"assets/js/util.js\"></script>\n" +
"			<script src=\"assets/js/main.js\"></script>\n" +
"\n" +
"	</body>\n" +
"</html>");
        }
        
        
        } finally {
            out.close();
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(PagLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PagLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(PagLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PagLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 
    @Override
    public String getServletInfo() {
        return "Servlet Recebe Dados";
    }// </editor-fold>

}
