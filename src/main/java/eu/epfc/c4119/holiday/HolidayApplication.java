package eu.epfc.c4119.holiday;

import eu.epfc.c4119.holiday.entities.Holiday;
import eu.epfc.c4119.holiday.repositories.HolidayRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HolidayApplication implements CommandLineRunner {
	private HolidayRepository holidayRepository;

	public HolidayApplication(HolidayRepository holidayRepository) {
		this.holidayRepository = holidayRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(HolidayApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Holiday> holidays = new ArrayList<>();
		holidays.add(new Holiday(null, "Sara", "2022-06-01", "2022-06-30", "ACCEPTED"));
		holidays.add(new Holiday(null, "Sara", "2022-08-15", "2022-08-31", "REQUESTED"));
		holidayRepository.saveAll(holidays);
	}
}
