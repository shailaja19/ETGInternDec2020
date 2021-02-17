var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Product = /** @class */ (function () {
    function Product(id, name, price) {
        this.ProId = id;
        this.ProName = name;
        this.ProPrice = price;
    }
    return Product;
}());
var Tax = /** @class */ (function (_super) {
    __extends(Tax, _super);
    function Tax() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Tax.prototype.Gst = function (rate) {
        console.log(this.ProId + " " + this.ProName + " " + (this.ProPrice + (this.ProPrice * (rate / 100))));
    };
    return Tax;
}(Product));
var a = new Tax(1, "Laptop", 100);
a.Gst(9);
