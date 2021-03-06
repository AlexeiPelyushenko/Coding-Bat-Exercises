
public class Ex20_PlusOut
{
	// Given a string and a non-empty word string, return a version of the original String where all chars have been
	// replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.
	public String plusOut(String str, String word)
	{
		String result = "";
		int i;
		for (i = 0; i <= str.length() - word.length(); i++)
		{
			if (str.substring(i, i + word.length()).equals(word))
			{
				result += word;
				i += word.length() - 1;
			}
			else
				result += "+";
		}
		return result + str.substring(i).replaceAll(".", "+");
	}
}
