package com.javaGG.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContext
 */
@WebServlet("/ServletContext")
public class ServletContext extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContext() {
        super();
        // TODO Auto-generated constructor stub
    }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      //response.getWriter().append("Served at: ").append(request.getContextPath());
      System.out.println("doget");
      
      String id2 = getServletContext().getInitParameter("id2");
      String pw2 = getServletContext().getInitParameter("pw2");
      String path = getServletContext().getInitParameter("path");
      
      response.setContentType("text/html; charset=EUC-KR");
      
      PrintWriter writer = response.getWriter();
      
      writer.println("<html><head></head><body>");
      writer.println("아이디:" + id2 + "</br>");
      writer.println("비밀번호:" + pw2 + "</br>");
      writer.println("path : " + path + "</br>");
      writer.println("</body></html>");
      
      writer.close();
      
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      doGet(request, response);
   }

}