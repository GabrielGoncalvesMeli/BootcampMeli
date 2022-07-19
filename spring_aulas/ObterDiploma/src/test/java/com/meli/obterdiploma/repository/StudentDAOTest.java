package com.meli.obterdiploma.repository;

import com.meli.obterdiploma.exception.StudentNotFoundException;
import com.meli.obterdiploma.model.StudentDTO;
import com.meli.obterdiploma.util.TestUtilsGenerator;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import static org.assertj.core.api.Assertions.assertThat;

class StudentDAOTest {

    // @Autowired
    private IStudentDAO studentDAO;

    @AfterEach
    void tearDown() {
        TestUtilsGenerator.emptyUsersFile();
    }

    @BeforeEach
    void setup() {
        studentDAO = new StudentDAO();
        TestUtilsGenerator.emptyUsersFile();
    }

    @Test
    void save() {
        StudentDTO newStudent = TestUtilsGenerator.getNewStudentWithOneSubject();

        StudentDTO savedStudent = studentDAO.save(newStudent); // garante q existe no BD
        savedStudent.setStudentName("Novo nome");
        savedStudent.getSubjects().get(0).setName("Nova disciplina");
        StudentDTO updatedStudent = studentDAO.save(savedStudent);

        assertThat(updatedStudent).isNotNull();
        assertThat(updatedStudent.getId()).isEqualTo(savedStudent.getId());
        assertThat(updatedStudent.getStudentName()).isEqualTo(savedStudent.getStudentName());
        assertThat(updatedStudent.getSubjects().get(0)).isEqualTo(savedStudent.getSubjects().get(0));

    }

    @Test
    @DisplayName("Update Student with id")
    void save_updateStudent_whenStudentWithId() {
        StudentDTO newStudent = TestUtilsGenerator.getNewStudentWithOneSubject();

        StudentDTO savedStudent = studentDAO.save(newStudent);

        savedStudent.setStudentName("Novo nome");
        savedStudent.getSubjects().get(0).setName("Nova disciplina");

        StudentDTO updatedStudent = studentDAO.save(savedStudent);

        assertThat(updatedStudent).isNotNull();
        assertThat(updatedStudent.getId()).isEqualTo(savedStudent.getId());
        assertThat(updatedStudent.getStudentName()).isEqualTo(savedStudent.getStudentName());
        assertThat(updatedStudent.getSubjects().get(0).getName())
                .isEqualTo(savedStudent.getSubjects().get(0).getName());
    }

    @Test
    void save_throwException_whenStudentWithIdAndNotExist() {
        StudentDTO student = TestUtilsGenerator.getStudentWithId();

        StudentNotFoundException exception = Assertions.assertThrows(StudentNotFoundException.class, () -> {
            StudentDTO savedStudent = studentDAO.save(student);
        });

        assertThat(exception.getError().getDescription()).contains(student.getId().toString());
        assertThat(exception.getStatus()).isEqualTo(HttpStatus.NOT_FOUND);
    }

    @Test
    @DisplayName("When students exists returns true")
    void saveExists_returnTrue_WhenStudentExist() {
        StudentDTO newStudent = TestUtilsGenerator.getNewStudentWithOneSubject();
        StudentDTO savedStudent = studentDAO.save(newStudent); // garante q existe no BD

        boolean found = studentDAO.exists(savedStudent);

        assertThat(found).isTrue();
    }

    @Test
    @DisplayName("When students doesn't exists")
    void saveExists_returnTrue_WhenStudentdoesntExist() {
        StudentDTO student = TestUtilsGenerator.getStudentWithId();

        boolean found = studentDAO.exists(student);

        assertThat(found).isFalse();
    }

    @Test
    void delete() {
    }

    @Test
    void exists() {
    }

    @Test
    @DisplayName("Find by id when exists student")
    void findById() {
        StudentDTO newStudent = TestUtilsGenerator.getNewStudentWithOneSubject();
        StudentDTO savedStudent = studentDAO.save(newStudent);

        StudentDTO foundStudent = studentDAO.findById(savedStudent.getId());

        assertThat(foundStudent).isNotNull();
        assertThat(foundStudent.getId()).isEqualTo((savedStudent.getId()));
        assertThat(foundStudent.getStudentName()).isEqualTo(savedStudent.getStudentName());
    }

    @Test
    @DisplayName("Find by id when doesn't exists student")
    void findById_throwsException() {
        StudentDTO student = TestUtilsGenerator.getStudentWithId();

        StudentNotFoundException exception = Assertions.assertThrows(StudentNotFoundException.class, () -> {
            StudentDTO foundStudent = studentDAO.findById(student.getId());
        });

        assertThat(exception.getError().getDescription()).contains(student.getId().toString());

    }
}