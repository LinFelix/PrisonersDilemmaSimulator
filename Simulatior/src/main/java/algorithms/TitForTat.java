/**
 * 
 */
package algorithms;

import core.Player;
import core.TableOfPoints;

/**
 * @author Felix Völker
 *
 */
public class TitForTat implements Player {

	/**
	 * 
	 */
	public TitForTat() {
		// TODO Auto-generated constructor stub
	}

	public void setTableOfPoints(TableOfPoints tableOfPoints) {
		// TitForTat does not consider the table of points
		
	}

	public Boolean firstDraw() {
		// starts trustingly
		return Boolean.TRUE;
	}

	public Boolean nextDraw(Boolean EnemiesLastAnswer) {
		// always responses with the others Players most recent reaction
		return Boolean.valueOf(EnemiesLastAnswer.booleanValue());
	}

}
