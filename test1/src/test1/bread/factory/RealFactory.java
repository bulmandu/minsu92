package test1.bread.factory;


import test1.bread.product.*;

public class RealFactory extends Factory {

	@Override
	public Bread create(String bread) {
		if(bread.equals("butter")) {
			return new ButterBread("butter");
		}
		else if(bread.equals("cream")) {
			return new CreamBread("cream");
		}
		else {
			return new SugarBread("sugar");
		}
	}

}
