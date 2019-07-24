package objects.groceryShop;

public class Apple extends Fruit{
	
	private String variety;

	public Apple(String variety) {
		this.variety = variety;
	}
	
	public String getVariety() {
		return variety;
	}
	
	public void setVariety(String variety) {
		this.variety=variety;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Jabłko "+variety);
	}
	

}
