package edu.sdsu.cs160l;

import edu.sdsu.cs160l.university.lab7.exceptions.ClassFullException;
import edu.sdsu.cs160l.university.lab7.exceptions.StudentAlreadyEnrolledException;
import edu.sdsu.cs160l.university.lab7.registrar.Registrar;
import edu.sdsu.cs160l.university.lab7.student.SDSUStudent;
import edu.sdsu.cs160l.university.lab7.student.StudentLevel;
import edu.sdsu.cs160l.university.lab7.student.StudentMajor;

/**
 * Exceptions are of 2 types, Checked and Unchecked
 * They are a powerful way of knowing what if something goes wrong with our code.
 *
 * Fix 2 todos in your code
 * 1) in registrar class
 * 2) in course class
 */
public class ExceptionMain {
    public static void main(String[] args) throws ClassFullException, StudentAlreadyEnrolledException {
        SDSUStudent vinh = new SDSUStudent(123123123L, "Vinh Tran", 1.2, StudentLevel.FRESHMAN, StudentMajor.computersci);
        Registrar.getInstance().enrollStudentToClass(vinh, "bad class");
        //write sample code here
    }
}
