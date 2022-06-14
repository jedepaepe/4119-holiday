package eu.epfc.c4119.holiday.seeders;

import eu.epfc.c4119.holiday.entities.Holiday;
import eu.epfc.c4119.holiday.repositories.HolidayRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HolidaySeed {
    private final HolidayRepository repository;

    public HolidaySeed(HolidayRepository repository) {
        this.repository = repository;
    }

    public void plants() {
        List<Holiday> holidays = new ArrayList<>();
        holidays.add(new Holiday(null, "Sara", "2022-06-01", "2022-06-30", "ACCEPTED"));
        holidays.add(new Holiday(null, "Sara", "2022-08-15", "2022-08-31", "REQUESTED"));
        repository.saveAll(holidays);
    }
}
