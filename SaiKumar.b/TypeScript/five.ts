class Product{
    ProId:number;
    ProName:string;
    ProPrice:number;
    constructor(id:number,name:string,price:number)
    {
        this.ProId=id;
        this.ProName=name;
        this.ProPrice=price;
    }
}
class Tax extends Product{
    Gst(rate)
    {
        console.log(this.ProId+" "+this.ProName+" "+(this.ProPrice+(this.ProPrice*(rate/100))));
    }
}
var a=new Tax(1,"Laptop",100);
a.Gst(9);
