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
public class TrivialGood implements Player {

	/**
	 * 
	 */
	public TrivialGood() {
		// TODO Auto-generated constructor stub
	}

	public void setTableOfPoints(TableOfPoints tableOfPoints) {
		// this method does nothing since TrivalGood does not consider points
	}

	public Boolean firstDraw() {
		// always returns true
		return Boolean.TRUE;
	}

	public Boolean nextDraw(Boolean EnemiesLastAnswer) {
		// always returns true
		return Boolean.TRUE;
	}

}
