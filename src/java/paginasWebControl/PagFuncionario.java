/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paginasWebControl;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Manel
 */
public class PagFuncionario extends HttpServlet {
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           
            out.println("<!DOCTYPE HTML>\n" +
"\n" +
"<html>\n" +
"	<head>\n" +
"		<title>Flanelinha Express - Funcionário</title>\n" +
"		<meta charset=\"utf-8\" />\n" +
"\n" +
"		<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\n" +
"		<link rel=\"stylesheet\" href='" + request.getContextPath() +  "/pagPosLogin/assets/css/main.css' />\n" +
"	</head>\n" +
"\n" +
"		<!-- Wrapper -->\n" +
"			<div id=\"wrapper\">\n" +
"\n" +
"				<!-- Main -->\n" +
"					<div id=\"main\">\n" +
"						<div class=\"inner\">\n" +
"\n" +
"							<!-- Header -->\n" +
"								<header id=\"header\">\n" +

"									<ul class=\"icons\">\n" +
"										<li><a href=\"#\" class=\"icon fa-twitter\"><span class=\"label\">Twitter</span></a></li>\n" +
"										<li><a href=\"#\" class=\"icon fa-facebook\"><span class=\"label\">Facebook</span></a></li>\n" +
"										<li><a href=\"#\" class=\"icon fa-snapchat-ghost\"><span class=\"label\">Snapchat</span></a></li>\n" +
"										<li><a href=\"#\" class=\"icon fa-instagram\"><span class=\"label\">Instagram</span></a></li>\n" +
"										\n" +
"									</ul>\n" +
"								</header>\n" +
"									<br>\n" +
"									<h2>Estacionamento</h2>\n" +
"									\n" +
"									<div class=\"col-12\">\n" +
"										<select name=\"demo-category\" id=\"demo-category\">\n" +
"												<option value=\"\"> Todos </option>\n" +
"												<option value=\"1\">Estacionamento Norte</option>\n" +
"												<option value=\"1\">Estacionamente Sul</option>\n" +
"												<option value=\"1\">Estacionamente Leste</option>\n" +
"												<option value=\"1\">Estacionamente Oeste</option>\n" +
"										</select>\n" +
"									</div>									\n" +
"									<br>\n" +
"									<h2>Funcionários</h2>\n" +
"									\n" +
"										<dl>\n" +
"\n" +
"											<dt>Bonaro Talkey</dt>\n" +
"												<dd>\n" +
"\n" +
"														<p>Matricula: 54877\n" +
"														<br>Telefone: (27) 99996-4881\n" +
"														<br>Email: bonarotalkey17peipei@hotmail.com\n" +
"														<br>Situacao: Ativo\n" +
"														<br>Cargo: Guardinha\n" +
"													</p>\n" +
"													<ul class=\"actions\">\n" +
"														<li><a href=\"#\" class=\"button primary\">Ver</a></li>\n" +
"														<li><a href=\"#\" class=\"button\">Editar</a></li>\n" +
"													</ul>\n" +
"												</dd>\n" +
"\n" +
"											<dt>Danilo Daniel Orivaldo</dt>\n" +
"												<dd>\n" +
"\n" +
"													<p>Matricula: 50047\n" +
"													<br>Telefone: (27) 95596-0055\n" +
"													<br>Email: daniel@hotmail.com\n" +
"													<br>Situacao: Ativo\n" +
"													<br>Cargo: Administrador\n" +
"													</p>\n" +
"													<ul class=\"actions\">\n" +
"														<li><a href=\"#\" class=\"button primary\">Ver</a></li>\n" +
"														<li><a href=\"#\" class=\"button\">Editar</a></li>\n" +
"													</ul>\n" +
"												</dd>\n" +
"											<dt>Carol Carolina Caracas</dt>\n" +
"												<dd>\n" +
"\n" +
"													<p>Matricula: 60002\n" +
"													<br>Telefone: (27) 98806-1777\n" +
"													<br>Email: caracas@hotmail.com\n" +
"													<br>Situacao: Ativo\n" +
"													<br>Cargo: Guardinha\n" +
"													</p>\n" +
"													<ul class=\"actions\">\n" +
"														<li><a href=\"#\" class=\"button primary\">Ver</a></li>\n" +
"														<li><a href=\"#\" class=\"button\">Editar</a></li>\n" +
"													</ul>\n" +
"												</dd>\n" +
"											<dt>Lucas Almeida</dt>\n" +
"												<dd>\n" +
"\n" +
"													<p>Matricula: 98001\n" +
"													<br>Telefone: (27) 98096-0003\n" +
"													<br>Email: lucasalmeida@hotmail.com\n" +
"													<br>Situacao: Ativo\n" +
"													<br>Cargo: Guardinha\n" +
"													</p>\n" +
"													<ul class=\"actions\">\n" +
"														<li><a href=\"#\" class=\"button primary\">Ver</a></li>\n" +
"														<li><a href=\"#\" class=\"button\">Editar</a></li>\n" +
"													</ul>\n" +
"												</dd>\n" +
"									</dl>									\n" +
"									<br>\n" +
"\n" +
"									<ul class=\"pagination\" align=\"center\">\n" +
"										<li><span class=\"button disabled\">Prev</span></li>\n" +
"										<li><a href=\"#\" class=\"page active\">1</a></li>\n" +
"										<li><a href=\"#\" class=\"page\">2</a></li>\n" +
"										<li><a href=\"#\" class=\"page\">3</a></li>\n" +
"										<li><span>&hellip;</span></li>\n" +
"										<li><a href=\"#\" class=\"page\">8</a></li>\n" +
"										<li><a href=\"#\" class=\"page\">9</a></li>\n" +
"										<li><a href=\"#\" class=\"page\">10</a></li>\n" +
"										<li><a href=\"#\" class=\"button\">Next</a></li>\n" +
"									</ul>\n" +
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
"										\n" +
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
