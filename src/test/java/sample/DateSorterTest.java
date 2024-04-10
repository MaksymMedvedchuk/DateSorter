package sample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DateSorterTest {

	private DateSorter dateSorter;

	@BeforeEach
	void setUp() {
		dateSorter = new DateSorter();
	}

	@Test
	void sortDates_WhenInputIsEmpty_ShouldThrowIllegalArgumentException() {
		List<LocalDate> unsortedDates = List.of();

		assertThrows(IllegalArgumentException.class, () -> dateSorter.sortDates(unsortedDates));
	}

	@Test
	void sortDates_WhenInputContainsDates_ShouldReturnSortedDates() {
		List<LocalDate> unsortedDates = Arrays.asList(
			LocalDate.of(2022, 6, 1),
			LocalDate.of(2023, 3, 15),
			LocalDate.of(2021, 9, 5),
			LocalDate.of(2024, 4, 20)
		);

		Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);
		List<LocalDate> sortedList = new ArrayList<>(sortedDates);

		assertNotNull(sortedDates);
		assertEquals(4, sortedDates.size());
		assertEquals(LocalDate.of(2021, 9, 5), sortedList.get(0));
		assertEquals(LocalDate.of(2023, 3, 15), sortedList.get(1));
		assertEquals(LocalDate.of(2024, 4, 20), sortedList.get(2));
		assertEquals(LocalDate.of(2022, 6, 1), sortedList.get(3));
	}
}
