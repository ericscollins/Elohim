package game;

public enum LetterCoordinate {
	A, B, C, D, E, F, G, H;

	@Override
	public String toString() {
		switch(this) {
		case A:
			return "a";
		case B:
			return "b";
		case C:
			return "c";
		case D:
			return "d";
		case E:
			return "e";
		case F:
			return "f";
		case G:
			return "g";
		case H:
			return "h";
		default:
			return "?";
		}
	}
}
