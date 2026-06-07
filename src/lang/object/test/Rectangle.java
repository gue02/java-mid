package lang.object.test;

public class Rectangle {
    private int width;
    private int height;

    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    @Override
    public String toString(){
        return "Rectangle {width = "+width +",height = "+height+"}";
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Rectangle rec = (Rectangle)obj;
        return this.height == rec.height || this.width == rec.width;
    }
}
