    package hrSystem;

    public class Employee {

        //Fields
        String name;
        String surname;
        String department;
        String title;
        String location;
        int id;
        boolean remote;

        // method: listing all employee
        void printAll() {
            System.out.println("ID: " + id);
            System.out.println("Name Surname: " + name + " " + surname);
            System.out.println("Department: " + department);
            System.out.println("Title: " + title);
            System.out.println("Location: " + location);
            System.out.println("Remote: " + remote + "\n");
            System.out.println("*** *** *** ***\n");
        }

    }
