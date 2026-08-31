const scanner = require("prompt-sync")();
const number = scanner("Enter a number:");
         
    for(let count = 1; count <= number; count++){ 

        let sum = 0;

       for(let counter = 1; counter < count; counter++){

         if(count % counter == 0){

            sum += counter;

        }
        }
        
         if (sum == count){

         console.log("perfect number :" + count);
    
        }
    }
    


