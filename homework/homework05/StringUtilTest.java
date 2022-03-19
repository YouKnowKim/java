package homework05;

public class StringUtilTest {

	public static void main(String[] args) {
		
		StringUtil stringUtil = new StringUtil();
		
		System.out.println(stringUtil.isUpperCase('a'));
		System.out.println(stringUtil.isLowerCase('a'));
		System.out.println(stringUtil.max(4, 10));
		System.out.println(stringUtil.min(4, 10));
		
		
		System.out.println(stringUtil.reverseString("hello asdf  sdf "
				+ "afd"));
		
		System.out.println(stringUtil.toUpperString("DJFDFJ alsdfknlk @#$@#"));
		
		System.out.println(stringUtil.toLowerString("DJFDFJ alsdfknlk @#$@#"));
		
	}
}
