package com.gradescope.hw5;
import java.util.Arrays;

public class Image {
	
	private char[][] image;
	private int height;
	private int width;

	static char[][] smiley = {
		{' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' '},
		{'*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*'},
		{'*', ' ', ' ', '^', ' ', ' ', ' ', '^', ' ', ' ', '*'},
		{'*', ' ', ' ', ' ', ' ', 'N', ' ', ' ', ' ', ' ', '*'},
		{'*', ' ', '\\',' ', ' ', ' ', ' ', ' ', '/', ' ', '*'},
		{'*', ' ', ' ', '-', '-', '-', '-', '-', ' ', ' ', '*'},
		{'*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*'},
		{' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' '}		
	};
	
	public Image(char[][] contents) {
		image = contents;
		
		// always assume the array is at least of size 1x1
		height = image.length;
		width = image[0].length;
	}
	// Rotates image 90 degrees Clockwise
    public Image rotateRight() {
    	char[][] rotated = new char[width][height];
		for (int i = 0; i < height; i++){
			for (int j = 0; j < width; j++){
				rotated[j][height - 1 - i] = image[i][j];
			}
		}
		return new Image(rotated);
	}

	// flips image on its vertical line of symmetry
    public Image flipVertical() {
    	char[][] flippedVert = new char[height][width];
		for (int i = 0; i < height; i++){
			flippedVert[height - 1 - i] = image[i];
		}
		return new Image(flippedVert);
    }

	// flips image alone the diagnoal line from top left to bottom right
    public Image flipDiagonal() {
    	char[][] flippedDiag = new char[height][width];
		for (int i = 0; i < height; i++){
			for (int j = 0; j < height; j++){
				flippedDiag[j][i] = image[i][j];
			}
		}
		return new Image(flippedDiag);
    }

	// prints the smiley face
    public void printImage() {
    	System.out.println(smiley[0]);
		System.out.println(smiley[1]);
		System.out.println(smiley[2]);
		System.out.println(smiley[3]);
		System.out.println(smiley[4]);
		System.out.println(smiley[5]);
		System.out.println(smiley[6]);
		System.out.println(smiley[7]);

    }
    
	// checks if two images are equal
    public boolean equals(Image other) {
    	if (this.width != other.width && this.height != other.height) {
			return false;
		}
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++)
            	if (this.image[i][j] != other.image[i][j]){
                return false;
			}
		}
		return true;
    }

    public static void main (String [] args) {
		System.out.println("CS60 Face");
		Image face = new Image(smiley);
		face.printImage();

		System.out.println("\nUpside Down");
		face = new Image(smiley).flipVertical();
		face.printImage();

		System.out.println("\nFlip Diagonal");
		face = new Image(smiley).flipDiagonal();
		face.printImage();

		System.out.println("\nRotate Right");
		face = new Image(smiley).rotateRight();
		face.printImage();
    }
}