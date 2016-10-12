package shared;

import game.LetterCoordinate;

public final class Constants {
	private final class AnsiColors {
		public static final String RESET = "\u001B[0m";
		public static final String BLACK_FG = "\u001B[30m";
		public static final String RED_FG = "\u001B[31m";
		public static final String GREEN_FG = "\u001B[32m";
		public static final String YELLOW_FG = "\u001B[33m";
		public static final String BLUE_FG = "\u001B[34m";
		public static final String PURPLE_FG = "\u001B[35m";
		public static final String CYAN_FG = "\u001B[36m";
		public static final String WHITE_FG = "\u001B[37m";
		public static final String BLACK_BG = "\u001B[40m";
		public static final String RED_BG = "\u001B[41m";
		public static final String GREEN_BG = "\u001B[42m";
		public static final String YELLOW_BG = "\u001B[43m";
		public static final String BLUE_BG = "\u001B[44m";
		public static final String PURPLE_BG = "\u001B[45m";
		public static final String CYAN_BG = "\u001B[46m";
		public static final String WHITE_BG = "\u001B[47m";
	}

	final public static int BOARD_SIZE      = 8;
	final public static int BLACK_PAWN_ROW  = 7;
	final public static int BLACK_ROYAL_ROW = 8;
	final public static int WHITE_PAWN_ROW  = 2;
	final public static int WHITE_ROYAL_ROW = 1;

	final public static LetterCoordinate ROOK_COLUMN_1   = LetterCoordinate.A;
	final public static LetterCoordinate ROOK_COLUMN_2   = LetterCoordinate.H;
	final public static LetterCoordinate KNIGHT_COLUMN_1 = LetterCoordinate.B;
	final public static LetterCoordinate KNIGHT_COLUMN_2 = LetterCoordinate.G;
	final public static LetterCoordinate BISHOP_COLUMN_1 = LetterCoordinate.C;
	final public static LetterCoordinate BISHOP_COLUMN_2 = LetterCoordinate.F;
	final public static LetterCoordinate QUEEN_COLUMN    = LetterCoordinate.D;
	final public static LetterCoordinate KING_COLUMN     = LetterCoordinate.E;

	final public static String DARK_SQUARE_COLOR = AnsiColors.PURPLE_BG;
	final public static String LIGHT_SQUARE_COLOR = AnsiColors.RED_BG;
	final public static String DARK_PIECE_COLOR = AnsiColors.BLACK_FG;
	final public static String LIGHT_PIECE_COLOR = AnsiColors.WHITE_FG;
	final public static String RESET_FORMATTING = AnsiColors.RESET;
	final public static String MARGIN_COLORS = AnsiColors.BLACK_BG + AnsiColors.WHITE_FG;
	final public static String BORDER_COLORS = AnsiColors.WHITE_BG + AnsiColors.BLACK_FG;
}
