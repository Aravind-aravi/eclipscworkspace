

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class welcome
 */
@WebServlet("/welcome")
public class welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		 String n = request.getParameter("name");
			String p = request.getParameter("password");
			
		if(n.equals("aa") && p.equals("aa")) {
			pw.println("welcome" +n);
			{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3307/login","root","password");
			if(con!=null) {
				PreparedStatement st=con.prepareStatement("select*from db ");
			ResultSet rs=st.executeQuery();
			while (rs.next())
			{
				System.out.println(rs.getInt(0)+rs.getString(1));
			}
			

			
			}else {
				System.out.println("NO CONNECTION MADE");
			}
			} catch (Exception e) {
				e.printStackTrace();
			}

			}
		}else
		{
			pw.println("fuck your self");
		}
		doGet(request, response);
		}

}
