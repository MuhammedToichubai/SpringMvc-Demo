package peaksoft.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import peaksoft.entities.Student;
import peaksoft.servcie.StudentService;

import java.util.List;

@Controller
@RequestMapping("api/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public String getStudents(Model model) {
        List<Student> allStudents= studentService.findAll();
        model.addAttribute("allStudents", allStudents);
        return "students";
    }

    // localhost:8080/api/students/new
    @GetMapping("/new")
    public String createStudent(Model model) {
        model.addAttribute("newStudent", new Student());
        return "create-student";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("newStudent") Student student) {
        studentService.save(student);
        return "redirect:/api/students";
    }


}
