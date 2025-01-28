package playWithList;

import java.util.List;

public class playList {
	public static void main(String[] args) {
		List<String> words = List.of("Dang Nhat Minh");
		System.out.println(words.isEmpty());
		System.out.println(words.size());
		System.out.println(words.isEmpty());
		System.out.println(words.contains("Huynh Thao Linh"));
		System.out.println(words.indexOf("Dang Nhat Minh"));
	}
}
	