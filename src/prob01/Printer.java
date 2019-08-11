package prob01;

public class Printer{
	
	public void println(int i) {
		System.out.println(i);
	}

	public void println(boolean b) {
		System.out.println(b);
	}

	public void println(double c) {
		System.out.println(c);
	}

	public void println(String string) {
		System.out.println(string);
	}

	public void println(int i, boolean b, double c, String string) {
		System.out.println(""+ i + " " + b + " " + c + " " + string);
	}	
}