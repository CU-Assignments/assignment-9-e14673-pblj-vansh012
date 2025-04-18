import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class StudentDAO {

    private SessionFactory factory;

    public StudentDAO() {
        factory = new Configuration()
                     .configure("hibernate.cfg.xml")
                     .addAnnotatedClass(Student.class)
                     .buildSessionFactory();
    }

    public void saveStudent(Student student) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
    }

    public Student getStudent(int id) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        Student student = session.get(Student.class, id);
        session.getTransaction().commit();
        return student;
    }

    public void updateStudent(Student student) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.update(student);
        session.getTransaction().commit();
    }

    public void deleteStudent(int id) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        Student student = session.get(Student.class, id);
        session.delete(student);
        session.getTransaction().commit();
    }

    public List<Student> getAllStudents() {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        List<Student> students = session.createQuery("from Student").getResultList();
        session.getTransaction().commit();
        return students;
    }

    public void close() {
        factory.close();
    }
}
