const scanner = require("prompt-sync")();
const number = scanner("Enter a number:");    
     
    
    let counter = 0;
    for(let count = 1900; count <= number; count++){ 
        if(count % 400 == 0 || count % 4 == 0 && count % 100 != 0){
             counter++;     
        }
        
    }
    console.log("The leaps year is: " + counter);    
    

