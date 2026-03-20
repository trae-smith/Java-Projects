import javax.xml.crypto.XMLCryptoContext;

public class Quadrilateral extends Shape {
    XYCoord anchor;
    XYCoord b;
    XYCoord c;
    XYCoord d;

    public Quadrilateral(XYCoord anchor, double length){
    super(anchor);
    XYCoord b= new XYCoord(anchor.getX()+length,anchor.getY());
    XYCoord c= new XYCoord(anchor.getX(),anchor.getY()+length);
    XYCoord d= new XYCoord(anchor.getX()+length,anchor.getY()+length);
    }
    public Quadrilateral(XYCoord anchor, XYCoord b, XYCoord c, XYCoord d){  
        super(anchor);
        this.b=b;
        this.c=c;
        this.d=d;  
}
//no setter for Quadrilateral
private XYCoord midpointsetter(XYCoord first, XYCoord second){
    double midx= (first.getX()+second.getX())/2;
    double midy=(first.getY()+second.getY())/2;
    XYCoord midpoint=new XYCoord(midx, midy);
    return midpoint;
}
    

public double area(){
        XYCoord a=getAnchor();
        double midline= a.distance(this.c);
        XYCoord midpoint=midpointsetter(a,this.c);
        double heightA=midpoint.distance(this.b);
        double heightB=midpoint.distance(this.d);
        double area=0.5*midline*(heightA+heightB);
        return area;
    }
    public double perimeter(){
        XYCoord a=getAnchor();
        double sideA=a.distance(this.b);
        double sideB=this.b.distance(this.c);
        double sideC=this.c.distance(this.d);
        double sideD=this.d.distance(a);
        double perimeter= sideA+sideB+sideC+sideD;
        
        return perimeter;
    }
    
    @Override
    public XYCoord getAnchor(){ 
        return anchor; 
    }
}
