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
        IntroJavaCourse introJava = new IntroJavaCourse("Intro to Java", "000001");
        IntroToProgrammingCourse introProg = new IntroToProgrammingCourse("Intro to Program", "000002");
        AdvancedJavaCourse advJava = new AdvancedJavaCourse("Advanced Java", "000003");
        advJava.getCapitalizedCourseName();
        introJava.getCourseName();
        introProg.getCourseName();
    }
}
