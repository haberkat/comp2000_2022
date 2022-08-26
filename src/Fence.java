import java.awt.Color;
import java.awt.Polygon;
import java.util.ArrayList;

public class Fence extends Terrain{
    


    public Fence (Cell fenceCell){
        terrainCell = fenceCell;
        movementCost= 0;
        terrainType="FENCE";
        color = Color.MAGENTA;
        cells = new ArrayList<Polygon>();

        // use of polygon class allows for future shape change for 
        //different cell types 
        Polygon terrain = new Polygon();
        terrain.addPoint(terrainCell.x,terrainCell.y);
        terrain.addPoint(terrainCell.x+Cell.size,terrainCell.y);
        terrain.addPoint(terrainCell.x+Cell.size,terrainCell.y+Cell.size);
        terrain.addPoint(terrainCell.x,terrainCell.y+Cell.size);

        cells.add(terrain);

    }

    
    
}