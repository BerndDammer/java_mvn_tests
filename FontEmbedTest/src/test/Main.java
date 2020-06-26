package test;

import java.net.URL;

import javafx.scene.text.Font;

public class Main {

	public static void main(String[] args) {
		Font fontAwesome20 = loadFont("fa-brands-400.ttf");
		System.out.println(fontAwesome20.getName());
		//fontAwesome20.
	}

	static Font loadFont(String name) {
		URL url = Main.class.getResource(name);
		String s = url.toExternalForm();
		System.out.println("before");
		Font result = Font.loadFont(s, 20);
		System.out.println("after");
		return result;
	}
}
