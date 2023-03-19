package com.abstractArt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Museum {
	public static void main(String[] args) {
		List<Art> museum = new ArrayList<>();
		museum.add(new Painting("Sunflower", "Van Gogh", "Dramatical", "Oil"));
		museum.add(new Painting("Relativity", "M. C. Escher", "Amazing", "Woodcut"));
		museum.add(new Painting("The Scream", "Edvard Munch", "Stunning", "Oil"));
		museum.add(new Sculpture("The Thinker", "Rodin", "Imaginary", "Marble"));
		museum.add(new Sculpture("David", "Michaelangelo", "Great Balance", "Marble"));
		
		Collections.shuffle(museum);
		
		museum.forEach(art -> art.viewArt());
	}
}
