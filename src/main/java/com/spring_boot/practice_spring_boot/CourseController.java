package com.spring_boot.practice_spring_boot;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourse() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "Udemy"),
                new Course(2, "Learn Git", "Self-learning"),
                new Course(3, "Learn GitHub", "Udemy"),
                new Course(4, "Learn Cloud", "Udemy"),
                new Course(5, "Learn DSA", "Udemy")
        );
    }
}
//http://localhost:8080/courses
// Course: id, name, auth