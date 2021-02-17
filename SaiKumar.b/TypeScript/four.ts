class Student{
    stdId:number;
    stdName:string;
    stdClass:number;
    constructor(id:number,name:string,clase:number){
        this.stdId=id;
        this.stdName=name;
        this.stdClass=clase;
    }
    display():void{
        console.log(this.stdId+" "+this.stdName+" "+this.stdClass);
        console.log();
    }
}
var obj1=new Student(1,"Jack Sparrow",11);
var obj2=new Student(2,"John Wick",12);
obj1.display();
obj2.display();