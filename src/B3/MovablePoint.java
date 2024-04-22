package B3;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    
    public void MoveUp(){
        y++;
    }
    public void MoveDown(){
        y--;
    }
    public void MoveLeft(){
        x++;
    }
    public void MoveRight(){
        x--;
    }
}
