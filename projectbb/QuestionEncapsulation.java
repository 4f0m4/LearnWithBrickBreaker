
package projectbb;



import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

import java.util.Random;
import javax.swing.JOptionPane;

public class QuestionEncapsulation {

    public int index;

    public int newqu() {
        int n, pass;
        //System.out.println(index);
        int a1[] = {0, 8, 1, 2, 9, 3, 13};
        int a2[] = {7, 9, 4, 10, 5, 11, 12, 6};

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
                String[] myOptions = {"Inheritance", "Abstraction", "Polymorphism", "Overloading"};

                answer = JOptionPane.showInternalOptionDialog(null, "Which feature can be implemented using encapsulation?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions, myOptions[0]);
                if (answer == 1) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 1:
                String[] myOptions1 = {"Mutable", "Abstract", "Wrapper", "Immutable"};

                answer = JOptionPane.showInternalOptionDialog(null, "Encapsulation helps in writing __ classes in java.", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions1, myOptions1[0]);
                if (answer == 3) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 2:
                String[] myOptions2 = {"Access Specifiers", "Polymorphism", "Abstraction", "Inheritance"};

                answer = JOptionPane.showInternalOptionDialog(null, "Encapsulation be achieved using ___", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions2, myOptions2[0]);
                if (answer == 0) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 3:
                String[] myOptions3 = {"  Local   ", "  Global   ", "  Public   ", "  Array   "};

                answer = JOptionPane.showInternalOptionDialog(null, "Which types of variable among the following violates\n the principle of encapsulation almost always?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions3, myOptions3[0]);
                if (answer == 1) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 4:
                String[] myOptions4 = {"Not ensured", "Ensured", "Very low", " None "};

                answer = JOptionPane.showInternalOptionDialog(null, "Using encapsulation data security is _____", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions4, myOptions4[0]);
                if (answer == 1) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 5:
                String[] myOptions5 = {"data hiding", "low coupling", "high cohesion", "All"};//ans:d};

                answer = JOptionPane.showInternalOptionDialog(null, "Encapsulation helps in ____", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions5, myOptions5[0]);
                if (answer == 3) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 6:
                String[] myOptions6 = {"Abstraction", "Encapsulation", "Inheritance", "Composition"};

                answer = JOptionPane.showInternalOptionDialog(null, "Hiding the complexity is known as ___", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions6, myOptions6[0]);
                if (answer == 1) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 7:
                String[] myOptions7 = {" object ", " class ", " method ", "all of the mentioned"};

                answer = JOptionPane.showInternalOptionDialog(null, "What is ‘Basis of Encapsulation’?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions7, myOptions7[0]);
                if (answer == 3) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 8:
                String[] myOptions8 = {" public & private ", " protected ", " all ", " none"};

                answer = JOptionPane.showInternalOptionDialog(null, "Which access modifiers can be used to \nimplement encapsulation?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions8, myOptions8[0]);
                if (answer == 0) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 9:
                String[] myOptions9 = {" public ", " private ", " protected ", "Internal"};

                answer = JOptionPane.showInternalOptionDialog(null, "Which of the following access modifiers allows \naccess to class members only within the class itself?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions9, myOptions9[0]);
                if (answer == 1) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 10:
                String[] myOptions10 = {" public ", " private ", " protected ", " default "};

                answer = JOptionPane.showInternalOptionDialog(null, "Which access modifier can be used to declare a\nclass member as visible only within the same package?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions10, myOptions10[0]);
                if (answer == 3) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;

            case 11:
                String[] myOptions11 = {" public ", " private ", " protected ", " default "};

                answer = JOptionPane.showInternalOptionDialog(null, "Which of the following access modifiers allows\n access to class members within the same \npackage and its subclasses?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions11, myOptions11[0]);
                if (answer == 2) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 12:
                String[] myOptions12 = {"protected", "private", "public", " all of them "};

                answer = JOptionPane.showInternalOptionDialog(null, "Which type of members can’t be accessed in derived\n classes of a base class?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions12, myOptions12[0]);
                if (answer == 1) {
                    c = 1;
                } else {
                    c = 0;
                }
                break;
            case 13:
                String[] myOptions13 = {"protected", "private", "public", " any of them "};

                answer = JOptionPane.showInternalOptionDialog(null, "In which access should a constructor be defined,\n so that object of the class can be created in any \nfunction?", "Answer to increase score", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions13, myOptions13[0]);
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

