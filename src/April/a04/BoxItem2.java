package April.a04;

public class BoxItem2 implements Insurable {
	
	/*
	 * This class implements Tnsurable, but it must implements interface that Insurable extends interfaces
	 * */

	@Override
	public String description() {  // Sellable.java
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int listPrice() {  // Sellable.java
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lowestPrice() { // Sellable.java
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int weight() {  // Transporttable.java
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isHdous() { // Transporttable.java
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int insureValue() { // Insurable.java
		// TODO Auto-generated method stub
		return 0;
	}

}
