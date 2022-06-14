package eu.epfc.c4119.holiday.initializers;

import eu.epfc.c4119.holiday.seeders.EmployeeSeed;
import eu.epfc.c4119.holiday.seeders.HolidaySeed;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class SeedApplicationRunner implements ApplicationRunner {
    private final HolidaySeed seedHoliday;
    private final EmployeeSeed employeeSeed;

    public SeedApplicationRunner(HolidaySeed holidaySeed, EmployeeSeed employeeSeed) {
        this.seedHoliday = holidaySeed;
        this.employeeSeed = employeeSeed;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        seedHoliday.plants();
        employeeSeed.plants();
    }
}
