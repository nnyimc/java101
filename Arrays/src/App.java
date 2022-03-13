import java.time.LocalDate;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		char[] charArrayOne = {'a', 'c', 'e' };
		char[] charArrayTwo = charArrayOne;
		charArrayOne = new char[8];
		System.arraycopy(charArrayTwo, 0, charArrayOne, 0, charArrayTwo.length);
		
		for (int j = 0; j < charArrayOne.length; j++) {
			if (charArrayOne[j] == '\u0000') {
				System.out.println("EMPTY!");
			} else {
				System.out.println(charArrayOne[j]);
			}
		}
		
		LocalDate[] dates = { LocalDate.now(), generateDate(), generateDate(), generateDate() };
		LocalDate[] extraDates = dates;
		dates = new LocalDate[12];
		System.arraycopy(extraDates, 0, dates, 0, extraDates.length);
		
		Employee boss = new Manager("Mergers/Acquisitions");
		Employee firstSecretary = new Secretary();
		Employee[] easternDivision = new Employee[12];
		easternDivision[0] = boss;
		easternDivision[0].setName("Tiberius");
		easternDivision[4] = firstSecretary;
		easternDivision[4].setName("Moneypenny");
		easternDivision[7] = new Manager("IT");
		easternDivision[7].setDateOfBirth(LocalDate.of(1975,  2, 11));
		easternDivision[7].setName("Linus");
		
		int index = 0;
		for (Employee e: easternDivision) {
			
			if ( e != null) {
				System.out.println(index + " " + e);
			}
			index++;
		}
		
        char[] letters = {'a', 'B', 'z', 'd', 'A', 'l', 'ù', '@'};
		Arrays.sort(letters);
		System.out.println(letters[0] + " " + letters[4]);
	}


	private static LocalDate generateDate() {
		return LocalDate.of((int) (Math.random()*2022), (int) (Math.random()*11 + 1), (int) (Math.random()*27 + 1));
	}

}
