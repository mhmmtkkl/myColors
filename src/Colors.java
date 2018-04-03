package src;


import java.util.ArrayList;

public class Colors {
	private ArrayList<String> colorsList = new ArrayList<String>();
	
	public Colors (ArrayList<String> colors) {
		if(colors!= null)
		this.colorsList = colors;
	}

	public ArrayList<String> getColorsList() {
		return colorsList;
	}

	public void setColorsList(ArrayList<String> colorsList) {
		this.colorsList = colorsList;
	}
	
	public void addColor(String color) {
		getColorsList().add(color);
	}
	
	public void addColors(ArrayList<String> colors) {
		setColorsList(colors);
	}
	
	public ArrayList<String> changeSecondToOrange() {
		ArrayList<String> newColorsList = new ArrayList<String>();
		newColorsList = colorsList;
		
			for (int i=1; i<colorsList.size(); i+=2) {
				newColorsList.set(i, "Orange");
			}
	
		return newColorsList;
	}
	
	public int findColor(String color) {
		int index=-1;
		for (int i=0; i<colorsList.size(); i++) {
			if (colorsList.get(i).equals(color)) {
				index = i;
			}
		}
		return index;
	}
	
	public int getColorCount(String color) {
		int count = 0;
		for (int i=0; i<colorsList.size(); i++) {
			if (colorsList.get(i).equals(color)) {
				count++;
			}
		}
		return count;
	}
	
	public void removeDuplicates() {
		for (int i=0; i<colorsList.size(); i++) {
			for (int k=0; k<colorsList.size(); k++) {
				if (colorsList.get(i).equals(colorsList.get(k))) {
					colorsList.remove(i);
					k++;
				}
			}
		}
	}
	
	public boolean replaceColor(String color1, String replacementColor) {
		boolean colorReplaced = false;
		int indexForReplacement;
		for (int i=0;i<colorsList.size();i++) {
			if(colorsList.get(i).equals(color1)) {
				indexForReplacement = i;
				colorsList.remove(i);
				colorsList.add(indexForReplacement, replacementColor);
				colorReplaced = true;
			}
		}
		return colorReplaced;
		
	}

}
