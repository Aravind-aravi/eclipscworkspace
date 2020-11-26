

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import connection.EstablishingConnection;

/**
 * Servlet implementation class 
 */
@WebServlet("/FilterRestaurentDataServlet ")
public class FilterRestaurentDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FilterRestaurentDataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		
		try {
			 Connection con = EstablishingConnection.getCon();
			System.out.println("Connected!");
			String loc =request.getParameter("location");
			System.out.println(loc);
			ArrayList a1=null;
			ArrayList location_list=new ArrayList();
			String query = "select * from details where location ='" + loc +"'" ;
		System.out.println("query"+ query);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			a1=new ArrayList();

			a1.add(rs.getString(1));
			a1.add(rs.getString(2));
			a1.add(rs.getString(3));
			a1.add(rs.getString(4));
			a1.add(rs.getString(5));
			a1.add(rs.getString(6));
			a1.add(rs.getString(7));
			a1.add(rs.getString(8));
			a1.add(rs.getString(9));
			a1.add(rs.getString(10));
	
			System.out.println("a1 :: " +a1);
			location_list.add(a1);
			
		}
		request.setAttribute("ll", location_list);
		RequestDispatcher view= request.getRequestDispatcher("/Filter.jsp");
		view.forward(request, response);
		con.close();
		System.out.println("disconnected!");
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
public String getServletInfo()
{
	return "short description";
	}
	

		
		
		
	}


