import java.util.HashMap;
import java.awt.Color;

public class LineFactory {
	private static final HashMap linesByColor = new HashMap();

	public static Line getLine(Color color) {
		Line line = (Line)linesByColor.get(color);

		if(line == null) {
			line = new Line(color);
			linesByColor.put(color, line);
			System.out.println("Creating " + color + " line");
		}
		return line;
	}
}
