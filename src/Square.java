
public class Square {
    private String type;
    private int row;
    private int col;

    public Square(int Row, int Col, String Type){
        this.row = Row;
        this.col = Col;
        this.type = Type;

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

}