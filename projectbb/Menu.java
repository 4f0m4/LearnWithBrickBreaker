/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbb;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {
    public int ans;

    public void menu(int f) {
        
     
        text t = new text();
        t.set=f;
        String str = "";
       
        
       
        if (f == 1) {
           

            try {
                File file = new File("C:/Users/HP/Documents/projectbb/src/projectbb/intro.txt");
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    str += ("\n\n" + sc.nextLine());
                    // t.text1(str);
                }
                t.text1(str);
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }

        } else if (f == 2) {
          
            try {
                File file = new File("C:/Users/HP/Documents/projectbb/src/projectbb/abstraction.txt");
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    str += ("\n\n" + sc.nextLine());
                    // t.text1(str);
                }
                t.text1(str);
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
        } else if (f == 3) {
             try {
                File file = new File("C:/Users/HP/Documents/projectbb/src/projectbb/encp.txt");
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    str += ("\n\n" + sc.nextLine());
                    // t.text1(str);
                }
                t.text1(str);
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
           
        } else if (f == 4) {
            
            try {
                File file = new File("C:/Users/HP/Documents/projectbb/src/projectbb/inheritance.txt");
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    str += ("\n\n" + sc.nextLine());
                    // t.text1(str);
                }
                t.text1(str);
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
        } else if (f == 5) {
            try {
                File file = new File("C:/Users/HP/Documents/projectbb/src/projectbb/polymorphismtext.txt");
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    str += ("\n\n" + sc.nextLine());
                    // t.text1(str);
                }
                t.text1(str);
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
        } else {
            System.exit(0);
        }
    }
}

