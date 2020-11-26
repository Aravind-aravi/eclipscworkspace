

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import connection.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class showData
 */
@WebServlet("/ShowRestaurentDataServlet")
public class ShowRestaurentDataServlet extends HttpServlet {
	private ServletConfig config;

	// Setting JSP page

	String page = "Show.jsp";

	public void init(ServletConfig config)

			throws ServletException {

		this.config = config;

	}

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowRestaurentDataServlet() {

		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		PrintWriter out = response.getWriter();

	 
	
		ResultSet rs;

		response.setContentType("text/html");

		List dataList = new ArrayList();

		try {
			 Connection con = EstablishingConnection.getCon();
			
			String sql = "select * from details";

			Statement s = con.createStatement();

			s.executeQuery(sql);

			rs = s.getResultSet();

			while (rs.next()) {

				dataList.add(rs.getInt("uniqueid"));
				dataList.add(rs.getString("url"));
				dataList.add(rs.getString("name"));
				dataList.add(rs.getString("address"));
				dataList.add(rs.getString("location"));
				dataList.add(rs.getString("cuisine"));
				dataList.add(rs.getString("dishes"));
				dataList.add(rs.getFloat("price"));
				dataList.add(rs.getFloat("ratings"));
				dataList.add(rs.getInt("votes"));
				
				
				

			}

			rs.close();

			s.close();

		} catch (Exception e) {

			System.out.println("Exception is ;" + e);

		}

		request.setAttribute("data", dataList);

		// Disptching request

		RequestDispatcher dispatcher = request.getRequestDispatcher(page);

		if (dispatcher != null) {

			dispatcher.forward(request, response);

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
