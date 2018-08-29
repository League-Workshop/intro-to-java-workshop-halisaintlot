package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String answer = JOptionPane.showInputDialog(null, "What is 100+100?");
		// 3. Use an if statement to check if their answer is correct
		if (answer.equals("200")) {
			// 4. if the user's answer is correct
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Correct");
		}
		// -- add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.

		String answer2 = JOptionPane.showInputDialog(null, "How many seconds are in a minute?");
		if (answer2.equals("60")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Correct");
		}
		// 6. After all the questions have been asked, print the user's score
		JOptionPane.showMessageDialog(null, "Your score is "+score);
	}
}
