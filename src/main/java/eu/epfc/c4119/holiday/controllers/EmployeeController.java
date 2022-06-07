package eu.epfc.c4119.holiday.controllers;

import eu.epfc.c4119.holiday.entities.Employee;
import eu.epfc.c4119.holiday.repositories.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * traite les requêtes http
 */
@Controller
public class EmployeeController {
    private EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("employees")
    public String get(Model model) {
        List<Employee> employees = repository.findAll();
        for (Employee e: employees) {
            System.out.println(e);
        }
        model.addAttribute("list", employees);
        return "employees.html";
    }
}
