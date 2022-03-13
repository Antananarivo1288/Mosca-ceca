import Model.scacchiera.Scacchiera;
import view.Finestra;

public class App {
    public static void main(String[] args) throws Exception {
        Scacchiera s = new Scacchiera(10, 10);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Finestra(s);
            }
        });
        System.out.println(s.toString());
    }
}
