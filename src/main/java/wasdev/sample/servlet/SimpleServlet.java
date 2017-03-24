package wasdev.sample.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().print("Systemdex First Bluemix App!")
       <html>
	<title>
		TEST
	</title>
<body>
 <a href="https://www.softlayer.com/IBMGEP-application/?cm_mmc=EcoDWW-_-GEPCloud-_-apply-_-hometopbutton&cm_mc_uid=04459892205714733199851&cm_mc_sid_50200000=1475224344">Dash</a>

</body>



</html>    
    }

}
