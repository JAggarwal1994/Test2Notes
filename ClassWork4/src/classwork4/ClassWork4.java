/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classwork4;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class ClassWork4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner userInfo = new Scanner(System.in);
        System.out.println("");
        
        System.out.print("Enter your full name: ");
        String fullName = userInfo.nextLine();
        
        System.out.print("Enter your year in college(#): ");
        int yearInCollege = userInfo.nextInt();
        userInfo.nextLine();
        
        System.out.print("Enter your Lecture section: ");
        int lectureSection = userInfo.nextInt();
        userInfo.nextLine();
        
        System.out.print("Enter your Professor's name: ");
        String professorName = userInfo.nextLine();
        
        System.out.print("Enter your Lab section: ");
        int labSection = userInfo.nextInt();
        userInfo.nextLine();       
        
        String fullNameHeader = "Full Name";
        String yearInCollegeHeader = "Year In College";
        String lectureSectionHeader = "Lecture Section";
        String professorNameHeader = "Professor Name";
        String labSectionHeader = "Lab Section";
        
        System.out.printf("%-20s %-20s %-20s %-20s %-20s%n", 
                fullNameHeader, yearInCollegeHeader, lectureSectionHeader, 
                professorNameHeader, labSectionHeader);
        
        System.out.printf("%-20s %-20d %-20d %-20s %-20d", 
                fullName, yearInCollege, lectureSection, 
                professorName, labSection);
        System.out.println("");
        
        
        //Logic
        //variables types: int, double, String, char
        boolean isTrue = true;
        //Naming: is a question
        
        //Relations
        System.out.println(3 > 5);
        isTrue = 3 > 5;
        System.out.println(isTrue);
        
        int numberOfApples = 5;
        int appleEdgeCase = 10;
        boolean isEnoughApples = numberOfApples >= appleEdgeCase;
        System.out.println("Do we have at least " + appleEdgeCase + 
                " apples? " + isEnoughApples);
        
        //if statement
        numberOfApples = 5;
        appleEdgeCase = 10;
        
        //print We have at least appleEdgeCase apples
        //or
        //We do not have at least appleEdgeCase apples
        
        if(numberOfApples >= appleEdgeCase)
        {
            //prints if "if statement" is true
            System.out.println("We have at least " + appleEdgeCase + "apples.");
        } //All code inbetween these { } happens if true
        else
        {
            //print if "if statement" is false
            System.out.println("We do not have at least "
                    + appleEdgeCase + " apples.");
        }
        //else if
        System.out.print("Enter your number of apples: ");
        numberOfApples = userInfo.nextInt();
        appleEdgeCase = 10;
        int appleSecondEdgeCase = 7;
            
        if(numberOfApples >= appleEdgeCase) 
        {
            //prints if "if statement" is true
            System.out.println("We have at least " + appleEdgeCase + " apples.");
        } //All code inbetween these { } happens if true
        else if (numberOfApples >= appleSecondEdgeCase)
        {
            System.out.println("We have at least " + appleSecondEdgeCase + 
                    " apples.");
        }
        else
        {
            //print if "if statement" is false
            System.out.println("We do not have at least "
                    + appleEdgeCase + " or " + appleSecondEdgeCase + " apples.");
            
        }
        
        //nested if
        
        //numberOfApples >= appleSecondEdgeCase
        if(numberOfApples < appleEdgeCase)
        {
            if(numberOfApples < appleSecondEdgeCase)
            {
                System.out.println("We do not have at least "
                    + appleEdgeCase + " or " + appleSecondEdgeCase + " apples.");
            }
            else
            {
                System.out.println("We have at least "
                    + appleSecondEdgeCase + " but not " + appleEdgeCase + " apples.");
            }
        }    
        else
        {
            System.out.println("We have at least "
                    + appleSecondEdgeCase + " but not " + appleEdgeCase + " apples.");     
        }
        
        //logic operators
        // && = and statement 
        // || = or statement
        // == : asks if variable = other variable example: 3==5 true or false? <- False
        appleSecondEdgeCase = 20;
        if(numberOfApples > appleEdgeCase || numberOfApples < appleSecondEdgeCase)
        {    
            System.out.println("We have at least " + appleEdgeCase + 
                    " and we do not have more than " + appleSecondEdgeCase +
                    " apples.");  
        }
        
        boolean isTest = true;
        if (!isTest)
        {
            System.out.println(true);
        }    
        else
        {
            System.out.println(false);
        }
        
        String words = "hello";
        
        if (words.startsWith("h"));
    }
  }
}
