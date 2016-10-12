package game;

public enum PieceClass {
	PAWN, ROOK, KNIGHT, BISHOP, KING, QUEEN;

	@Override
	public String toString() {
		switch(this) {
		case PAWN:
			return "p";
		case ROOK:
			return "R";
		case KNIGHT:
			return "N";
		case BISHOP:
			return "B";
		case KING:
			return "K";
		case QUEEN:
			return "Q";
		default:
			return "?";
		}
	}
}
