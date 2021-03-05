package cleancode.videostore.clean;
import static org.junit.Assert.assertEquals;

import cleancode.videostore.clean.movie.ChildrenMovie;
import cleancode.videostore.clean.movie.NewReleaseMovie;
import cleancode.videostore.clean.movie.Movie;
import org.junit.Test;



public class StatementTest {

	@Test
	public void characterizationTest() {
		Customer c = new Customer("John");
		Movie movie1 = new NewReleaseMovie("Noe");
		Rental rental1 = new Rental(movie1, 5);
		c.addRental(rental1);
		Movie movie2 = new ChildrenMovie("Lion King");
		Rental rental2 = new Rental(movie2, 3);
		c.addRental(rental2);
		
		String statement = c.getStatement();
		String expected  = "Rental Record for John\n" +
				"	Noe	15.0\n" +
				"	Lion King	1.5\n" +
				"Amount owed is 16.5\n" +
				"You earned 3 frequent renter points";
		
		assertEquals(expected, statement);
	}
}
