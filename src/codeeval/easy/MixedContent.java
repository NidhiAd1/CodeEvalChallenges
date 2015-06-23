/* CodeEval challenge -Easy Program 
 * Separate words and digits from the input  */

package codeeval.easy;

import java.io.*;
import java.util.ArrayList;

public class MixedContent {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		try {

			BufferedReader bf = new BufferedReader(new FileReader(file));
			String line;

			while ((line = bf.readLine()) != null) {
				ArrayList<String> words = new ArrayList<String>();
				ArrayList<Integer> digits = new ArrayList<Integer>();
				String[] arrayOfWords = null;
				line = line.trim();

				arrayOfWords = line.split(",");

				// System.out.println("Line : "+line);

				for (int i = 0; i < arrayOfWords.length; i++) {

					if (arrayOfWords[i].matches(".*[A-Za-z].*")) {
						// System.out.print(arrayOfWords[i]+',');
						words.add(arrayOfWords[i]);

					} else {
						digits.add(Integer.parseInt(arrayOfWords[i]));

					}

				}

				int numOfWords = words.size();

				for (int a = 0; a < numOfWords; a++) {
					System.out.print(words.get(a));
					if (a < (numOfWords - 1))
						System.out.print(',');

				}

				int numOfDigits = digits.size();
				if (numOfWords > 0 && numOfDigits > 0)
				  System.out.print('|');

				for (int b = 0; b < numOfDigits; b++) {
					System.out.print(digits.get(b));
					if (b < numOfDigits - 1)
						System.out.print(',');
				}

				System.out.println();

			}

			bf.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}
}