import java.util.ArrayList;
import java.util.List;
import java.awt.Graphics;
import java.awt.Point;

public class Arena {
    Grid grid;
    List<Terrain> terrain;

    public Arena(){
        grid= new Grid();
        terrain = new ArrayList<Terrain>();
        for (int i=0; i<grid.cells.length; i++){
            for(int j=0; j<grid.cells[i].length; j++){
                int cellId = grid.cells[i][j].terrainId;
                if(cellId==1){
                    terrain.add(new Wall(grid.cells[i][j]));
                }else if(cellId==2){
                    terrain.add(new Fence(grid.cells[i][j]));
                }else if(cellId==3){
                    terrain.add(new Stone(grid.cells[i][j]));
                }else if(cellId==4||cellId==5){
                    terrain.add(new Sand(grid.cells[i][j]));
                }else if(cellId>=6 && cellId<=8){
                    terrain.add(new Grass(grid.cells[i][j]));
                }else{
                    terrain.add(new Water(grid.cells[i][j]));
                }
            }
        }
    }
    public void paint(Graphics g, Point mouseLoc) {
        grid.paint(g, mouseLoc);
        for(Terrain t: terrain) {
            t.paint(g);
          }
        }
}
