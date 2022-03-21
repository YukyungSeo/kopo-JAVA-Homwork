package kr.ac.kopo.date0321;

import kr.ac.kopo.date0318.Icecream;

public class IcecreamMarket {

	Icecream[][] icecreamArr;
	int iceArrSize;

	public IcecreamMarket() {
		this.icecreamArr = new Icecream[100][];
		iceArrSize = 0;
	}

	void open() {

		char ans = 'y';
		while (ans == 'y' || ans == 'Y') {
			
			buy();
			rec();
			this.iceArrSize++;
			
			ans = IcecreamIO.getAnAnswerToContinue() ;
		}

	}

	private void buy() {
		int cnt = IcecreamIO.getIcecreamCount();

		this.icecreamArr[this.iceArrSize] = new Icecream[cnt];
		for (int i = 0; i < cnt; i++) {
			IcecreamIO.headlineGetIcecreamInfo(i + 1);
			this.icecreamArr[this.iceArrSize][i] = new Icecream();
			this.icecreamArr[this.iceArrSize][i].setName(IcecreamIO.getIcecreamName());
			this.icecreamArr[this.iceArrSize][i].setPrice(IcecreamIO.getIcecreamPrice());
		}
	}

	private void rec() {
		IcecreamIO.headlinePrintIcecreamInfo(this.icecreamArr[this.iceArrSize].length);
//		int sum = 0;
		int num = 1;
		for (Icecream icecream : this.icecreamArr[this.iceArrSize]) {
			IcecreamIO.printIcecreamInfo(num++, icecream.getName(), icecream.getPrice());
//			sum += icecream.getPrice();
		}
//		IcecreamIO.printSumOfIcecreamPrice(sum);
	}
}
