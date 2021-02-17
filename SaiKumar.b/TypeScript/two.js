var array = [1, 3, 5, 3, 7, 9, 3];
var key = 2;
for (var i in array) {
    if (array[i] == key) {
        console.log("Element present at: " + i + " position");
    }
}
