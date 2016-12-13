/**
 * 
 */
package core;

/**
 * @author Felix Völker
 *
 */
public interface Player {
	
	void setTableOfPoints(TableOfPoints tableOfPoints);	
	
	Boolean firstDraw();
	
	Boolean nextDraw(Boolean EnemiesLastAnswer);
	
}
