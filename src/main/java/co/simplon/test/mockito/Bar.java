package co.simplon.test.mockito;

public class Bar {
	private Foo foo;
	
	public Bar(Foo foo) {
		this.foo = foo;
	}

	public String bonjour(String prenom) {
		String resultatIntermediaire = foo.bonjour(prenom);
		return resultatIntermediaire.toUpperCase();
	}
	
}