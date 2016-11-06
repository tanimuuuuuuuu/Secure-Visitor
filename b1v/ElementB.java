package b1v;


public class ElementB extends Entry {
	private String name;
	private int size;
	public ElementB(String name, int size){
		this.name = name;
		this.size = size;
	}
	public String getName(){
		return name;
	}
	public int getSize(){
		return size;
	}
	/*public void accept(Visitor v) {
		v.visit(this);
	}*/
}
