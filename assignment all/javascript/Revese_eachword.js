const prompt = require("prompt-sync")();
var n = prompt("Enter the string: ");
var n1 = n.split(" ");
var n2 = "";
for (var i = 0; i < n1.length; i++) {
    for (var j = n1[i].length - 1; j >= 0; j--) {
        n2 = n2 + n1[i][j];
    }
    n2 = n2 + " ";
}
console.log(n2);