package eu.epfc.c4119.holiday;

import eu.epfc.c4119.holiday.entities.Holiday;
import eu.epfc.c4119.holiday.repositories.HolidayRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HolidayApplication {
	private HolidayRepository holidayRepository;

	public HolidayApplication(HolidayRepository holidayRepository) {
		this.holidayRepository = holidayRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(HolidayApplication.class, args);
	}
}
