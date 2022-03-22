package sprinbootProject.springboot.Service;

import org.springframework.stereotype.Service;
import sprinbootProject.springboot.Entity.Course;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    public CourseServiceImpl(){

    }



    @Override
    public List<Course> getnCourse(int count) {
int i=0;
        List<Course> movieLists=new ArrayList<>();
        String file="src/main/resources/netflix_titles.csv";
        try {
            System.out.println("Reading csv content-------");
            BufferedReader br=new BufferedReader(new FileReader(file));
            System.out.println(Arrays.stream(br.readLine().split(","))+"  "+br.readLine().split(",").length);
            while(br.readLine()!=null && !br.readLine().equalsIgnoreCase("") && i<count){
                String line=br.readLine();
                if(line!=null) {
                    String[] values = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
//                    System.out.println(values.length);
//                    if (values.length == n) {
                        Course movie = new Course(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8], values[9], values[10], values[11]);
                        movieLists.add(movie);
//                    }
                }
                i++;
            }

            System.out.println(movieLists.toArray().length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movieLists;


    }

    @Override
    public List<Course> getMovieType(String n) {
        List<Course> movieLists=new ArrayList<>();
        String file="src/main/resources/netflix_titles.csv";
        try {
            System.out.println("Reading csv content-------");
            BufferedReader br=new BufferedReader(new FileReader(file));
            System.out.println(Arrays.stream(br.readLine().split(","))+"  "+br.readLine().split(",").length);
            while(br.readLine()!=null && !br.readLine().equalsIgnoreCase("")){
                String line=br.readLine();
                if(line!=null) {
                    String[] values = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
//                    System.out.println(values.length);
                    if (values[5].equals(n)) {
                        Course movie = new Course(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8], values[9], values[10], values[11]);
                        movieLists.add(movie);
                    }
                }
            }

            System.out.println(movieLists);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movieLists;

    }

    @Override
    public List<Course> getMovieHorrorTypes(String n) {
        List<Course> movieLists=new ArrayList<>();
        String file="src/main/resources/netflix_titles.csv";
        try {
            System.out.println("Reading csv content-------");
            BufferedReader br=new BufferedReader(new FileReader(file));
            System.out.println(Arrays.stream(br.readLine().split(","))+"  "+br.readLine().split(",").length);
            while(br.readLine()!=null && !br.readLine().equalsIgnoreCase("")){
                String line=br.readLine();
                if(line!=null) {
                    String[] values = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
//                    System.out.println(values.length);
                    if (values[10].contains(n)) {
                        Course movie = new Course(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8], values[9], values[10], values[11]);
                        movieLists.add(movie);
                    }
                }
            }

            System.out.println(movieLists);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movieLists;

    }

    public  List<Course> readCSVContent(){
        List<Course> movieLists=new ArrayList<>();
        String file="src/main/resources/netflix_titles.csv";
        try {
            System.out.println("Reading csv content-------");
            BufferedReader br=new BufferedReader(new FileReader(file));
            System.out.println(Arrays.stream(br.readLine().split(","))+"  "+br.readLine().split(",").length);
            while(br.readLine()!=null && !br.readLine().equalsIgnoreCase("")){
                String line=br.readLine();
                if(line!=null) {
                    String[] values = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
//                    System.out.println(values.length);
                    if (values.length == 12) {
                        Course movie = new Course(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8], values[9], values[10], values[11]);
                        movieLists.add(movie);
                    }
                }
            }

            System.out.println(movieLists.toArray().length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movieLists;
    }

}
