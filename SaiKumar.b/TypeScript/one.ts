//Displaying greatest of three numbers.
function largest(a, b,c) {
	if(a > b && a>c)
		return a;
	else if(b>a && b>c)
		return b;
	else
		return c;
}
var a=12;
var b=25;
var c=89;
console.log(largest(a,b,c));