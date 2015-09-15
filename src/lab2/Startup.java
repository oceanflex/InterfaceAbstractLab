/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Zachary
 */
public class Startup {
    public static void main(String[] args) {
        HasClass introJava = new IntroJavaCourse("Intro to Java", "000001");
        HasClass introProg = new IntroToProgrammingCourse("Intro to Program", "000002");
        HasClass advJava = new AdvancedJavaCourse("Advanced Java", "000003");
        System.out.println(advJava.getCourseName());
        System.out.println(introJava.getCourseName());
        System.out.println(introProg.getCourseName());
    }
}
