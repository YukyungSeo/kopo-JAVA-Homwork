package kr.ac.kopo.date0321.icecream;

import java.util.ArrayList;

public class IcecreamMarket {

	private ArrayList<Icecream[]> purchaseList;
	// private int totalCountIce;
	// private int totalPriceIce;

	public IcecreamMarket() {
		this.purchaseList = new ArrayList<Icecream[]>();
	}

	public void open() {

		IcecreamIO.printOpenMarket();
		
		char ans = 'y';
		while (ans == 'y' || ans == 'Y') {
			int purchasNum = buy();
			rec(purchasNum);
			ans = IcecreamIO.getAnAnswerToContinue();
		}

	}

	private int buy() {
		int cnt = IcecreamIO.getIcecreamCount();

		Icecream[] icecreams = new Icecream[cnt];
		for (int i = 0; i < cnt; i++) {
			IcecreamIO.headlineGetIcecreamInfo(i + 1);
			icecreams[i] = new Icecream();
			icecreams[i].setName(IcecreamIO.getIcecreamName());
			icecreams[i].setPrice(IcecreamIO.getIcecreamPrice());
		}
		this.purchaseList.add(icecreams);

		// return 구매넘버
		return purchaseList.size()-1;
	}

	private void rec(int parchaseNum) {
		Icecream[] iceList = this.purchaseList.get(parchaseNum);
		
		IcecreamIO.headlinePrintIcecreamInfo(iceList.length);
		
		int num = 1;
		for (Icecream icecream : iceList) {
			IcecreamIO.printIcecreamInfo(num++, icecream.getName(), icecream.getPrice());
		}
	}
	
	public void close() {
		IcecreamIO.printCloseMarket();
		purchaseHistory();
	}
	
	private void purchaseHistory() {
		int sum = 0;
		int cnt = 0;
		for (Icecream[] icecreams : purchaseList) {
			
			cnt += icecreams.length;
			
			for (Icecream ice : icecreams) {
				sum += ice.getPrice();
			}
			
		}
		IcecreamIO.printNumberOfIcecream(cnt);
		IcecreamIO.printSumOfIcecreamPrice(sum);

	}

}
