public class Triangle extends Shape {
    XYCoord a;
    XYCoord b;
    XYCoord c;
    
    public Triangle(XYCoord a, XYCoord b, XYCoord c){
        super(a);
        this.b=b;
        this.c=c;
    }
    
    private XYCoord midpointsetter(XYCoord first, XYCoord second){
        double midx= (first.getX()+second.getX())/2;
        double midy=(first.getY()+second.getY())/2;
        XYCoord midpoint=new XYCoord(midx, midy);
        return midpoint;

    }
    
    public void setBC(XYCoord newB, XYCoord newC){
        this.b=newB;
        this.c=newC;
    }
    public double area(){
        XYCoord midpoint= midpointsetter(this.b,this.c);
        double base= this.b.distance(this.c);
        double height=Math.abs(this.a.distance(midpoint));
        double area=(base*height)/2;
        
        return area;
    }
    public double perimeter(){
        double sideA=this.a.distance(this.b);
        double sideB=this.b.distance(this.c);
        double sideC=this.c.distance(this.a);
        double perimeter=sideA+sideB+sideC;
        return perimeter;
    }

    @Override
    public XYCoord getAnchor(){ 
        return this.a; 
    }
    
}
