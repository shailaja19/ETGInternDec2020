var Student = /** @class */ (function () {
    function Student(id, name, clase) {
        this.stdId = id;
        this.stdName = name;
        this.stdClass = clase;
    }
    Student.prototype.display = function () {
        console.log(this.stdId + " " + this.stdName + " " + this.stdClass);
        console.log();
    };
    return Student;
}());
var obj1 = new Student(1, "Jack Sparrow", 11);
var obj2 = new Student(2, "John Wick", 12);
obj1.display();
obj2.display();
