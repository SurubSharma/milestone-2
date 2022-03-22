package sprinbootProject.springboot.Service;

import sprinbootProject.springboot.Entity.Course;

import java.util.List;

public interface CourseService {
//    public List<Course> getCourses();
//    public Course getCourse(long courseID);
    public List<Course> getnCourse(int count);
    public List<Course> getMovieType(String n);
    public List<Course> getMovieHorrorTypes(String n);

    public List<Course> readCSVContent();
}
