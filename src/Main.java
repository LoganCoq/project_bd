public class Main 
{

	public static void main(String args[])
	{
		ParserRelationalCalculus myparser = new ParserRelationalCalculus();
		System.out.println("Veuillez saisir votre calcul reltionnel :");

		Scanner myscanner = new Scanner(System.in);
		ArrayList<String> calculus = new ArrayList<String>();

		while(myscanner.hasNext())
		{
			calculus.append(myscanner.next());
		}

		myparser.parse(calculus);

	}

}
