import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Register extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
{
		  response.setContentType("text/html;charset=UTF-8"); 	
      HttpSession session = request.getSession(true);
    
      session.setAttribute("name",request.getParameter("name") );
      session.setAttribute("pass",request.getParameter("pwd") );
      session.setAttribute("email",request.getParameter("email") );
      session.setAttribute("phoneNumber",request.getParameter("phonenumber") );
      response.sendRedirect("Welcome.jsp");
 
      
		
		
}
	
}
