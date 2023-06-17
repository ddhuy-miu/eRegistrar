package miu.cs425.eregistrar.services;

import miu.cs425.eregistrar.models.Student;
import miu.cs425.eregistrar.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository repository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.repository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return (List<Student>) repository.findAll();
    }

    @Override
    public Optional<Student> getStudent(Integer studentId) {
        return repository.findById(studentId);
    }

    @Override
    public void deleteStudent(Integer studentId) {
        repository.deleteById(studentId);
    }

    @Override
    public void deleteStudent(Student student) {
        repository.delete(student);
    }
}
