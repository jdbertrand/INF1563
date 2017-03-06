package td1;
import java.awt.*;
import java.awt.event.*;

class TestFrame extends Frame {

  public static void main (String [ ] args) {

    Frame monFrame = new TestFrame ();
    monFrame.setSize (400, 300);
    monFrame.setVisible (true);

    // important, mais � ignorer pour le moment
    monFrame.addWindowListener(new WindowAdapter () {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
  public void paint (Graphics g) {
      
          g.setColor(Color.blue);
          g.drawOval(10,20,100,100);

          g.setColor(Color.yellow);
          g.drawOval(60,70,100,100);
      
          g.setColor(Color.black);
          g.drawOval(120,20,100,100);
      
          g.setColor(Color.green);
          g.drawOval(180,70,100,100);
      
          g.setColor(Color.red);
          g.drawOval(230,20,100,100);
      
      }  
}
