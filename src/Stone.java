import java.awt.Color;
import java.awt.Polygon;
import java.util.ArrayList;

public class Stone extends Terrain{
    


    public Stone (Cell stoneCell){
        terrainCell = stoneCell;
        movementCost= 10;
        terrainType="STONE";
        color = Color.LIGHT_GRAY;
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