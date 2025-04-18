public class Main {

    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();

        // Create new student
        Student student = new Student("John Doe", 22);
        studentDAO.saveStudent(student);

        // Get a student by ID
        Student retrievedStudent = studentDAO.getStudent(student.getId());
        System.out.println("Retrieved: " + retrievedStudent);

        // Update student
        retrievedStudent.setAge(23);
        studentDAO.updateStudent(retrievedStudent);

        // Delete student
        studentDAO.deleteStudent(retrievedStudent.getId());

        // Get all students
        System.out.println("All Students: " + studentDAO.getAllStudents());

        studentDAO.close();
    }
}
