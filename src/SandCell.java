import java.awt.Color;

public class SandCell extends Cell {
    public SandCell(int x, int y){
        super(x, y);
        movementCost= 50;
        terrainType="SAND";
        color = Color.YELLOW;
        crossingTime="Crossing Time: 10";
    }  
}
