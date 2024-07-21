package com.harsh.fibbo;

public class Fibbonacci {

	public Integer showElement(int i) {

		if (i <= 0) {
			return 0;
		}
		if (i == 1) {
			return i;
		}
		return showElement(i - 2) + showElement(i - 1);
	}

}
