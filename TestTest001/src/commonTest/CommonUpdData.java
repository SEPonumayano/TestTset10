package commonTest;

public class CommonUpdData extends CommonAddData{
	/**
	 *	クラス外から値を参照させないために
	 *	修飾子を全てprivateにする
	 **/
	private final int id;

	/**
	 *	値をセットするのは、
	 *	インスタンスを生成したときのみとする
	 **/
	public CommonUpdData(int id, String day, String route_no, String transit_no,
			String from_st, String to_st, String price, int user_id) {
		/**
		 *	id以外のデータは、スーパークラスを使用してセット
		 **/
		super(day, route_no, transit_no, from_st, to_st, price, user_id);
		this.id = id;

		//CommonUpdDataに入っているかの確認用

				System.out.println("CommonUpdDataに入っているかの確認用");
				System.out.println("CommonUpdDataのidは"+id+"です。");
				System.out.println("CommonUpdDataのdayは"+day+"です。");
				System.out.println("CommonUpdDataのroute_noは"+route_no+"です。");
				System.out.println("CommonUpdDataのtransit_noは"+transit_no+"です。");
				System.out.println("CommonUpdDataのfrom_stは"+from_st+"です。");
				System.out.println("CommonUpdDataのto_stは"+to_st+"です。");
				System.out.println("CommonUpdDataのpriceは"+price+"です。");
				System.out.println("CommonUpdDataのuser_idは"+user_id+"です。");
				

	}

	/**
	 *	フィールドのゲッター
	 *	値を取り出す際に使用
	 **/
	public int getId() {
		return id;
	}

}
