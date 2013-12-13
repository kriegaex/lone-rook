package de.scrum_master.bdw.chess;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PathChecker {
	private static final Pattern REGEX = Pattern.compile("[A-Za-z]+[(][0-9]+ / [a-h][1-8](-[a-h][1-8])+[)]");

	public static boolean checkSyntax(String path) {
		Matcher matcher = REGEX.matcher(path);
		return matcher.matches();
	}
}
