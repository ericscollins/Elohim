package game;

import shared.Constants;

public class Tile {
	PlayerColor tileColor;
	ChessPiece occupant;
	BoardCoordinate location;

	public Tile(PlayerColor color, BoardCoordinate loc) {
		tileColor = color;
		location = loc;
		occupant = null;
	}

	public PlayerColor getColor() {
		return tileColor;
	}

	public ChessPiece getOccupant() {
		return occupant;
	}

	public void setOccupant(ChessPiece piece) {
		occupant = piece;
	}

	public boolean isOccupied() {
		return (occupant != null);
	}

	public BoardCoordinate getLocation() {
		return location;
	}

	@Override
	public String toString() {
		String bgColor = (tileColor==PlayerColor.BLACK) ? Constants.DARK_SQUARE_COLOR : Constants.LIGHT_SQUARE_COLOR;
		String contents;

		if (isOccupied())
			contents = getOccupant().toString();
		else
			contents = ((tileColor==PlayerColor.BLACK) ? Constants.DARK_PIECE_COLOR : Constants.LIGHT_PIECE_COLOR) + " ";

		return bgColor + contents + Constants.RESET_FORMATTING;
	}
}
