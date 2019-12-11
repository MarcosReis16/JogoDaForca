/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;

import Models.Carros;
import Models.Filme;
import Models.Novela;
import Models.BaseJogo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;

/**
 *
 * @author marco
 */
@WebServlet(name = "JogoForca", urlPatterns = {"/JogoForca"})

public class JogoForca extends HttpServlet
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            
            BaseJogo jogo;
            
            
            
            Random rd = new Random();
            int numero = rd.nextInt(4);
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControleIMC</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>" + usuario.getIMCTradicional() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
