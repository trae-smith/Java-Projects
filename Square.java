public class Square extends Quadrilateral {
    XYCoord anchor;
    double length;
    
    public Square(XYCoord anchor, double length){
        super(anchor,length);
        if(length>=0){
            this.length=length;
        }
    }

    public void setLength(double newLength){
        if (newLength>=0){
        this.length=newLength;
            }    
        }
    public double area(){
        
        double area=this.length*this.length;

        return area;
    }
    public double perimeter(){
    double perimeter=4*this.length;
        
        return perimeter;
    }
    @Override
    public XYCoord getAnchor(){ 
        System.out.println(this.a);
        return this.a; 
    }
    
}
