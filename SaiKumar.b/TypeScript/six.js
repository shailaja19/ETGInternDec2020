var Tshirt = /** @class */ (function () {
    function Tshirt(colr, mater, des) {
        this.color = colr;
        this.material = mater;
        this.design = des;
    }
    Tshirt.prototype.display = function () {
        console.log(this.color);
        console.log(this.material);
        console.log(this.design);
    };
    return Tshirt;
}());
var small = new Tshirt("Pink", "Cotton", "Polka dots");
var large = new Tshirt("Black", "Silk", "plain");
var xtralarge = new Tshirt("White", "nylon", "faded");
small.display();
large.display();
xtralarge.display();
