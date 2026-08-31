const scanner = require("prompt-sync")();
const number = scanner("Enter a number:");
         

    //let number = 145;

    let factorial = 0;
    let factorial2 = 0;
    let factorial3 = 0;

    let sum = 0;
    
    let multply = 1;
    let multply2 = 1;
    let multply3 = 1;
 
    factorial = number % 10;

    factorial2 =(number / 10) % 10;;

    factorial3 = (number / 100) % 10;

    for(let count = 1; count <= factorial; count++){
       multply *= count;

    }
    for(let count = 1; count <= factorial2; count++){
        multply2 *= count;
    }    
     for(let count = 1; count <= factorial3; count++){
         multply3 *= count;
    }
     sum = multply + multply2 + multply3;

    if(sum == number){

    console.log("the number is strong number");
    }

    else{
    console.log("the number is not Strong number");
    }

