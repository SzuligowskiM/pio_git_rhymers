package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {


	public static final int TOTAL_REJECTED = 0;
	int totalRejected = TOTAL_REJECTED;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
//Zle sformatowane linie: 5, 12, 14, 15
//kombinacja umozliwia poruszanie sie po otwartych plikach