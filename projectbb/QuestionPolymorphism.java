/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbb;



import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

import java.util.Random;
import javax.swing.JOptionPane;

public class QuestionPolymorphism {
    public int index;
    public int newqu() {
       int n, pass;
        //System.out.println(index);
        int a1[] = {0, 1, 2, 3, 4, 5, 12};
        int a2[] = {8, 9, 10, 11, 7, 13, 6};

        Random rand = new Random();
        n = rand.nextInt(2);
        if (n == 1) {
            pass = a1[index];
        } else {
            pass = a2[index];
        }
        int answer, c = 0;
        switch (pass) {

            case 0:
                String[] myOptions = {"Many forms","Inheritance", "Code reuse", "none"};

                answer = JOptionPane.showInternalOptionDialog(null, "What is polymorphism?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions, myOptions[0]);
                if (answer == 0) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 1:
                String[] myOptions1 = {"Code reuse", "Encapsulation", "Method hiding", "All"};

                answer = JOptionPane.showInternalOptionDialog(null, "What is the advantage of polymorphism?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions1, myOptions1[0]);
                if (answer == 3) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 2:
                String[] myOptions2 = {"Inheritance","Polymorphism" ,"Encapsulation","All"};

                answer = JOptionPane.showInternalOptionDialog(null, "Which concept allows objects of different classes\n to be treated as if they were of the same class?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions2, myOptions2[0]);
                if (answer == 1) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 3:
                String[] myOptions3 = {"  final  ","  static  ","  public  ","  void  "};

                answer = JOptionPane.showInternalOptionDialog(null, "Which keyword is used to declare a constant in Java?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions3, myOptions3[0]);
                if (answer == 0) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 4:
                String[] myOptions4 = {"Polymorphism","Encapsulation","Abstraction","none"};

                answer = JOptionPane.showInternalOptionDialog(null, "Which feature of OOP is exhibited by the function\n overriding?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions4, myOptions4[0]);
                if (answer == 0) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 5:
                String[] myOptions5 = {" main() "," start()","constructor()","  run()  "};

                answer = JOptionPane.showInternalOptionDialog(null, "Which method is called when an object is\n created in Java?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions5, myOptions5[0]);
                if (answer == 2) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 6:
                String[] myOptions6 = {"    1    ","    2    ","    3    ","    4    "}; 

                answer = JOptionPane.showInternalOptionDialog(null, "Java polymorphism is divided into _ types.", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions6, myOptions6[0]);
                if (answer == 1) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 7:
                String[] myOptions7 = {"   many   ","   some  "," different "," one "};

                answer = JOptionPane.showInternalOptionDialog(null, " poly means _? ", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions7, myOptions7[0]);
                if (answer == 0) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 8:
                String[] myOptions8 = {"SmallTalk","  Java  ","   C++   ","   Ada  "}; 

                answer = JOptionPane.showInternalOptionDialog(null, "Which among the following is the language which \nsupports classes but not polymorphism?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions8, myOptions8[0]);
                if (answer == 3) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 9:
                String[] myOptions9 = {"Inline"," Virtual ","Undefined","Class member"}; 

                answer = JOptionPane.showInternalOptionDialog(null, "Which type of function among the following shows\n polymorphism?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions9, myOptions9[0]);
                if (answer == 3) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
                
            case 10:
                String[] myOptions10 = {"Overloading||","Overloading+=","Overloading<<","none"}; 

                answer = JOptionPane.showInternalOptionDialog(null, "Which among the following can show polymorphism?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions10, myOptions10[0]);
                if (answer == 2) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 11:
                String[] myOptions11 = {"Inheritance","Overloading","Polymorphism","Overriding"}; 

                answer = JOptionPane.showInternalOptionDialog(null, "If same message is passed to objects of several different\n classes and all of those can respond in a different\n way, what is this feature called?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions11, myOptions11[0]);
                if (answer == 2) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
                
            case 12:
                String[] myOptions12 = {"  run  "," compile  "," coding  ","  execution  "}; 

                answer = JOptionPane.showInternalOptionDialog(null, "method overloading is __time polymorphism.", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions12, myOptions12[0]);
                if (answer == 1) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 13:
                String[] myOptions13 = {"MethodOverloading","MethodOverriding","A&B","None"}; 

                answer = JOptionPane.showInternalOptionDialog(null, "which one is runtime polymorphism?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions13, myOptions13[0]);
                if (answer == 1) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            
        }      
        
           
    return c; 
    }

        
 }

