package domain;

import java.util.Random;

/**
 * 一副扑克牌
 * 
 * @author leaderway
 *
 */
public class Porker {
	
	private static String[] colors = {"黑桃", "红桃", "梅花", "方块"};//单张扑克牌的4种花色
	private static String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};//11种牌面
	
	private Card[] cards;//所有的扑克牌
	
	/**实例化一副新的扑克牌*/
	public Porker() {
		this.cards = new Card[52];
		//构造含有52张扑克牌的扑克牌数组
		for(int i = 0; i < this.colors.length; i++ ){
			for(int j = 0; j < this.numbers.length; j++){
				int index = i * 13 + j;//本张扑克牌的索引
				cards[index] = new Card(colors[i], numbers[j]);
			}
		}
	}
	
	/**洗牌*/
	public void shuffle(){
		Random random = new Random();//实例化Random对象
		int len = this.cards.length;
		for(int i = 0; i < len; i++){
			int index = random.nextInt(len);//产生一个0~len之间的随机数
			//将扑克牌顺序打乱
			Card cardTemp = this.cards[index];
			this.cards[index] = this.cards[i];
			this.cards[i] = cardTemp;
		}
	}
	
	/**
	 * 发牌
	 * 
	 * @param index 扑克牌的索引
	 * @return 位于当前索引的扑克牌
	 */
	public Card deal(int index){
		return this.cards[index];
	}
	
	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	
}
