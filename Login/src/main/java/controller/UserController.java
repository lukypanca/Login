package controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import response.UserResponse;
import service.UserService;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/users")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
//	private UserDao userDao;
	
	private UserService userService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        this.userService = new UserService();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getServletPath();
		switch (action) {
			case "/getId":
				showPopUp(request, response);
				break;
			default:
				process(request, response);
				break;
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		request.setAttribute("userId", request.getParameter("userId"));
//		request.getRequestDispatcher("home.jsp").forward(request, response);
//	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
//	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setAttribute("users", this.userService.getUsers());
//		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/home.jsp");
//		dispatcher.forward(request, response);
//	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<UserResponse> listUser = this.userService.getUsers();
		request.setAttribute("users", listUser);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/home.jsp");
		dispatcher.forward(request, response);
	}
	
	private void showPopUp(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String sudentId = userService.getUserName(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/popup.jsp");
		request.setAttribute("user", sudentId);
		dispatcher.forward(request, response);
	}

}
