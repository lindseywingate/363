package airplane_radar;

import javax.swing.*;//lightweight components that work on same platforms

public class radar {
	private static void GUI() {
		JFrame window = new JFrame("radar");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel text = new JLabel("Testing :)");
		window.getContentPane().add(text);

		window.pack();
		window.setVisible(true);

	}
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GUI();
			}
		});
	}
}
