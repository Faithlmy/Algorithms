package April.a04;

public class BoxItem implements Sellable, Transportable{
	
	private String descript;
	private int price;
	private int weight;
	private boolean haz;
	private int height;
	private int width;
	private int depth;
	
	
	public BoxItem(String desc, int p, int w, boolean h) {
		descript = desc;
		price = p;
		weight = w;
		haz = h;
		}
	
	public void setBox(int h, int w, int d) {
		height = h;
		width = w;
		depth = d;
	}

	@Override
	public int weight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isHdous() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int listPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lowestPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
