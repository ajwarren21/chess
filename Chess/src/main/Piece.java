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
	
	public Piece(int playerNumber, int verticle, String horizontal) {
		this.playerNumber = playerNumber;
		setColor();
		alive = true;
		setSquare(verticle, horizontal);
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
		Square square = new Square(color, horizontal, verticle);
		position = square;
	}
	
	public void die() {
		alive = false;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getPlayerNumber() {
		return playerNumber;
	}
	
	public Square getPosition() {
		return position;
	}
	
	public boolean getAlive() {
		return alive;
	}
}
