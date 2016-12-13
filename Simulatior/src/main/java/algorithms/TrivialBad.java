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
public class TrivialBad implements Player {

	/**
	 * 
	 */
	public TrivialBad() {
		// TODO Auto-generated constructor stub
	}

	public void setTableOfPoints(TableOfPoints tableOfPoints) {
		// this method does nothing since TrivalBad does not consider points
	}

	public Boolean firstDraw() {
		// always returns false
		return Boolean.FALSE;
	}

	public Boolean nextDraw(Boolean EnemiesLastAnswer) {
		// always returns false
		return Boolean.FALSE;
	}

}
