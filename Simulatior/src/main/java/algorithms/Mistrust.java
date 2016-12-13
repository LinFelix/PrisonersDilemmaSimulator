package algorithms;

import core.Player;
import core.TableOfPoints;

public class Mistrust implements Player {

	public Mistrust() {
		// TODO Auto-generated constructor stub
	}

	public void setTableOfPoints(TableOfPoints tableOfPoints) {
		// Mistrust does not consider the table of Points
		
	}

	public Boolean firstDraw() {
		// is mistrusting in the first round
		return Boolean.FALSE;
	}

	public Boolean nextDraw(Boolean EnemiesLastAnswer) {
		// TODO Auto-generated method stub
		return Boolean.valueOf(EnemiesLastAnswer.booleanValue());
	}

}
