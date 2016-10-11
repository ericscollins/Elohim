package game;

public class ChessPiece {
	PieceClass cls;
	PlayerColor color;
	BoardCoordinate location;

	public ChessPiece(PieceClass cls, PlayerColor color, BoardCoordinate location) {
		this.cls = cls;
		this.color = color;
		this.location = location;
	}

	public PieceClass getPieceClass() {
		return cls;
	}

	public PlayerColor getColor() {
		return color;
	}

	public BoardCoordinate getLocation() {
		return location;
	}

	public void setLocation(BoardCoordinate location) {
		this.location = location;
	}
}
