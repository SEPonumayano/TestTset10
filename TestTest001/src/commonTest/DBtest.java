package commonTest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBtest
 */
@WebServlet("/DBtest")
public class DBtest extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBtest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int id=1;



		//1-1-1-24 deleteDB
		CommonDB.deleteDB(id);

		System.out.print("削除");




		/**
		String transit_no="";
		String from_st="";
		String to_st="";
		String price="";
		int user_id=1;
		int limitSta=0;
		String address="";
		String password="";
		String loginKey="";
		String day="";
		String route_no="";
		int id=1;

		CommonAddData data = new CommonAddData(day, route_no, transit_no, from_st, to_st, price, user_id);
		CommonUpdData data2 =new CommonUpdData(id, day, route_no,transit_no,from_st, to_st, price,user_id);

		//1-1-1-5 checkTransitData
		boolean checkTransitData=CommonDB.checkTransitData(transit_no,from_st,to_st,price,user_id);

		//1-1-1-6 addTransitData
		CommonDB.addTransitData(transit_no,from_st,to_st,price,user_id);

		//1-1-1-7～1-1-1-10 getTransitDataAll
		ResultSet getTransitDataAll7=CommonDB.getTransitDataAll(transit_no,from_st, to_st,user_id,limitSta);
		ResultSet getTransitDataAll8=CommonDB.getTransitDataAll(transit_no,from_st, to_st,user_id,limitSta);
		ResultSet getTransitDataAll9=CommonDB.getTransitDataAll(transit_no,from_st, to_st,user_id,limitSta);
		ResultSet getTransitDataAll10=CommonDB.getTransitDataAll(transit_no,from_st, to_st,user_id,limitSta);

		//1-1-1-11～1-1-1-14 getTransitDataCnt
		int getTransitDataCnt11=CommonDB.getTransitDataCnt(transit_no, from_st, to_st, user_id);
		int getTransitDataCnt12=CommonDB.getTransitDataCnt(transit_no, from_st, to_st, user_id);
		int getTransitDataCnt13=CommonDB.getTransitDataCnt(transit_no, from_st, to_st, user_id);
		int getTransitDataCnt14=CommonDB.getTransitDataCnt(transit_no, from_st, to_st, user_id);

		//1-1-1-15 getTransitListAll
		ResultSet getTransitListAll=CommonDB.getTransitListAll(limitSta, user_id);

		//1-1-1-16 getTransitListCnt
		int getTransitListCnt=CommonDB.getTransitListCnt(user_id);

		//1-1-1-17 getUser
		ResultSet getUser17=CommonDB.getUser(address);

		//1-1-1-18 getUser
		ResultSet getUser18=CommonDB.getUser(password, address);

		//1-1-1-19 isUser
		boolean isUser=CommonDB.isUser(loginKey);

		//1-1-1-20 getUsercategoryAll
		ResultSet getUsercategoryAll=CommonDB.getUserCategoryAll();

		//1-1-1-21getUserId
		int getUserId =CommonDB.getUserId(address, password);

		//1-1-1-22 addDB
		CommonDB.addDB(data);

		//1-1-1-23 update
		CommonDB.updateDB(data2);

		//1-1-1-24 deleteDB
		CommonDB.deleteDB(id);


		RequestDispatcher rd = request.getRequestDispatcher("/DBtestJSP.jsp");
		rd.forward(request, response);

		//getRouteAll
		ResultSet getRouteAll =CommonDB.getRouteAll();
		System.out.println(getRouteAll);
		request.setAttribute("getRouteAll", getRouteAll);


		//getRouteName
		String route_no="1";
		String getRouteName=CommonDB.getRouteName(route_no);
		System.out.println(getRouteName);
		request.setAttribute("getRouteName", getRouteName);


		//getTransitAll
		ResultSet getTransitAll=CommonDB.getTransitAll();
		System.out.println(getTransitAll);
		request.setAttribute("getTransitAll", getTransitAll);


		//getTransitName
		String transit_no="1";
		String getTransitName=CommonDB.getTransitName(transit_no);
		System.out.println(getTransitName);
		request.setAttribute("getTransitName", getTransitName);

		RequestDispatcher rd = request.getRequestDispatcher("/DBtestJSP.jsp");
		rd.forward(request, response);
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
