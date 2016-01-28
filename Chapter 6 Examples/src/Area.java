
public class Area {
	
	public static void area(int r, double pi){
		System.out.println(pi*r*r);
		System.out.println(Math.PI*Math.pow(r, r));
	}
	public static void area(int w, int l){
		System.out.println(w*l);
	}
	public static void area(double pi, int r, int h){
		System.out.println(pi*r*r*h);
		System.out.println(Math.PI*Math.pow(r,r)*h);
	}

	public static void main(String[] args) {
		Area.area(2, 4);
		Area.area(3.14,  2, 4);
	}

}
