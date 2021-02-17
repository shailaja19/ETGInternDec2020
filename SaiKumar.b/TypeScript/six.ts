class Tshirt{
    color:string;
    material:string;
    design:string;
    constructor(colr:string,mater:string,des:string)
    {
        this.color=colr;
        this.material=mater;
        this.design=des;
    }
    display(){
        console.log(this.color);
        console.log(this.material);
        console.log(this.design);
    }
}
var small=new Tshirt("Pink","Cotton","Polka dots");
var large=new Tshirt("Black","Silk","plain");
var xtralarge=new Tshirt("White","nylon","faded");
small.display();
large.display();
xtralarge.display();