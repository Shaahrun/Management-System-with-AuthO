package com.gmail.ejikemesharon.University.Management.System.service;

import com.gmail.ejikemesharon.University.Management.System.model.Course;
import com.gmail.ejikemesharon.University.Management.System.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {

        this.courseRepository = courseRepository;
    }

    public List<Course> getCourses() {
        return  courseRepository.findAll();
    }
}
