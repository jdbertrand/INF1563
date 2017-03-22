package td7;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VolumeSphere extends JFrame implements ActionListener {

  private static final long serialVersionUID = 1L;

  @Override
  public void actionPerformed(ActionEvent e) {}

  @SuppressWarnings("static-access")
  public void creerGUI(){
    JFrame jf = new JFrame("Calculer le volume d'une sphère");
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container cp = jf.getContentPane();
    cp.setLayout(new BoxLayout(cp, BoxLayout.Y_AXIS));

    JLabel rayonLab = new JLabel("Entrer le rayon");
    rayonLab.setAlignmentX(cp.CENTER_ALIGNMENT);
    cp.add(rayonLab);

    JTextField rayonTF = new JTextField(15);
    //rayonTF.setMaximumSize( rayonTF.getPreferredSize() );
    cp.add(rayonTF);

    JLabel volumeLab = new JLabel("Volume");
    volumeLab.setAlignmentX(cp.CENTER_ALIGNMENT);
    cp.add(volumeLab);

    JTextField volumeTF = new JTextField(15);
    volumeTF.setMaximumSize( volumeTF.getPreferredSize() );
    cp.add(volumeTF);

    JButton button = new JButton("Calculer le volume");
    button.setAlignmentX(cp.CENTER_ALIGNMENT);
    cp.add(button);
    button.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e) {
        String rayonTxt = rayonTF.getText();
        double rayon = Integer.parseInt(rayonTxt);
        volumeTF.setText(volume(rayon) + "");
      }

	private String volume(double rayon) {
		// TODO Auto-generated method stub
		return null;
	}
    });

    jf.setSize(330, 160);
    jf.setVisible(true);

  }

  public static void main(String[] a) {
    VolumeSphere vs = new VolumeSphere();
    vs.creerGUI();
  }

  // ???

}
