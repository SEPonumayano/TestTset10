package editTest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import commonTest.CommonUpdData;

/**
 * Servlet implementation class TestEdit
 */
@WebServlet("/TestEdit")
public class TestEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestEdit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//ユーザーidの取得

				HttpSession session = request.getSession();
				session.setAttribute("User_id", 1);

				int user_id=(int)session.getAttribute("User_id");
				//System.out.println("user_id="+user_id);

				int id = 1;
				String day ="2020/01/01";
				String route_no = "1";
				String transit_no ="2";
				String from_st ="ああああああああああ";
				String to_st ="ああああああああああ";
				String price ="1000";


				//アップデートデータクラスの作成
					CommonUpdData data = new CommonUpdData(id, day, route_no, transit_no, from_st, to_st, price, user_id);


				request.setAttribute("data", data);
				getServletContext().getRequestDispatcher("/editCheck.jsp").forward(request, response);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
