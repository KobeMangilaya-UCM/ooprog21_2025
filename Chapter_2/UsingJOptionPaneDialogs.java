import javax.swing.JOptionPane;

public class SimpleDialogApp {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "What’s your name?", "Input", JOptionPane.QUESTION_MESSAGE);

        if (name != null && !name.trim().isEmpty()) {
            int choice = JOptionPane.showConfirmDialog(
                null,
                "Show your name?",
                "Confirmation",
                JOptionPane.YES_NO_OPTION
            );

            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!", "Greeting", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        JOptionPane.showMessageDialog(null, "Goodbye!", "Exit", JOptionPane.INFORMATION_MESSAGE);
    }
}
