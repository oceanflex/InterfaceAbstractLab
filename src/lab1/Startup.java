/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Zachary
 */
public class Startup {
    
    
    public static void main(String[] args) {
        Course introJava = new IntroJavaCourse("Intro to Java", "000001");
        Course introProg = new IntroToProgrammingCourse("Intro to Program", "000002");
        AdvancedJavaCourse advJava = new AdvancedJavaCourse("Advanced Java", "000003");
        System.out.println(advJava.getCapitalizedCourseName());
        System.out.println(introJava.getCourseName());
        System.out.println(introProg.getCourseName());
    }
}
