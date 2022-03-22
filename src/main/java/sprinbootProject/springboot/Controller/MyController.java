package sprinbootProject.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sprinbootProject.springboot.Entity.Course;
import sprinbootProject.springboot.Service.CourseService;

import java.util.List;


@RestController
public class MyController {
    @Autowired
    private CourseService courseSerivice;
    private int n;

    @GetMapping("/")
    public String getHelloWorld(){
        return "Hello";
    }
//
//
//    //getCourses
//    @GetMapping("/ccc")
//    public List<Course> readCSVContent(){
//        return this.courseSerivice.readCSVContent();
//    }
    @GetMapping("/tvshows")
    public List<Course> getnCourse(@RequestParam("count") int count){
        return this.courseSerivice.getnCourse(count);
    }

    @GetMapping("/tvshows1")
    public List<Course> getMovieType(@RequestParam("country") String country){
        return this.courseSerivice.getMovieType(country);
    }


    @GetMapping("/tvshows2")
    public List<Course> getMovieHorrorTypes(@RequestParam("movieType") String movieType){
        return this.courseSerivice.getMovieHorrorTypes(movieType);
    }


}
