package com.nasa.marsprojects.marsrobot.validator;

import org.springframework.stereotype.Component;

import com.nasa.marsprojects.marsrobot.exception.ExceededBoundaryException;
import com.nasa.marsprojects.marsrobot.model.Area;
import com.nasa.marsprojects.marsrobot.model.Coordinate;

@Component
public class BoundaryValidator{

	public void validateBoundary(Area area, Coordinate coordinate) {
		Integer yCoordinate = coordinate.getY();
		Integer xCoordinate = coordinate.getX();
		if(!this.yIsWithin(area, yCoordinate) || !this.xIsWithin(area, xCoordinate)) {
			throw new ExceededBoundaryException();
		}
	}
	
	private boolean yIsWithin(Area area, int y) {
		return area.getBaseOfArea().getY() <= y && area.getTopOfArea().getY() >= y;
	}
	
	private boolean xIsWithin(Area area, int x) {
		return area.getBaseOfArea().getY() <= x && area.getTopOfArea().getY() >= x;
	}
}
