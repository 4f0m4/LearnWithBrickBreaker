package projectbb;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameMain {

    public void game(int s) {

        JFrame obj = new JFrame();
        GPlay gameplay = new GPlay();
        gameplay.sel = s;
        //obj.setSize(700, 600);
        obj.setBounds(425, 100, 700, 600);
        obj.setTitle("Learn With Brick Breaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        File file = new File("");
        String projectPath = file.getAbsolutePath();
        // System.out.println(projectPath);
        //ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource(projectPath+"/src/projectbb/icon.png"));

        ImageIcon logo = new ImageIcon(projectPath + "/src/projectbb/icon.png");
        Image log = logo.getImage();
        obj.setIconImage(log);

        obj.add(gameplay);
      //  System.out.println(gameplay.status);
      //  gameplay.setVisible(true);

        //close
//      while(true){
//          try {
//                //System.out.println("Start of delay: " + new Date());
//                 // Delay for 7 seonds
//                Thread.sleep(1000);
//                //  System.out.println("End of delay: " + new Date());
//           } catch (InterruptedException ex) {
//            // ex.printStackTrace();
//          }
//           System.out.println(gameplay.status);
////            System.out.print("");
////            if (!gameplay.status) {
////                System.out.println(gameplay.status);
////                obj.setVisible(false);
////                obj.dispose();
////                break;
////
////            }
////
//       }

    }
//    public static void main(String[] args) {
//        GameMain g = new GameMain();
//        g.game(1);
//    }
}
