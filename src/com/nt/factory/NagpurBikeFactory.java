package com.nt.factory;

import com.nt.bike.BajajBike;
import com.nt.bike.BajajDiscoverBike;
import com.nt.bike.BajajPlatinaBike;
import com.nt.bike.BajajPulsorBike;

public class NagpurBikeFactory {

	public static BajajBike createBajajBike(String bike)
	{
		BajajBike bajaj=null;
		
		if(bike.equalsIgnoreCase("discover"))
			bajaj=new BajajDiscoverBike();
		else if(bike.equalsIgnoreCase("platina"))
			bajaj=new BajajPlatinaBike();
		else if(bike.equalsIgnoreCase("pulsor"))
			bajaj=new BajajPulsorBike();
		else
			throw new IllegalArgumentException("invalid input");
		bajaj.assembling();
		
		bajaj.painting();
		
		return bajaj;
		
		
	}
}
