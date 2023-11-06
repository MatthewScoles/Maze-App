
public class Square {
    private Square Previous;
    private String type;
    private int row;
    private int col;
    private String originalType;

    public Square(int Row, int Col, String Type){
        this.row = Row;
        this.col = Col;
        this.type = Type;
        this.originalType = Type;
        this.Previous = null;

    }

    public int getRow(){
        return row;
    }
    public int getCol(){
        return col;
    }
    public String getType(){
        return type;
    }
    


    public String toString(){
       if(this.type == "0"){
            return "_";
            }
            
        if(this.type == "1"){
            return "#";
            }

        if(this.type == "2"){
            return "S";
            }

        if(this.type == "3"){
            return "E";
            }

        else{
            return type;
        }
    
    }

    public void Reset(){
        type = originalType;
    }

}