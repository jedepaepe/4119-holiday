package eu.epfc.c4119.holiday.seeders;

import eu.epfc.c4119.holiday.entities.Employee;
import eu.epfc.c4119.holiday.repositories.EmployeeRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeSeed {
   private final EmployeeRepository repository;

    public EmployeeSeed(EmployeeRepository repository) {
        this.repository = repository;
    }

    public void plants() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(null, "AJ1", "Arlette", "Longui", "arlette.longui@epfc.eu"));
        repository.saveAll(employees);
    }
}
