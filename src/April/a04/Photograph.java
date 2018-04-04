package April.a04;

public class Photograph implements Sellable {
	
	private String  descript;
	private int price;
	private boolean color;

	public  Photograph(String desc, int p, boolean c) {
		// TODO Auto-generated method stub
		descript = desc;
		price = p;
		color = c;
	}
	
	@Override
	public String description() {
		// TODO Auto-generated method stub
		return descript;
	}

	@Override
	public int listPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public int lowestPrice() {
		// TODO Auto-generated method stub
		return price/2;
	}
	
	public boolean isColor() {
		return color;
	}


}
