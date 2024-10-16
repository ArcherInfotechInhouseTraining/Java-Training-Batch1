class Complex
{
	private double real;
	private double img;

	//setters
	public void setRealPart(double r)
	{
		real=r;
	}
	public void setImaginaryPart(double i)
	{
		img=i;
	}
	//getters
	public double getRealPart()
	{
		return real;
	}
	public double getImaginaryPart()
	{
		return img;
	}
}
class ComplexNumbers
{
	public static void main(String []args)
	{
		Complex c1=new Complex();
		c1.setRealPart(10);
		c1.setImaginaryPart(4.7);
		Complex c2=new Complex();
		c2.setRealPart(4);
		c2.setImaginaryPart(4.0);

		Double ar=c1.getRealPart()+c2.getRealPart();
		Double ai=c1.getImaginaryPart()+c2.getImaginaryPart();

		Double sr=c1.getRealPart()-c2.getRealPart();
		Double si=c1.getImaginaryPart()-c2.getImaginaryPart();

		Double mr=(c1.getRealPart()*c2.getRealPart())-(c1.getImaginaryPart()*c2.getImaginaryPart());
		Double mi=(c1.getRealPart()*c2.getImaginaryPart())+(c1.getImaginaryPart()*c2.getRealPart());



		System.out.println("Addition: "+ar+" + "+ai+"i");
		System.out.println("Subtraction: "+sr+" + "+si+"i");
		System.out.println("Multiplication: "+mr+" + "+mi+"i");

	}
}