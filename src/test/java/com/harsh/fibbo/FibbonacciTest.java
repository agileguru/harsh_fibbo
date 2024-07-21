package com.harsh.fibbo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FibbonacciTest {

	private Fibbonacci fibbonacci = new Fibbonacci();

	@Test
	void testFirstElement() {

		Integer value = fibbonacci.showElement(1);
		System.out.println(value);
		assertThat(value).isNotNull().isNotNegative().isEqualTo(1);
	}

	@Test
	void testSecondElement() {

		Integer value = fibbonacci.showElement(2);
		System.out.println(value);
		assertThat(value).isNotNull().isNotNegative().isEqualTo(1);
	}

	@Test
	void testNthElement() {

		assertThat(fibbonacci.showElement(3)).isNotNull().isNotNegative().isEqualTo(2);

		assertThat(fibbonacci.showElement(4)).isNotNull().isNotNegative().isEqualTo(3);

		assertThat(fibbonacci.showElement(5)).isNotNull().isNotNegative().isEqualTo(5);

		assertThat(fibbonacci.showElement(10)).isNotNull().isNotNegative().isEqualTo(55);
	}

	@Test
	void testZeroElement() {

		Integer value = fibbonacci.showElement(0);
		System.out.println(value);
		assertThat(value).isNotNull().isZero();
	}

	@Test
	void testNegetiveElement() {

		assertThat(fibbonacci.showElement(0)).isZero();
	}
}
