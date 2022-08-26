import java.awt.Graphics;
import java.awt.Point;


public class Grid {
  Cell[][] cells = new Cell[20][20];
  
  public Grid() {
    for(int i=0; i<cells.length; i++) {
      for(int j=0; j<cells[i].length; j++) {
        cells[i][j] = new Cell(10+Cell.size*i, 10+Cell.size*j);
        cells[i][j].terrainId = Random();
      }
    }
  }

  public void paint(Graphics g, Point mousePos) {
    for(int i=0; i<cells.length; i++) {
      for(int j=0; j<cells[i].length; j++) {
        cells[i][j].paint(g, mousePos);
      }
    }
  }
  // generate value between 1-10 to generate 
  // terrain type
  public int Random(){
    int random = (int) (1+ Math.floor(Math.random()*10));

    if(random<0){
       random*=-1;
    }

    return random;

}

}
