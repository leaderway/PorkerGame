package domain;

/**
 * 单张扑克牌
 * 
 * @author leaderway
 *
 */
public class Card {
	
	private String color;//花色
	private String number;  //牌面
	
	public Card() {
	}
	
	public Card(String color, String number) {
		this.color = color;
		this.number = number;
	}


	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	/**覆写toString方法*/
	@Override
	public String toString() {
		return "【" + this.color + this.number + "】" ;
	}
	
}
