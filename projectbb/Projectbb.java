
package projectbb;









public class Projectbb {
   public static String str;

   

    public static void main(String args[]) {
       Wc wel = new Wc();
       wel.setVisible(true);
         try {
                //System.out.println("Start of delay: " + new Date());
                 // Delay for 7 seonds
                Thread.sleep(5000);
                //  System.out.println("End of delay: " + new Date());
           } catch (InterruptedException ex) {
            // ex.printStackTrace();
          }
     //  wel.setVisible(false);
        Chapter ch = new Chapter();
        ch.main2();
        wel.setVisible(false);
        
    }

}