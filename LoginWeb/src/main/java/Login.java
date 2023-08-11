
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/LoginWeb")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Login() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		PrintWriter pWriter = response.getWriter();
//		String s = request.getParameter("t1");
//		pWriter.println("<h1>Hello," + s);
//		pWriter.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// Perform server-side validation and database checks
		// Example: check credentials against a database
		boolean isValid = validateCredentials(username, password); // Implement this method

		if (isValid) {
			// If credentials are valid, create a session and redirect
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			response.sendRedirect("home.jsp"); // Redirect to a welcome page
		} else {
			// Otherwise, show an error message on the login page
			request.setAttribute("errorMessage", "Invalid credentials. Please try again.");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	private boolean validateCredentials(String username, String password) {
		// Perform database or other validation
		// Return true if credentials are valid, false otherwise
		if (username == "java" && password == "jsp") {
			return true; // Change this to your validation logic
		} else {
			return false;
		}

	}

}
