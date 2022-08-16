package guia1;

public class El_paseo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		El_paseo clase;
		clase = new El_paseo ();
		
				
	//un bus tiene 35 asientos
		
		double x;
		double y;
		x = clase.asiento(20, 20) ; 
		y = x/35;
		int buses = (int)Math.round(y);
		int asientos = (int)Math.round(x);
		//System.out.println("se necesitan " + x + " asientos");
		System.out.println("se necesitan " + asientos + " asientos");
		//System.out.println("entonces se necesitan " + y + " bus(es)");
		System.out.println("entonces se necesitan " + buses + " bus(es)");
	}		
	
		
		public int asiento (int a, int b) {
		int x;
		x = (2*a) + (1*b);
		return x;
		}
		
		
	
}
