/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbb;



/**
 *
 * @author HP
 */
public class Callq {

  //  public int cho, qset;
    public int ans;

    public int call(int cho,int qset) {
       // System.out.println(qset);
        if (cho == 1) {
            QuestionIntro q = new QuestionIntro();
            q.index = qset;

            ans = q.qu();

        }

        if (cho == 2) {
            QuestionAbstraction q2 = new QuestionAbstraction();
            q2.index = qset;
            ans = q2.newqu();

        }
        if (cho == 3) {
            QuestionEncapsulation q3 = new QuestionEncapsulation();
            q3.index = qset;
            ans = q3.newqu();

        }
        if (cho == 4) {
            QuestionInheritance q4 = new QuestionInheritance();
            q4.index=qset;
            ans = q4.newqu();

        }
        if (cho == 5) {
            QuestionPolymorphism q5 = new QuestionPolymorphism();
            q5.index=qset;
            ans = q5.newqu();
        }
        return ans;
    }
}

