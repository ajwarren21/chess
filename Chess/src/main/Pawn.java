/**
 * 
 */
package main;

import java.util.ArrayList;

/**
 * @author ajwdr
 *
 */
public class Pawn extends Piece {
	
	private Square position = getPosition();
	
	public ArrayList<Square> seen = new ArrayList<Square>();
	
	
	public Pawn(int playerNumber, int verticle, String horizontal) {
		super(playerNumber, verticle, horizontal);
	}
	
	private void move(Square position) {
		
		//create main method first
		while (true) {
			
		}
	}


}
