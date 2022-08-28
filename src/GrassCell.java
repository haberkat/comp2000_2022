import java.awt.Color;

public class GrassCell extends Cell {
    public GrassCell(int x, int y){
        super(x, y);
        movementCost= 20;
        terrainType="GRASS";
        color = Color.GREEN;
        crossingTime="Crossing Time: 4";
    }  
}
