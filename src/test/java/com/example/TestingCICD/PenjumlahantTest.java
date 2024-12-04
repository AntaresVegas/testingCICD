package com.example.TestingCICD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PenjumlahantTest {

	@Test
	public void testPenjumlahan() {
		int result = Penjumlahan.add(5, 5);
		assertEquals(10,result);
	}

}
