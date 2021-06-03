/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet(urlPatterns = {"/fibbonici"})
public class fibbonici extends HttpServlet {
 
    /**
     *
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    @Override
public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException{
PrintWriter out = response.getWriter();
try{
int num = Integer.parseInt(request.getParameter("txtnum"));
int fibo=0,x=0,y=1;
for(int i=0;i<=num;i++)
{
   x=y;
   y=fibo; 
   fibo=x+y;
   out.print(fibo);
   response.sendRedirect("fibbonici.jsp?q="+fibo);
}
}
catch(NumberFormatException | IOException e){
   out.print(e.getMessage());
}
}
}