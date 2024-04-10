package sample;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		DateSorter dateSorter = new DateSorter();

		List<LocalDate> localDateList = new ArrayList<>();
		localDateList.add(LocalDate.of(2004, 7, 1));
		localDateList.add(LocalDate.of(2005, 1, 2));
		localDateList.add(LocalDate.of(2007, 1, 1));
		localDateList.add(LocalDate.of(2032, 5, 3));
		localDateList.add(LocalDate.of(2001, 12, 5));
		localDateList.add(LocalDate.of(2039, 4, 3));

		System.out.println(dateSorter.sortDates(localDateList));
	}
}
