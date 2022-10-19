
public class Solution1 {

	public static void main(String[] args) {
		String sentence = "lady lady lady lady was lady lady";
		String word1 = "" + "" + "" + "" + "" + "" + "" + "" + "" + "" + "lady";
		String word2 = "was";

		try {
			System.out.println(answer(word1, word2, sentence));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static int answer(String word1, String word2, String words) throws Exception {
		// check if words contains word1 and word2
		// if not throw an error
		if (!words.contains(word1) || !words.contains(word2)) {
			throw new Exception("word not found");
		}

		// get indices of words 1 and 2
		int index1 = words.indexOf(word1);
		int index2 = words.indexOf(word2);

		if (index1 > index2) { // a | b
			index1 ^= index2; // a^b | b
			index2 ^= index1; // a^b | b^a^b
			index1 ^= index2; // a^b^b^a^b | b^a^b simplifies to b | a
		}

		char[] arr = words.substring(index1, index2).toCharArray();

		int count = 0;
		for (char c : arr) {
			if (c == ' ') {
				count++;
			}
		}

		if (count < 2) {
			return 0;
		}

		return count - 1;
	}

}
