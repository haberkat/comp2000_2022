import java.awt.Color;

public class WaterCell extends Cell {
    public WaterCell(int x, int y){
        super(x, y);
        movementCost= 100;
        terrainType="WATER";
        color = Color.BLUE;
        crossingTime="Crossing Time: 20";
    }  
}
