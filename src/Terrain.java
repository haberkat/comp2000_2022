import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.awt.Polygon;

public abstract class Terrain  {
    String terrainType;
    int movementCost;
    Cell terrainCell;
    Color color;
    List<Polygon> cells;

        public void paint(Graphics g){
            for(Polygon p: cells){
            g.setColor(color);
            g.fillPolygon(p);
            g.setColor(Color.BLACK);
            g.drawPolygon(p);
            }
        }

    
}

/***
 * import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.List;

public abstract class Actor {
  Color color;
  Cell loc;
  List<Polygon> display;

  public void paint(Graphics g) {
    
    for(Polygon p: display) {
      g.setColor(color);
      g.fillPolygon(p);
      g.setColor(Color.GRAY);
      g.drawPolygon(p);
    }
  }
}
 */
