package b1v;

public class Client {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try {
            System.out.println("Making root entries...");
            ElementA rootdir = new ElementA("root");
            ElementA bindir = new ElementA("bin");
            ElementA tmpdir = new ElementA("tmp");
            ElementA usrdir = new ElementA("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new ElementB("vi", 10000));
            bindir.add(new ElementB("latex", 20000));
            rootdir.accept(new Visitor());

            System.out.println("");
            System.out.println("Making user entries...");
            ElementA yuki = new ElementA("yuki");
            ElementA hanako = new ElementA("hanako");
            ElementA tomura = new ElementA("tomura");
            usrdir.add(yuki);
            usrdir.add(hanako);
            usrdir.add(tomura);
            yuki.add(new ElementB("diary.html", 100));
            yuki.add(new ElementB("Composite.java", 200));
            hanako.add(new ElementB("memo.tex", 300));
            tomura.add(new ElementB("game.doc", 400));
            tomura.add(new ElementB("junk.mail", 500));
            rootdir.accept(new Visitor());
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}


