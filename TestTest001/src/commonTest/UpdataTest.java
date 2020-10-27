package commonTest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdataTest
 */
@WebServlet("/UpdataTest")
public class UpdataTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdataTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String day="2020/01/01";
		String route_no="1";
		String transit_no="2";
		String from_st="御茶ノ水";
		String to_st="東京";
		String price="170";
		int user_id=1;
		int id=1;

		//CommonUpdDataクラスの呼び出し
		CommonUpdData data = new CommonUpdData(id,day, route_no, transit_no, from_st, to_st, price, user_id);

		request.setAttribute("data", data);
		getServletContext().getRequestDispatcher("/UpdataTest.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
