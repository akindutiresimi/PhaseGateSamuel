const scanner = require("prompt-sync")();
const number1 = scanner("Enter a number");
const number2 = scanner("Enter a number");

    let largest = 1;
    for(let count = 2; count <= number1; count++)
    
        if(number1 % count == 0 && number2 % count == 0)
                 
            largest = count;       
  
    console.log("the greastest divisor is: " + largest);
  
