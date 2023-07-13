/**
 * 
 */
package main;

/**
 * @author ajwdr
 *
 */
public class Square {

	private String horizontalBoard[] = {"a", "b", "c", "d", "e", "f", "g", "h"};

	private String horizontal;
	private String color;
	private int verticle;
	private boolean hasPiece;
	
	
	public Square(String color, String horizontal, int verticle) {
		if (!color.equals("white") || !color.equals("black")) {
			throw new IllegalArgumentException("illegal color");
		}
		boolean flag = false;
		for (int i = 0; i < horizontalBoard.length; i++) {
			if (horizontal.equals(horizontalBoard[i])) {
				flag = true;
			}
		}
		if (flag == false) {
			throw new IllegalArgumentException("illegal horizontal");
		}
		if (verticle < 1 || verticle > 8) {
			throw new IllegalArgumentException("illegal verticle");
		}
		
		this.color = color;
		this.horizontal = horizontal;
		this.verticle = verticle;
	}
	
	public void setHasPiece(boolean hasPiece) {
		this.hasPiece = hasPiece;
	}
	
	public String getHorizontal() {
		return horizontal;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getVerticle() {
		return verticle;
	}
	
	public boolean getHasPiece() {
		return hasPiece;
	}
	
	
}
