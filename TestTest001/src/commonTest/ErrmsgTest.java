package commonTest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ErrmsgTest
 */
@WebServlet("/ErrmsgTest")
public class ErrmsgTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ErrmsgTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String day="2020/01/01";
		String from_st="ああああああああああ";
		String to_st="ああああああああああ";
		String price="1000";

		String route_no="1";
		String transit_no="1";
		int user_id=1;

		CommonAddData data = new CommonAddData(day, route_no, transit_no, from_st, to_st, price, user_id);

		//1-1-2 getErrMsg
		String getErrMsg=CommonErrMsg.getErrMsg(data);

		request.setAttribute("getErrMsg", getErrMsg);
		getServletContext().getRequestDispatcher("/ErrmsgTest.jsp").forward(request, response);




		/** 1-1-1 getLoginErr
		 *
		 *
		String address ="harashinya1192";//ログイン画面で入力したアドレス
		String password ="hara1192"; //PassWord
		String salt = null; //ソルト
		int role_id = 0;
		String user_name = "";

		//1-1-1-1～1-1-1-3 getLoginErr
		String getLoginErr = CommonErrMsg.getLoginErr(address, password);
		if (!getLoginErr.equals("")) {
			request.setAttribute("getLoginErr", getLoginErr);
			getServletContext().getRequestDispatcher("/ErrmsgTest.jsp").forward(request, response);
		}

		//DBからアドレスをもとにソルトを取得
		ResultSet rs = CommonDB.getUser(address);
		try {
			rs.next();
			salt = rs.getString("salt");
			role_id = rs.getInt("role_id");
			user_name = rs.getString("user_name");

		} catch (SQLException e1) {
		}

		//ハッシュ化
		String loginKey = null;//ハッシュ化されたパスワードが入ります
		String saltpass = null;//ソルトと入力されたパスワードを結合したものが入ります

		saltpass = salt + password;
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] result = md.digest(saltpass.getBytes());
			loginKey = String.format("%040x", new BigInteger(1, result));
		} catch (Exception e) {
			e.printStackTrace();
		}

		//1-1-1-4 getLoginErr
		getLoginErr = CommonErrMsg.getLoginErr(loginKey);
		if (!getLoginErr.equals("")) {
			request.setAttribute("getLoginErr", getLoginErr);
			getServletContext().getRequestDispatcher("/ErrmsgTest.jsp").forward(request, response);
		}

		request.setAttribute("getLoginErr", getLoginErr);
		getServletContext().getRequestDispatcher("/ErrmsgTest.jsp").forward(request, response);
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
