package game;

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
}
