public class Main{

	public static void main(String[] args) {
		Linuxwords lw = new Linuxwords();
		boolean result = lw.checkSpelling("Linux");
		System.out.println(result);
		
		System.out.println(lw.checkSpelling("sun"));
		System.out.println(lw.checkSpelling("lollipops"));
		System.out.println(lw.checkSpelling("kitten"));
		System.out.println(lw.checkSpelling("unitcorns"));
		System.out.println(lw.checkSpelling("rainbowz"));

	}

}