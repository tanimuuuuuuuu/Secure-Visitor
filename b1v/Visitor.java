package b1v;

public class Visitor {
	private String currentdir = "";
	/*public void visit(ElementB elementB){
		System.out.println(currentdir + "/" + elementB);
	}
	public void visit (ElementA elementA){
		System.out.println(currentdir + "/" + elementA);
		String savedir = currentdir;
		currentdir = currentdir + "/" + elementA.getName();
		Iterator it = elementA.iterator();
		while(it.hasNext()){
			Entry entry = (Entry)it.next();
			entry.accept(this);
		}
		currentdir = savedir;
	}*/

}
