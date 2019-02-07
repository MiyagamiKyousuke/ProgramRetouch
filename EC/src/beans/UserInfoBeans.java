package beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserInfoBeans {
	private int delivertMethodId;
	private int totalPrice;
	private String delivertMethodName;
	private int id;
	private Date createDate;
	/**
	 * @return delivertMethodId
	 */
	public int getDelivertMethodId() {
		return delivertMethodId;
	}
	/**
	 * @param delivertMethodId セットする delivertMethodId
	 */
	public void setDelivertMethodId(int delivertMethodId) {
		this.delivertMethodId = delivertMethodId;
	}
	/**
	 * @return totalPrice
	 */
	public int getTotalPrice() {
		return totalPrice;
	}
	/**
	 * @param totalPrice セットする totalPrice
	 */
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	/**
	 * @return delivertMethodName
	 */
	public String getDelivertMethodName() {
		return delivertMethodName;
	}
	/**
	 * @param delivertMethodName セットする delivertMethodName
	 */
	public void setDelivertMethodName(String delivertMethodName) {
		this.delivertMethodName = delivertMethodName;
	}
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate セットする createDate
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getFormatDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH時mm分");
		return sdf.format(createDate);
	}
}
