/**
 * 
 */
package main;

/**
 * @author ajwdr
 *
 */
public abstract class Piece {
	
	private String color;
	private boolean alive;
	private int playerNumber;
	private Square position;
	
	public Piece(int playerNumber) {
		this.playerNumber = playerNumber;
		setColor();
		alive = true;
		setSquare();
	}
	
	
	private void setColor() {
		if (playerNumber == 1) {
			color = "white";
		}
		else {
			color = "black";
		}
	}
	
	private void setSquare(int verticle, String horizontal) {
		Square = new Square(verticle, horizontal);
	}
	
	private void die() {
		alive = false;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getPlayerNumber() {
		return playerNumber;
	}
}
