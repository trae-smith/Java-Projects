public class Circle extends Shape{
    XYCoord anchor;
    double radius;
    
    public Circle(XYCoord anchor, double radius){  
        super(anchor);
        if(radius>=0){
        this.radius=radius;
    }

}
public void setRadius(double newRadius){
    if (newRadius>=0){
        this.radius=newRadius;
    }
    
}
public double area(){
    double area=Math.PI*this.radius*this.radius;
    
    return area;    
}
public double perimeter(){
    double perimeter=Math.PI*this.radius*2;
    
    return perimeter;
}

@Override
public XYCoord getAnchor(){ 
    return this.a; 
}



    
}
