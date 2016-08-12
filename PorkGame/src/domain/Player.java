package domain;

/**
 * 玩家
 * 
 * @author leaderway
 *
 */
public class Player {
	
	private String name;//玩家名字
	private Card[] cards;//玩家所拥有的扑克牌
	
	public Player() {
	}
	
	public Player(String name) {
		this.name = name;
	}
	
	/**打印玩家手中的牌*/
	public void printCards(){
		System.out.println("=========" + this.name + "手上的牌是：" + "==========");
		for(Card card : this.cards){
			System.out.print(card.toString()+"、");;
		}
		System.out.println("\n=====================================");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	
	
	
}
