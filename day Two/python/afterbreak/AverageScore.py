def AverageScore(Score1, Score2, Score3):

    average = (Score1 + Score2 + Score3) / 3;

    if(average >= 90 and average <= 100):
            print("average is 'A'");    
        
    elif(average >= 80 and average < 90):
            print("average is 'B'");    
        
    elif(average >= 70 and average < 80):
            print("average is 'C'");    
        
    elif(average >= 60 and average < 70):
            print("average is 'D'");    
        
    elif(average >= 0 and average <= 60):
           print("average is 'F'");    
        

   
AverageScore(60, 95, 85);  
    
