public class Trojuhelnik {
	
	// za prve co musis udelat je ye dac ''crl Shift F'' aby v tom byl prehled 

	double a;
	double b;

	double c;
	double va;

	@Override
	public String toString() {

		return "Strana a = " + a + "| Strana b = " + b + "| Strana c = " + c +  " | Obsah = "
	
					+ getobsah() +   "| Obvod = " + getobvod();
	
if (a == c && a != b || a == b && a != c || b == c && b != a ) {
			return new Trojuhelnik(a, b, c );
			
		}
			
		if (a == b && b == c && a == c) {
			return new Trojuhelnik(a, b, c);

		}
		}

		public Trojuhelnik(double a, double b, double c) {

			this.a = a;
			this.b = b;
			this.c = c;
			
		
		}

		public double getVa() {
			return va;
		}

		public void setVa(double va) {
			this.va = va;
		}

		public double getobsah() {
			return a * va / 2;
		}

		public double getobvod() {
			return a + b + c;
		}

		public double getA() {
			return a;
		}

		public void setA(double a) {
			this.a = a;
		}

		public double getB() {
			return b;
		}

		public void setB(double b) {
			this.b = b;
		}

		public double getC() {
			return c;
		}

		public void setC(double c) {
			this.c = c;
		}

		public static Trojuhelnik factoryTrojuhelnk(int i, int j, int k) {
			// TODO Auto-generated method stub
			return null;
		}

	}

			
//  tady si jeste vytvoris novou tridu (no tady ne ale tady ji budes pouyivat)
//
//public static Trojuhelnik factoryTrojuhelnik(double b, double a, double c) throws TrojuhelnikException {

	
	//if(a+b <=c || a+c <=b || b+c<=a) {
		
	//	throw new TrojuhelnikException("Trojúhelníková nerovnost");
	//}
		
		
//	if (a <= 0 || b <= 0 || c <= 0) {
	//	throw new TrojuhelnikException("Jedna nebo více stran jsou záporné!!");


	


//	} else {
	//	throw new TrojuhelnikException("Trojùhelník není rovnoramenný nebo rovnostranný!!");
	//}
//
