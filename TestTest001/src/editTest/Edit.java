package editTest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import commonTest.CommonErrMsg;
import commonTest.CommonUpdData;

/**
 * Servlet implementation class Edit
 */
@WebServlet("/Edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Edit() {
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

		//入力値にエラーが含まれていないかを調べる
				String errmsg = CommonErrMsg.getErrMsg(data);

		/**
		 * エラーがない
		* 		→編集確認画面へ遷移
		* 		  その時にアップデートデータクラスも持っていく
		* エラーがある
		* 		→編集画面へ遷移
		* 		  その時にエラーメッセージも持っていく
		**/
				if (errmsg.equals("")) {
					request.setAttribute("data", data);
					getServletContext().getRequestDispatcher("/testEditCheck.jsp").forward(request, response);
				} else {
					request.setAttribute("errmsg", errmsg);
					getServletContext().getRequestDispatcher("/testEdit.jsp").forward(request, response);
				}


/**
		//入力値の取得
				int id = Integer.parseInt((String) request.getParameter("id"));
				String day = (String) request.getParameter("day");
				String route_no = (String) request.getParameter("route_no");
				String transit_no = (String) request.getParameter("transit_no");
				String from_st = (String) request.getParameter("from_st");
				String to_st = (String) request.getParameter("to_st");
				String price = (String) request.getParameter("price");

				//1-1-1 値の取得
				System.out.println("id="+id);
				System.out.println("day="+day);
				System.out.println("route_no="+route_no);
				System.out.println("transit_no"+transit_no);
				System.out.println("from_st="+from_st);
				System.out.println("to_st"+to_st);
				System.out.println("price="+price);
**/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
