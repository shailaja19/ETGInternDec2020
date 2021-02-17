class Car{
    speed:number;
    regularPrice:number;
    color:string;
    constructor(a:number,b:number,c:string)
    {
        this.speed=a;
        this.regularPrice=b;
        this.color=c;
    }
    display(){
        console.log(this.speed+" "+this.regularPrice+" "+this.color);
    }
}
class truck extends Car{
    weight:number;
    constructor(d:number)
    {
        super(a:Number,b:Number,c:Number):Car;
       // super(speed,regularPrice,color);
        this.weight=d;
        
    }
    getSalePrice(){
        console.log("Sale price is: "+(this.regularPrice-(this.regularPrice*0.1)));
    }

}
var x=new Car(100,2000000,"black");
var y=new Car(300,999999999,"Red");

x.display();
//x.getSalePrice();
y.display();
//y.getSalePrice();