package eggshooter;
public class EggShooter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmWelcome wc = new frmWelcome(); // create new frame frmWelcome
        frmMenu mn = new frmMenu(); // create new frame frmMenu
        wc.setVisible(true); // display frame frmWelcome
        try {
            for (int i = 0; i <= 100; ++i) {
                Thread.sleep(30);
                wc.prgLoading.setString("Loading "+Integer.toString(i)+"%");
                wc.prgLoading.setValue(i);
            }
            wc.setVisible(false); // hide frame frmWelcome
            mn.setVisible(true); // display frame frmMenu
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    
}
