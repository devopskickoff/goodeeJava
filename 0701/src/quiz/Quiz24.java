package quiz;

public class Quiz24 {

	public static void main(String[] args) {
		int count = 0;
		String s = "She is the 2010 Olympic champion in Ladies' Singles, the 2009 World champion, the 2009 Four Continents champion, a three-time (2006–2007, 2007–2008, 2009–2010) Grand Prix Final champion, the 2006 World Junior champion, the 2005–2006 Junior Grand Prix Final champion, and a four-time (2002–2005) South Korean national champion.";
		for(int i = 0; i < s.length();i++) {
			if(s.charAt(i)==32||s.charAt(i)==44||s.charAt(i)==46){
				if(s.charAt(i-1)!=32&&s.charAt(i-1)!=44&&s.charAt(i-1)!=46) {
					System.out.println(s.charAt(i));
					count++;
				}
			}else {
				System.out.print(s.charAt(i));
			}
		}
		System.out.printf("단어의개수는 %d개",count);
	}

}
