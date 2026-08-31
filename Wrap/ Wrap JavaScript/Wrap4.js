const scanner = require("prompt-sync")();
const number = scanner("Enter a number:");
    
    let sum = 0;

    for(let count = 1; count < number; count++){ 
       
        if(number % count == 0){

            sum += count;         
        }
 
    }

    if(sum == number){
            console.log("The number is a perfect number");
    }
    else{
            console.log("The number is not a perfect number");

    }
