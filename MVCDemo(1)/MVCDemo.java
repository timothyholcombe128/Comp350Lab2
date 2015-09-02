/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author justus.poole483
 */

public class MVCDemo {

  public static void main(String[] args) {

      
      Student model  = retriveStudentFromDatabase();

      StudentView view = new StudentView();

      StudentController controller = new StudentController(model, view);

      controller.updateView();

      controller.setStudentName("Jorge");

      controller.updateView();
   }

   private static Student retriveStudentFromDatabase(){
      Student student = new Student();
      student.setName("Miguel");
      student.setRollNo("10");
      return student;
   }
    
}
