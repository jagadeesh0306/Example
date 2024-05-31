
// passing function as arguments

var add = function(x, y)
{
    var result = x * y;
    return result;
}
function calc(fun, a, b)
{
    var r1 = fun(a, b);
    return r1;
}
var sum = calc(add, 2, 3);
console.log(sum);