package com.gradescope.hw5;
import static org.junit.Assert.*;
import org.junit.Test;

public class ImageTest {

	@Test
	public void rotateRight1() {
		char[][] original = {{'1', '2'}, {'3', '4'}};
		char[][] expected = {{'3', '1'}, {'4', '2'}};
		
		Image orig = new Image(original);
		Image exp = new Image(expected);
		
		Image result = orig.rotateRight();
		
		assertTrue(exp.equals(result));
	}
	
	@Test
	public void rotateRight2() {
		char[][] original = {{'1', '2', '3'}, {'4', '5', '6'}};
		char[][] expected = {{'4', '1'}, {'5', '2'}, {'6', '3'}};
		
		Image orig = new Image(original);
		Image exp = new Image(expected);
		
		Image result = orig.rotateRight();
		
		assertTrue(exp.equals(result));
	}

	
	@Test
	public void rotateRight3() {
		char[][] original = {{'1', '2'}, {'3', '4'}, {'5', '6'}};
		char[][] expected = {{'5', '3', '1'}, {'6', '4', '2'}};
		
		Image orig = new Image(original);
		Image exp = new Image(expected);
		
		Image result = orig.rotateRight();
		
		assertTrue(exp.equals(result));
	}
	
	@Test
	public void flipVertical1() {
		char[][] original = {{'1', '2'}, {'3', '4'}};
		char[][] expected = {{'3', '4'}, {'1', '2'}};
		
		Image orig = new Image(original);
		Image exp = new Image(expected);
		
		Image result = orig.flipVertical();
		
		assertTrue(exp.equals(result));
	}
	
	@Test
	public void flipVertical2() {
		char[][] original = {{'1', '2'}, {'3', '4'}, {'5', '6'}};
		char[][] expected = {{'5', '6'}, {'3', '4'}, {'1', '2'}};
		
		Image orig = new Image(original);
		Image exp = new Image(expected);
		
		Image result = orig.flipVertical();
		
		assertTrue(exp.equals(result));
	}
	
	@Test
	public void flipDiagonal() {
		char[][] original = {{'1', '2'}, {'3', '4'}};
		char[][] expected = {{'1', '3'}, {'2', '4'}};
		
		Image orig = new Image(original);
		Image exp = new Image(expected);
		
		Image result = orig.flipDiagonal();
		
		assertTrue(exp.equals(result));
	}
	
}