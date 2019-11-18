package pl.piaseckif.payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.piaseckif.payroll.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
