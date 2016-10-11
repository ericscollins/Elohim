package game;

public class BoardCoordinate {
	private LetterCoordinate horizontalComponent;
	private Integer verticalComponent;

	public BoardCoordinate(LetterCoordinate horiz, Integer vert) {
		horizontalComponent = horiz;
		verticalComponent = vert;
	}

	public LetterCoordinate getHorizontalComponent() {
		return horizontalComponent;
	}

	public Integer getVerticalComponent() {
		return verticalComponent;
	}
}
