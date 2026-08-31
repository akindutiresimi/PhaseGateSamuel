const scanner = require ("prompt-sync")();
const number1 = scanner("enter a number1:");
const number2 = scanner("Enter a number2:");

    let largest = 1;
    let lcm = 1;

    for(let count = 2; count <= number1; count++)
    
        if(number1 % count == 0 && number2 % count == 0)
                 
            largest = count;         
    
    
    lcm = (number1 * number2) / largest;
   
    console.log("the greastest divisor is:  " + largest);
    console.log("the lowest common multiple is: " + lcm);
    

