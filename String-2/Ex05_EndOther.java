
public class Ex05_EndOther
{
	// Given two strings, return true if either of the strings appears at the very end of the other string, ignoring
	// upper/lower case differences (in other words, the computation should not be "case sensitive"). Note:
	// str.toLowerCase() returns the lowercase version of a string.
	public boolean endOther(String a, String b)
	{
		a = a.toLowerCase();
		b = b.toLowerCase();
		if (a.length() < b.length())
			return b.substring(b.length() - a.length()).equals(a);
		else if (b.length() < a.length())
			return a.substring(a.length() - b.length()).equals(b);
		return a.equals(b);
	}
}
