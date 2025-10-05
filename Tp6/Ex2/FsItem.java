package Tp6.Ex2;

public abstract class FsItem {
	protected String name;
	
	public FsItem(String name) {
		this.name = name;
	}
	
	public abstract long getSize();
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return "FsItem[name=" + this.name + "]";
	}
}
