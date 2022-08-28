import java.awt.Color;

public class StoneCell extends Cell {
    public StoneCell(int x, int y){
        super(x, y);
        movementCost= 10;
        terrainType="STONE";
        color = Color.LIGHT_GRAY;
        crossingTime="Crossing Time: 2";
    }  
}
