package com.nt.test;

import com.nt.bike.BajajBike;
import com.nt.factory.ChennaiBajajFactory;
import com.nt.factory.NagpurBikeFactory;

public class BajajTest {

	public static void main(String[] args) {
		
		BajajBike bike=ChennaiBajajFactory.createBike("discover");
		bike.driver();
		
		System.out.println("++++++++++++++++++++");
		BajajBike bike2=NagpurBikeFactory.createBajajBike("discover");
		bike2.driver();
	}
}
