
import javax.swing.JDialog;
import javax.swing.JLabel;

class LoadingScreen extends JDialog {
    public LoadingScreen() {
        setSize(200, 200);
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setModal(true);

        JLabel loadingLabel = new JLabel("Loading...", JLabel.CENTER);
        add(loadingLabel);
    }
}

