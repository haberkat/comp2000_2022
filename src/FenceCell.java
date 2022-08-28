import java.awt.Color;

public class FenceCell extends Cell {
    public FenceCell(int x, int y){
        super(x, y);
        movementCost= 0;
        terrainType="FENCE";
        color = Color.MAGENTA;
        crossingTime="CANNOT CROSS";
    }  
}
