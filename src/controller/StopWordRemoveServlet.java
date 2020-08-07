package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DFSAccess;
import stopwords.StopWordDriver;

@WebServlet("/StopWordRemoveServlet")
public class StopWordRemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StopWordRemoveServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		StopWordDriver stop = new StopWordDriver();
		try {
			HttpSession hs = request.getSession();
			StopWordDriver.main(null);
			ArrayList<String> al = DFSAccess.afterStopword();
			hs.setAttribute("good", StopWordDriver.good);
			hs.setAttribute("stop", StopWordDriver.stop);
			request.setAttribute("stop", al);
			RequestDispatcher rd = request.getRequestDispatcher("view_stop.jsp");
			rd.forward(request, response);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
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
