package ec;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.BuyDataBeans;
import beans.ItemDataBeans;
import dao.BuyDAO;
import dao.BuyDetailDAO;

/**
 * 購入履歴画面
 * @author d-yamaguchi
 *
 */
@WebServlet("/UserBuyHistoryDetail")
public class UserBuyHistoryDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String id = request.getParameter("buy_id");
		int intChangeId = Integer.parseInt(id);

		try {

			//
			BuyDataBeans resultBDB = BuyDAO.getBuyDataBeansByBuyId(intChangeId);
			request.setAttribute("resultBDB", resultBDB);

			// 購入アイテム情報
			ArrayList<ItemDataBeans> buyIDBList = BuyDetailDAO.getItemDataBeansListByBuyId(intChangeId);
			request.setAttribute("buyIDBList", buyIDBList);


			request.getRequestDispatcher(EcHelper.USER_BUY_HISTORY_DETAIL_PAGE).forward(request, response);

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			session.setAttribute("errorMessage", e.toString());
			response.sendRedirect("Error");
		}





	}
}
