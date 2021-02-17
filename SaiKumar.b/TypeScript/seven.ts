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
    
    getSalePrice(){
        console.log("Sale price is: "+(this.regularPrice-(this.regularPrice*0.1)));
    }
    display(){
        console.log(this.speed+" "+this.regularPrice+" "+this.color);
    }
}
var x=new Car(100,2000000,"black");
var y=new Car(300,999999999,"Red");

x.display();
x.getSalePrice();
y.display();
y.getSalePrice();