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

public class QuestionAbstraction {

    public int index;

    public int newqu() {
        int n, pass;
        //System.out.println(index);
        int a1[] = {0, 1, 2, 3, 4, 5, 6};
        int a2[] = {8, 9, 10, 11, 12, 13, 14};

        Random rand = new Random();
        n = rand.nextInt(2);
        if (n == 1) {
            pass = a1[index];
        } else {
            pass = a2[index];
        }
        int c = 0, answer;
        switch (pass) {

            case 0:
                String[] myOptions0 = {"       Object     ", "      Logical          ", "      Real      ", "       Hypothetical  "};

                answer = JOptionPane.showInternalOptionDialog(null, " object is ___abstraction.", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions0, myOptions0[0]);
                if (answer == 2) {
                    c = 1;
                } else {
                    c = 0;
                }

                break;
            case 1:
                String[] myOptions1 = {"       Object     ", "      Logical          ", "      Real      ", "       Hypothetical      "};

                answer = JOptionPane.showInternalOptionDialog(null, "  class is ___abstraction.   ", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions1, myOptions1[0]);
                if (answer == 1) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 2:
                String[] myOptions2 = {"class usages", "program comlexity", "idealized interface", "unstable interface"};

                answer = JOptionPane.showInternalOptionDialog(null, "Abstraction gives higher degree of___", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions2, myOptions2[0]);
                if (answer == 2) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 3:
                String[] myOptions3 = {"   control and dara    ", "    only data   ", "     only data      ", "    classes     "};

                answer = JOptionPane.showInternalOptionDialog(null, "Abstraction can apply to", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions3, myOptions3[0]);
                if (answer == 0) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 4:
                String[] myOptions4 = {"    Class   ", "   Object  ", "   Inheritance   ", "    Interfaces     "};

                answer = JOptionPane.showInternalOptionDialog(null, "Which among the following can be viewed as combination\n of abstraction of data and code?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions4, myOptions4[0]);
                if (answer == 1) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 5:
                String[] myOptions5 = {"True", "False"};

                answer = JOptionPane.showInternalOptionDialog(null, "Higher the level of abstraction,higher are the details.", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions5, myOptions5[0]);
                if (answer == 1) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 6:
                String[] myOptions6 = {"Logical level", "Physical level", "View level", "External level"};

                answer = JOptionPane.showInternalOptionDialog(null, "Which among the following is not a level of \nabstraction?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions6, myOptions6[0]);
                if (answer == 3) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 7:
                String[] myOptions7 = {"get unsafe", "reduce readability", "be safer", "increase vulnerability"};

                answer = JOptionPane.showInternalOptionDialog(null, "Using higher degree of abstraction may _____ ", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions7, myOptions7[0]);
                if (answer == 2) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 8:
                String[] myOptions8 = {"    abst    ", "    Abstract   ", "   abstract   ", "   abstract class   "};
                answer = JOptionPane.showInternalOptionDialog(null, "Which of these keywords are used to define an \nabstract class?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions8, myOptions8[0]);
                if (answer == 2) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 9:
                String[] myOptions9 = {"    Thread     ", "    AbstractList    ", "     List    ", "    None   "};
                answer = JOptionPane.showInternalOptionDialog(null, "Which of these is not abstract?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions9, myOptions9[0]);
                if (answer == 0) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 10:
                String[] myOptions10 = {"  Abstract  ", " Simple class ", "   Static class   ", "  None  "};
                answer = JOptionPane.showInternalOptionDialog(null, "If a class inheriting an abstract class doesnot define \nall of its functionthen it will be known as?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions10, myOptions10[0]);
                if (answer == 0) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 11:
                String[] myOptions11 = {"  java.lang   ", "   java.util    ", "   java.io   ", "    None    "};
                answer = JOptionPane.showInternalOptionDialog(null, "Which of these packages contains abstract keyword?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions11, myOptions11[0]);
                if (answer == 0) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 12:
                String[] myOptions12 = {"  current   ", "  parent   ", "  a different  ", "  None   "};
                answer = JOptionPane.showInternalOptionDialog(null, "The purpose of \'this\' keyword is to refer___(class) ", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions12, myOptions12[0]);
                if (answer == 0) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 13:
                String[] myOptions13 = {"  current   ", "  parent   ", "  a different  ", "  None   "};
                answer = JOptionPane.showInternalOptionDialog(null, "The purpose of \'super\' keyword is to refer___(class) ", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions13, myOptions13[0]);
                if (answer == 1) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 14:
                String[] myOptions14 = {"  objects  ", "  packages  ", "  Interfaces  ", "  None   "};
                answer = JOptionPane.showInternalOptionDialog(null, "Which of these can be used to fully abstract a class from\n its implementation?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions14, myOptions14[0]);
                if (answer == 2) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
        }

        return c;
    }

}

