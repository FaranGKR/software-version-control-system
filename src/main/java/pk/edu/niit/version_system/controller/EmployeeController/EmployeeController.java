package pk.edu.niit.version_system.controller.EmployeeController;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pk.edu.niit.version_system.entity.EmployeeEntity.EmployeeEntity;
import pk.edu.niit.version_system.service.EmployeeService.EmployeeService;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<?> getAllEmployees() {
        try {
            log.info("Fetching all employees...");
            return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Error while fetching all employee error: {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/emp_id/{emp_id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable String emp_id) {
        try {
            log.info("GET /employee/emp_id/ - Fetching employee with ID: {}", emp_id);
            return new ResponseEntity<>(employeeService.getEmployeeById(emp_id), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Error while fetching employee with ID: {}", emp_id, e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping
    public ResponseEntity<?> addEmployee(@RequestBody EmployeeEntity employee) {
        try {
            log.info("POST /employee/emp_id/ - Adding employee with ID: {}", employee.getEmp_id());
            return new ResponseEntity<>(employeeService.addEmployee(employee), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Error while adding employee : {} ", e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


    @PutMapping("/emp_id/{emp_id}")
    public ResponseEntity<?> updateEmployee(
            @PathVariable String emp_id,
            @RequestBody EmployeeEntity employee) {

        try {
            log.info("PUT /employee/emp_id/ - Updating employee with ID: {}", emp_id);
            return new ResponseEntity<>(employeeService.updateEmployee(emp_id, employee), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Error while updating employee with ID: {}", emp_id, e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


    @DeleteMapping("/emp_id/{emp_id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable String emp_id) {

        try {
            log.info("DELETE /employee/emp_id/ - Deleting employee with ID: {}", emp_id);
            return new ResponseEntity<>(employeeService.deleteEmployee(emp_id), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Error while deleting employee with ID: {}", emp_id, e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
