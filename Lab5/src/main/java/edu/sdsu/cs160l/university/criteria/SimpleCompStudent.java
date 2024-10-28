package edu.sdsu.cs160l.university.criteria;

import edu.sdsu.cs160l.university.course.Course;
import edu.sdsu.cs160l.university.student.Student;
import edu.sdsu.cs160l.university.student.StudentMajor;

//TODO Implement a advanced validity criteria with the specs below
// remove the false value returned and refer to SimpleCompScienceStudent for inspiration

/**
 * Advanced student strategy is a student strategy
 * A student has
 * at least 3 course and
 * at least 1 course with 2xx level and
 * at least 1 course with 3xx level and
 * student is from compsci or compengineering major
 */
public class SimpleCompStudent implements StudentStrategy {
    @Override
    public boolean isValid(Student student) {
        boolean completedRequiredCourses = student.getCoursesEnrolled().size() >= 3;
        boolean completedLevelTwoCourse = false;
        boolean completedLevelThreeCourse = false;
        boolean correctMajor = student.getStudentMajor() == StudentMajor.computersci || student.getStudentMajor() == StudentMajor.computereng;
        for(Course course : student.getCoursesEnrolled()) {
            if(course.courseName().contains("2")) {
                completedLevelTwoCourse = true;
            }
            if(course.courseName().contains("3")) {
                completedLevelThreeCourse = true;
            }
        }
        return completedRequiredCourses && completedLevelTwoCourse && completedLevelThreeCourse && correctMajor;
    }
}
