import java.awt.Graphics;
import java.awt.Point;


public class Grid {
  Cell[][] cells = new Cell[20][20];
  
  public Grid() {
    for(int i=0; i<cells.length; i++) {
      for(int j=0; j<cells[i].length; j++) {
        
        int id =Random();
        
        if(id==1){
          cells[i][j] = new WallCell(10+Cell.size*i, 10+Cell.size*j);
        }else if(id==2){
          cells[i][j] = new FenceCell(10+Cell.size*i, 10+Cell.size*j);
        }else if(id==3){
          cells[i][j] = new StoneCell(10+Cell.size*i, 10+Cell.size*j);
        }else if (id==4||id==5){
          cells[i][j] = new SandCell(10+Cell.size*i, 10+Cell.size*j);
        }else if(id==6||id==7||id==8){
          cells[i][j] = new GrassCell(10+Cell.size*i, 10+Cell.size*j);
        }else{
          cells[i][j] = new WaterCell(10+Cell.size*i, 10+Cell.size*j);
        }
        
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
