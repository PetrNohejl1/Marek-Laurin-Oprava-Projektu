
public class Main {

	public static void main(String[] args) {

		try {

//	tadz si dodelas excepsnu
//     Trojuhelnik t1 = Trojuhelnik.factoryTrojuhelnk(5 ,5 ,8 );

			System.out.println(t1);
			
		} catch (TrojuhelnkException e) {
			System.err.println(e.getMessage());

		}
	}

}
