package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import base.DBManager;
import beans.UserInfoBeans;

public class BuyHistoryDAO {
	public static ArrayList<UserInfoBeans> buyHistory(int id) throws SQLException {
		Connection con = null;
		PreparedStatement st = null;
		try {
			con = DBManager.getConnection();

			st = con.prepareStatement("SELECT t_buy.id,t_buy.user_id,t_buy.total_price,t_buy.delivery_method_id,t_buy.create_date,m_delivery_method.name FROM t_buy INNER JOIN m_delivery_method ON t_buy.delivery_method_id = m_delivery_method.id WHERE t_buy.user_id = ? ORDER BY t_buy.create_date DESC");
			st.setInt(1,id);
			ResultSet rs = st.executeQuery();
			ArrayList<UserInfoBeans> userInfoList = new ArrayList<UserInfoBeans>();

			while(rs.next()) {
				UserInfoBeans uif = new UserInfoBeans();
				uif.setId(rs.getInt("id"));
				uif.setTotalPrice(rs.getInt("total_price"));
				uif.setDelivertMethodName(rs.getString("name"));
				uif.setDelivertMethodId(rs.getInt("delivery_method_id"));
				uif.setCreateDate(rs.getTimestamp("create_date"));
				userInfoList.add(uif);
			}
			System.out.println("get Items by itemName has been completed");
			return userInfoList;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new SQLException(e);
		} finally {
			if (con != null) {
				con.close();
			}
		}

	}
}
