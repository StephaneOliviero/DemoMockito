package co.simplon.test.mockito;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import static org.hamcrest.MatcherAssert.assertThat;

public class ExempleMockito {

	@Test
	public void bar_convertit_bien_le_resultat_de_foo_en_majuscules() {
		// GIVEN
		Foo foo = mock(Foo.class);
		Bar bar = new Bar(foo);

		// WHEN pour le Mock
		when(foo.bonjour("Eric")).thenReturn("Un prenom");
		// WHEN pour la classe testée
		String resultat = bar.bonjour("Eric");

		// THEN
		assertThat(resultat, equalTo("UN PRENOM"));
		// optionnel mais permet de valider que le Mock est appelé
		verify(foo, times(1)).bonjour("Eric");
	}

}
