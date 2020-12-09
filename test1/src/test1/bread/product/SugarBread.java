package test1.bread.product;

public class SugarBread extends Bread {
	int flour;
	int water;
	int sugar;
	public SugarBread(String breadType) {
		this.breadType = breadType;
	}
	
	public void setFlour(int flour) {
		this.flour = flour;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	@Override
	public void recipe() {
		System.out.println("bradType : " + breadType);
		System.out.println("recipe");
		System.out.println("flour : " + flour );
		System.out.println("water : " + water );
		System.out.println("sugar : " + sugar );

	}

}
