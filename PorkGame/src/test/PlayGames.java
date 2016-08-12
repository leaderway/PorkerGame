package test;

import domain.Card;
import domain.Player;
import domain.Porker;

/**
 * 测试方法
 * 
 * @author leaderway
 *
 */
public class PlayGames {
	
	public static void main(String[] args) {
		Porker porker = new Porker();
		porker.shuffle();//洗牌
		
		//实例化四位玩家
		Player playerA = new Player("玩家A");
		Player playerB = new Player("玩家B");
		Player playerC = new Player("玩家C");
		Player playerD = new Player("玩家D");
		
		//实例化四份牌
		Card[] cardsA = new Card[13];
		Card[] cardsB = new Card[13];
		Card[] cardsC = new Card[13];
		Card[] cardsD = new Card[13];
		
		//开始循环发牌
		for(int i = 0; i< 13; i++){
			cardsA[i] = porker.deal(i*4);
			cardsB[i] = porker.deal(i*4+1);
			cardsC[i] = porker.deal(i*4+2);
			cardsD[i] = porker.deal(i*4+3);
		}
		
		//将发好的牌赋值给玩家
		playerA.setCards(cardsA);
		playerB.setCards(cardsB);
		playerC.setCards(cardsC);
		playerD.setCards(cardsD);
		
		//打印四位玩家手上的牌
		playerA.printCards();
		playerB.printCards();
		playerC.printCards();
		playerD.printCards();
	}
}
