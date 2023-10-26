
function desending(array){
    array.sort(function(a,b){
    return b-a;
    });
    return array;
    
}
console.log(desending([9,7,4,5,6,3,4,3,99,10]))
