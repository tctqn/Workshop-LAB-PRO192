package controller;

public class Normalization {
	public static String nameNormalize(String name) {
		String[] words = name.toLowerCase().split("\\s+");
		StringBuilder builder = new StringBuilder();
		for(String item:words) {
			char[] characters = item.toCharArray();
			characters[0] = Character.toUpperCase(characters[0]);
			builder.append(new String(characters));
			builder.append(" ");
		}
		return builder.toString().trim();
	}
	
	public static String idNormalize(String id) {
		return id.toUpperCase() ;
	}
}
