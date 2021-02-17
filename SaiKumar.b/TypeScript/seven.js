var Car = /** @class */ (function () {
    function Car(a, b, c) {
        this.speed = a;
        this.regularPrice = b;
        this.color = c;
    }
    Car.prototype.getSalePrice = function () {
        console.log("Sale price is: " + (this.regularPrice - (this.regularPrice * 0.1)));
    };
    Car.prototype.display = function () {
        console.log(this.speed + " " + this.regularPrice + " " + this.color);
    };
    return Car;
}());
var x = new Car(100, 2000000, "black");
var y = new Car(300, 999999999, "Red");
x.display();
x.getSalePrice();
y.display();
y.getSalePrice();
