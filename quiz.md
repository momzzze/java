create employee class

class Employee{
    String name
    String id
    Department department id

    getName()
    getDepartment()
}

class Department{
   Employee employees: collection
    String name
    String id
    assignEmployee(Employee employee)
    getEmployees()
        
}

class DepartmentFinder{
    find(departmentNumber): Department

}


Employee newEmp=new Employee()
newEmp.name="John"
Department aDept=DepartmentFinder.find(departmentNumber);
aDept.assignEmployee(newEmp)
print(aDept.getEmployee());
