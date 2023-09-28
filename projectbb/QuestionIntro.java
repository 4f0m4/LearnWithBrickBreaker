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

public class QuestionIntro {

    public int index;

    public int qu() {
        int n, pass;
        // System.out.println(index);
        int a1[] = {0, 1, 2, 3, 4, 5, 6};
        int a2[] = {8, 9, 10, 11, 12, 13, 14};

        Random rand = new Random();
        n = rand.nextInt(2);
        if (n == 1) {
            pass = a1[index];
        } else {
            pass = a2[index];
        }

        int ans, f = 0;

        switch (pass) {

            case 0:
                String[] myOptions = {"   C   ", "   C++   ", "  JAVA  ", "   C#   "};

                ans = JOptionPane.showInternalOptionDialog(null, "Which of The language is an example of oop?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions, myOptions[0]);
                if (ans == 2) {
                    f = 1;
                } else {
                    f = 0;
                }
                break;
            case 1:
                String[] myOptions1 = {"   1    ", "    4   ", "   3  ", "   2    "};

                ans = JOptionPane.showInternalOptionDialog(null, "How many basic concept oop has?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions1, myOptions1[0]);
                if (ans == 1) {
                    f = 1;
                } else {
                    f = 0;
                }
                break;
            case 2:
                String[] myOptions2 = {"class", "object", "method", "attibute"};

                ans = JOptionPane.showInternalOptionDialog(null, "What is the basic unit of Object-Oriented \nProgramming?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions2, myOptions2[0]);
                if (ans == 1) {
                    f = 1;
                } else {
                    f = 0;
                }
                break;
            case 3:
                String[] myOptions3 = {"    1    ", "    2     ", "   3  ", "   4  "};

                ans = JOptionPane.showInternalOptionDialog(null, "How many access modifiers are in java?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions3, myOptions3[0]);
                if (ans == 3) {
                    f = 1;
                } else {
                    f = 0;
                }
                break;
            case 4:
                String[] myOptions4 = {"bind together", "hide", "clear", "implement"};

                ans = JOptionPane.showInternalOptionDialog(null, "What is the main aim of oop is to___data.", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions4, myOptions4[0]);
                if (ans == 0) {
                    f = 1;
                } else {
                    f = 0;
                }
                break;
            case 5:
                String[] myOptions5 = {"    2   ", "   3   ", "   6   ", "   5    "};//ans:c};

                ans = JOptionPane.showInternalOptionDialog(null, "Method Declaration consists of __ components", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions5, myOptions5[0]);
                if (ans == 2) {
                    f = 1;
                } else {
                    f = 0;
                }
                break;
            case 6:
                String[] myOptions6 = {" return type ", "parameter", "method ", "object"}; //ans:a"};

                ans = JOptionPane.showInternalOptionDialog(null, "The data type of the value returned by the method is __", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions6, myOptions6[0]);
                if (ans == 0) {
                    f = 1;
                } else {
                    f = 0;
                }
                break;
            case 7:
                String[] myOptions7 = {" public ", " private ", " protected ", " default "}; //ans:c"}; 

                ans = JOptionPane.showInternalOptionDialog(null, "Among the access modifiers which is the one accessible \nwithin the package and its subclass?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions7, myOptions7[0]);
                if (ans == 2) {
                    f = 1;
                } else {
                    f = 0;
                }
                break;
            case 8:
                String[] myOptions8 = {" class ", " object ", " method ", "identifier"}; //ans:a"}; 

                ans = JOptionPane.showInternalOptionDialog(null, "A user-defined blueprint or prototype from which\n objects are created is called?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions8, myOptions8[0]);
                if (ans == 0) {
                    f = 1;
                } else {
                    f = 0;
                }
                break;
            case 9:
                String[] myOptions9 = {"identifier", "object", "method", "interface"}; //ans:c"};

                ans = JOptionPane.showInternalOptionDialog(null, "A collection of statements that perform some \nspecific task and return the result to the caller is called?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions9, myOptions9[0]);
                if (ans == 2) {
                    f = 1;
                } else {
                    f = 0;
                }
                break;
            case 10:
                String[] myOptions10 = {"hiding", "sending and receiving", "manipulating", "implementing"};//ans:b;

                ans = JOptionPane.showInternalOptionDialog(null, "Objects communicate with one another by__the data?    ", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions10, myOptions10[0]);
                if (ans == 1) {
                    f = 1;
                } else {
                    f = 0;
                }
                break;
            case 11:
                String[] myOptions11 = {"interface", "class", "object", "method"}; //ans:b"

                ans = JOptionPane.showInternalOptionDialog(null, "What represents the set of properties or methods\n that are common to all objects of one type??", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions11, myOptions11[0]);
                if (ans == 1) {
                    f = 1;
                } else {
                    f = 0;
                }
                break;
            case 12:
                String[] myOptions12 = {"State", "Behavior", "Identity", "method"}; //ans:c"}; 

                ans = JOptionPane.showInternalOptionDialog(null, "a unique name given to an object that enables it to\n interact with other objects is called?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions12, myOptions12[0]);
                if (ans == 2) {
                    f = 1;
                } else {
                    f = 0;
                }
                break;
            case 13:
                String[] myOptions13 = {" class ", " object ", " identity ", " method "}; //ans:c"}; 

                ans = JOptionPane.showInternalOptionDialog(null, "Every line of code that runs in Java must be inside\n a __", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions13, myOptions13[0]);
                if (ans == 0) {
                    f = 1;
                } else {
                    f = 0;
                }
                break;
            case 14:
                String[] myOptions14 = {"method", "object ", "constructor ", "class "}; //ans:d"}; 

                ans = JOptionPane.showInternalOptionDialog(null, "The name of the java file must match the __ name", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions14, myOptions14[0]);
                if (ans == 3) {
                    f = 1;
                } else {
                    f = 0;
                }
                break;

        }

        return f;
    }
}

