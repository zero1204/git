import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RgisterFormServlet
 */
@WebServlet("/RegisterFormServlet")
public class RegisterFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");  //setup response character encoding type
		  
		  response.setContentType("text/html ; UTF-8");   //setup response content type
		  PrintWriter out = response.getWriter();
		  String title = "作業一";
		  
//		  String param1 = request.getParameter("param1");
//		  String param2 = request.getParameter("param2");
//		  String param3 = request.getParameter("param3");
		  String name = request.getParameter("name");
		  String school = request.getParameter("school");
		  String department = request.getParameter("department");
		  String gender = request.getParameter("gender");
		  String[] transport =  request.getParameterValues( "transport");
		  out.println(			  
				  "<!DOCTYPE HTML > " +
					        
		               "<HTML lang=\"zh-Hant-TW\">\n" +
		               "<meta charset=\"UTF-8\">" +
		               "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
			           "<H1 ALIGN=CENTER>" + title + "</H1>\n" +
			           "<BODY><div>" +
			           " <p> 姓名:<br> "
			           + name + "</p>" +
			           " <p> 畢業學校:<br> "
			           + school + "</p>" +
			           " <p> 畢業科系:<br> "
			           + department + "</p>" +
			           " <p> 性別:<br> "
			           + gender + "</p>" +
			           "<p> 交通工具:<br>") ;
		  for(int i=0; i<transport.length;i++) {
			           out.println(transport[i]+"<br>");
			           }
		  
		  out.println(  "</p></div></BODY></HTML>");	
		}
}