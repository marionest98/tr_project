package day0216.collection.generic;

public class GenericPrinterTest {
	public static void main(String[] args) {

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		plasticPrinter.setMaterial(new Plastic());
		System.out.println(plasticPrinter);
		
	  //GenericPrinte2r<Powder> powderPrinter2 = new GenericPrinter2<>();
		GenericPrinter2<Plastic> plasticPrinter2 = new GenericPrinter2<>();
		plasticPrinter2.setMaterial(new Plastic());
		plasticPrinter2.pringting();
		
	}

}
