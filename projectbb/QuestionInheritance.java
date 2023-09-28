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

    public class QuestionInheritance {
    public int index;
    public int newqu() {
        int n, pass;
        //System.out.println(index);
        int a1[] = {0, 1, 2, 3, 4, 5, 6};
        int a2[] = {8, 9, 10, 11, 12, 13,7};

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
                String[] myOptions = {"   Yes  ", "  No  ", "  Maybe ", "  None "};

                answer = JOptionPane.showInternalOptionDialog(null, " Can a subclass access the private\nmembers of its superclass in Java?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions, myOptions[0]);
                if (answer == 1) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 1:
                String[] myOptions1 = {"Extend", "Implement", "Inherit", "Override"};

                answer = JOptionPane.showInternalOptionDialog(null, "What is the keyword used to indicate inheritance in Java?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions1, myOptions1[0]);
                if (answer == 1) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 2:
                String[] myOptions2 = {"   One  ", " Two " ," Three ","Unlimited"};

                answer = JOptionPane.showInternalOptionDialog(null, "How many classes can a class inherit from \nin Java?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions2, myOptions2[0]);
                if (answer == 0) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 3:
                String[] myOptions3 = {"Reusability","Encapsulation","Polymorphism","Code organization"};

                answer = JOptionPane.showInternalOptionDialog(null, "Which of the following is not a benefit of \ninheritance?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions3, myOptions3[0]);
                if (answer == 1) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 4:
                String[] myOptions4 = {"  Private  "," Default  "," none ","Public"};

                answer = JOptionPane.showInternalOptionDialog(null, "Which access modifiers are visible to subclasses?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions4, myOptions4[0]);
                if (answer == 3) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 5:
                String[] myOptions5 = {"  Yes  ","  None  ","  Maybe  "," No "};//ans:c};

                answer = JOptionPane.showInternalOptionDialog(null, "Can a subclass override a private method from its \nsuperclass?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions5, myOptions5[0]);
                if (answer == 3) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 6:
                String[] myOptions6 = {"Single","Hybrid","Hierarchical","Multiple"}; 

                answer = JOptionPane.showInternalOptionDialog(null, "Which inheritance type allows a class to inherit \nfrom multiple classes", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions6, myOptions6[0]);
                if (answer == 3) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 7:
                String[] myOptions7 = {"final"," abstract"," static","synchronized"};

                answer = JOptionPane.showInternalOptionDialog(null, "Which keyword is used to prevent a subclass \nfrom overriding a method of its superclass?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions7, myOptions7[0]);
                if (answer == 0) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 8:
                String[] myOptions8 = {" this()"," super()"," super"," parent()"}; 

                answer = JOptionPane.showInternalOptionDialog(null, "What is the syntax for calling the constructor of \nthe superclass in Java?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions8, myOptions8[0]);
                if (answer == 1) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 9:
                String[] myOptions9 = {"overloading","overriding ","abstraction","encapsulation"}; ;

                answer = JOptionPane.showInternalOptionDialog(null, "which of the following must have inheritance?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions9, myOptions9[0]);
                if (answer == 1) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 10:
                String[] myOptions10 = {"   Yes  ","  No  ","  Maybe  "," None  " };

                answer = JOptionPane.showInternalOptionDialog(null, "Can a subclass call a private constructor of \nits superclass", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions10, myOptions10[0]);
                if (answer == 1) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
        
            case 11:
                String[] myOptions11 = {" final "," super "," override  "," none "}; 

                answer = JOptionPane.showInternalOptionDialog(null, "Which keyword is used to indicate that a\nmethod in a subclass is intended to override\na method in its superclass in Java?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions11, myOptions11[0]);
                if (answer == 2) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 12:
                String[] myOptions12 = {"Inheritance","Binding","Abstraction","Encapsulation"}; 

                answer = JOptionPane.showInternalOptionDialog(null, "Which feature of OOP reduces the use of nested \nclasses?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions12, myOptions12[0]);
                if (answer == 0) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 13:
                String[] myOptions13 = {"variables","constants","method","All of avobe"}; 

                answer = JOptionPane.showInternalOptionDialog(null, "What are the features reused using Inheritance\n in Java?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions13, myOptions13[0]);
                if (answer == 3) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
        }
           
    return c; 
    }

        
 }
