package game;

import shared.Constants;

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

	@Override
	public String toString() {
		return ((color == PlayerColor.BLACK) ? Constants.DARK_PIECE_COLOR : Constants.LIGHT_PIECE_COLOR) + cls.toString() + Constants.RESET_FORMATTING;
	}
}
