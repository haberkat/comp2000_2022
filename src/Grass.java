import java.awt.Color;
import java.awt.Polygon;
import java.util.ArrayList;

public class Grass extends Terrain{
    


    public Grass (Cell grassCell){
        terrainCell = grassCell;
        movementCost= 20;
        terrainType="GRASS";
        color = Color.GREEN;
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