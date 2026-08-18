function AverageScore(Score1, Score2, Score3)

    const average = (Score1 + Score2 + Score3) / 3;

    if(average >= 90 && average <= 100){
        console.log("average is 'A'");    
    }

    else if(average >= 80 && average < 90){
        console.log("average is 'B'");    
    }

    else if(average >= 70 && average < 80){
        console.log("average is 'C'");    
    }

    else if(average >= 60 && average < 70){
        console.log("average is 'D'");    
    }

    else if(average >= 0 && average <= 60){
       console.log("average is 'F'");    
    }

   
    
     const Score1 = 60;
     const Score2 = 95;
     const Score3 = 85;
    
    AverageScore(Score1, Score2, Score3);  
    


