package beans;

import java.io.Serializable;

/**
 * アイテム
 * @author d-yamaguchi
 *
 */
public class ItemDataBeans implements Serializable {
	private int id;
	private String name;
	private String detail;
	private int price;
	private String fileName;
	private int countNum;
	//商品検索数
	private int itemCount;

	public int getId() {
		return id;
	}
	public void setId(int itemId) {
		this.id = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String itemName) {
		this.name = itemName;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int itemPrice) {
		this.price = itemPrice;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String filename) {
		this.fileName = filename;
	}
	public int getCountNum() {
		return countNum;
	}
	public void setCountNum(int countNum) {
		this.countNum = countNum;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}




}
