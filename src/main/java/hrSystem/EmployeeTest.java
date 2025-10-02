    package hrSystem;

    public class EmployeeTest {

        public static void main(String[] args) {

            //create objects from engineeringDepartment class
            Employee employee1 = new Employee();
            Employee employee2 = new Employee();

            //information about employees

            employee1.id = 1001;
            employee1.department = "Development";
            employee1.name = "Can";
            employee1.location = "San Francisco";
            employee1.surname = "Canan";
            employee1.title = "Engineer";
            employee1.remote = true;

            employee2.id = 1002;
            employee2.department = "Quality Assurance";
            employee2.name = "Arda";
            employee2.location = "Los Angeles";
            employee2.surname = "Ardıç";
            employee2.title = "Manager";
            employee2.remote = false;

            employee1.printAll();
            employee2.printAll();





        }
    }
