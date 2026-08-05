package pk.edu.niit.version_system.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pk.edu.niit.version_system.entity.EmployeeEntity.EmployeeEntity;
import pk.edu.niit.version_system.entity.UserEntity.UserEntity;
import pk.edu.niit.version_system.repository.EmployeeRepository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepos;
    public EmployeeEntity addEmployee(EmployeeEntity employee) {

        return employeeRepos.save(employee);
    }



    // READ ALL
    public List<EmployeeEntity> getAllEmployees() {

        return employeeRepos.findAll();
    }



    // READ BY ID
    public EmployeeEntity getEmployeeById(String emp_id) {

        return employeeRepos.findById(emp_id)
                .orElseThrow(() ->
                        new RuntimeException("User not found"));
    }



    // UPDATE
    public EmployeeEntity updateEmployee(String emp_id, EmployeeEntity employee) {


        EmployeeEntity existingEmployee =
                employeeRepos.findById(emp_id)
                        .orElseThrow(() ->
                                new RuntimeException("Employee not found"));

        existingEmployee.setEmp_id(employee.getEmp_id());
        existingEmployee.setEmp_name(employee.getEmp_name());
        existingEmployee.setDepartment(employee.getDepartment());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setSalary(employee.getSalary());


        return employeeRepos.save(existingEmployee);
    }



    // DELETE
    public String deleteEmployee(String emp_id) {

        employeeRepos.deleteById(emp_id);

        return "User deleted successfully";
    }
}
