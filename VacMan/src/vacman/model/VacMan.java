package vacman.model;

import acm.graphics.GCompound;

public class VacMan extends GCompound {

	int VacMan = 4;
	int xCoordinat;
	int yCoordinat;
	
	public VacMan() {
		this.xCoordinat = xCoordinat;
		this.yCoordinat = yCoordinat;
	}

	public int getXCoordinat() {
		return xCoordinat;
	}

	public int getYCoordinat() {
		return yCoordinat;
	}

	// sets new VacManXCoordinat if it is a valid move
	public void setXCoordinat(int XDisplacement) {
		if (GameMap[][].get[xCoordinat + xDisplacement][yCoordinat])!= 0 {
			this.xCoordinat = xCoordinat + XDisplacement;
		}
		GameMap.set(VacMan,xCoordinat,yCoordinat);
	}

	// sets new VacManYCoordinat if it is a valid move
	public void setYCoordinat(int YDisplacement) {
		if (GameMap[][].get[xCoordinat][yCoordinat + xDisplacement])!= 0 {
			this.yCoordinat = yCoordinat + yDisplacement;
		}
		GameMap.set(VacMan,xCoordniat,yCoordinat);
	}

}
