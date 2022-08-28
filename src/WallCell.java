import java.awt.Color;

public class WallCell extends Cell {
    public WallCell(int x, int y){
        super(x, y);
        movementCost= 0;
        terrainType="WALL";
        color = Color.DARK_GRAY;
        crossingTime="CANNOT CROSS";
    }  
}
