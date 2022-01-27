package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {


	private static final int TOTAL_REJECTED = 0;
	private int totalRejected = getTotalRejected();

	public static int getTotalRejected() {
		return TOTAL_REJECTED;
	}

	public int reportRejected() {
		return getTotalRejected();
	}
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			setTotalRejected(getTotalRejected() + 1);
		else
			super.countIn(in);
	}

	public void setTotalRejected(int totalRejected) {
		this.totalRejected = totalRejected;
	}
}
//Zle sformatowane linie: 5, 12, 14, 15
//kombinacja umozliwia poruszanie sie po otwartych plikach