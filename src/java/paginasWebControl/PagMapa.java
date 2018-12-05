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
public class PagMapa extends HttpServlet {
    
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           
            out.println("<!DOCTYPE HTML>\n" +
"\n" +
"<html>\n" +
"	<head>\n" +
"		<title>Flanelinha Express - Mapa</title>\n" +
"		<meta charset=\"utf-8\" />\n" +
"\n" +
"		<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\n" +
"		<link rel=\"stylesheet\" href='" + request.getContextPath() +  "/pagPosLogin/assets/css/main.css' />\n" +
"	</head>\n" +
"	<body>\n" +
"		<!-- Wrapper -->\n" +
"			<div id=\"wrapper\">\n" +
"\n" +
"				<!-- Main -->\n" +
"					<div id=\"main\">\n" +
"						<div class=\"inner\">\n" +
"\n" +
"							<!-- Header -->\n" +
"								<header id=\"header\">\n" +
"									<h2>Mapa</h2>\n" +
"									<ul class=\"icons\">\n" +
"										<li><a href=\"#\" class=\"icon fa-twitter\"><span class=\"label\">Twitter</span></a></li>\n" +
"										<li><a href=\"#\" class=\"icon fa-facebook\"><span class=\"label\">Facebook</span></a></li>\n" +
"										<li><a href=\"#\" class=\"icon fa-snapchat-ghost\"><span class=\"label\">Snapchat</span></a></li>\n" +
"										<li><a href=\"#\" class=\"icon fa-instagram\"><span class=\"label\">Instagram</span></a></li>\n" +
"										\n" +
"									</ul>\n" +
"								</header>\n" +
"									<br>\n" +

"						\n" +
"									<div class=\"col-6 col-12-xsmall\">\n" +
"											<input type=\"text\" name=\"demo-name\" id=\"demo-name\" value=\"\" placeholder=\"Procurar\" />\n" +
"									</div>\n" +
"									<br>\n" +
"									<span class=\"image fit\"><img src=\""+ request.getContextPath() +"/pagPosLogin/images/maps1.PNG\" alt=\"\" /></span>\n" +
"									<ul class=\"actions\">\n" +
"										<li><a href=\"#\" class=\"button primary\">Adicionar Estacionamento</a></li>\n" +
"										\n" +
"									</ul>\n" +
"										\n" +
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
