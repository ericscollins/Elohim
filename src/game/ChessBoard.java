package game;

import java.util.HashMap;

import shared.Constants;

public class ChessBoard {
	HashMap<LetterCoordinate, HashMap<Integer, Tile>> board;

	public ChessBoard() {
		board = new HashMap<LetterCoordinate, HashMap<Integer, Tile>>();

		PlayerColor currentColor = PlayerColor.WHITE;
		for (LetterCoordinate lc : LetterCoordinate.values()) {
			board.put(lc, new HashMap<Integer, Tile>());

			for (Integer i=1; i <= Constants.BOARD_SIZE; i++) {
				board.get(lc).put(i, new Tile(currentColor, new BoardCoordinate(lc, i)));
				currentColor = (currentColor == PlayerColor.BLACK) ? PlayerColor.WHITE : PlayerColor.BLACK;
			}
			currentColor = (currentColor == PlayerColor.BLACK) ? PlayerColor.WHITE : PlayerColor.BLACK;

		}

		setPieces();
	}

	private void setPieces() {
		for (PlayerColor color : PlayerColor.values()) {
			for (PieceClass cls : PieceClass.values()) {
				int targetRow = (cls == PieceClass.PAWN) ?
						(color == PlayerColor.BLACK) ? Constants.BLACK_PAWN_ROW  : Constants.WHITE_PAWN_ROW :
							(color == PlayerColor.BLACK) ? Constants.BLACK_ROYAL_ROW : Constants.WHITE_ROYAL_ROW;
				switch(cls) {
				case PAWN:
					for (LetterCoordinate lc : LetterCoordinate.values()) {
						board.get(lc).get(targetRow).setOccupant(new ChessPiece(cls, color, new BoardCoordinate(lc, targetRow)));
					}
					break;
				case ROOK:
					board.get(Constants.ROOK_COLUMN_1).get(targetRow).setOccupant(new ChessPiece(cls, color, new BoardCoordinate(Constants.ROOK_COLUMN_1, targetRow)));
					board.get(Constants.ROOK_COLUMN_2).get(targetRow).setOccupant(new ChessPiece(cls, color, new BoardCoordinate(Constants.ROOK_COLUMN_2, targetRow)));
					break;
				case KNIGHT:
					board.get(Constants.KNIGHT_COLUMN_1).get(targetRow).setOccupant(new ChessPiece(cls, color, new BoardCoordinate(Constants.KNIGHT_COLUMN_1, targetRow)));
					board.get(Constants.KNIGHT_COLUMN_2).get(targetRow).setOccupant(new ChessPiece(cls, color, new BoardCoordinate(Constants.KNIGHT_COLUMN_2, targetRow)));
					break;
				case BISHOP:
					board.get(Constants.BISHOP_COLUMN_1).get(targetRow).setOccupant(new ChessPiece(cls, color, new BoardCoordinate(Constants.BISHOP_COLUMN_1, targetRow)));
					board.get(Constants.BISHOP_COLUMN_2).get(targetRow).setOccupant(new ChessPiece(cls, color, new BoardCoordinate(Constants.BISHOP_COLUMN_2, targetRow)));
					break;
				case QUEEN:
					board.get(Constants.QUEEN_COLUMN).get(targetRow).setOccupant(new ChessPiece(cls, color, new BoardCoordinate(Constants.QUEEN_COLUMN, targetRow)));
					break;
				case KING:
					board.get(Constants.KING_COLUMN).get(targetRow).setOccupant(new ChessPiece(cls, color, new BoardCoordinate(Constants.KING_COLUMN, targetRow)));
					break;
				}
			}
		}
	}

	@Override
	public String toString() {
		String result = "";
		// Top label
		result += Constants.MARGIN_COLORS + "  abcdefgh  " + Constants.RESET_FORMATTING +"\n";
		// Top Border
		result += Constants.MARGIN_COLORS + " " + Constants.BORDER_COLORS + "+--------+" + Constants.MARGIN_COLORS + " " + Constants.RESET_FORMATTING + "\n";

		for (int i=1; i <= Constants.BOARD_SIZE; i++) {
			// Left label
			result += Constants.MARGIN_COLORS + i;
			// Left Border
			result += Constants.BORDER_COLORS + "|";

			// Tiles & pieces
			for(LetterCoordinate lc : LetterCoordinate.values()) {
				result += board.get(lc).get(i).toString();
			}

			// Right Border
			result += Constants.BORDER_COLORS + "|";
			// Right label
			result += Constants.MARGIN_COLORS + i + Constants.RESET_FORMATTING + "\n";
		}

		// Bottom border
		result += Constants.MARGIN_COLORS + " " + Constants.BORDER_COLORS + "+--------+" + Constants.MARGIN_COLORS + " " + Constants.RESET_FORMATTING + "\n";
		// Bottom label
		result += Constants.MARGIN_COLORS + "  abcdefgh  " + Constants.RESET_FORMATTING + "\n";

		return result;
	}
}
