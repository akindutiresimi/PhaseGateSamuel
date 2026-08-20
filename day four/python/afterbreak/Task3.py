total = 0
average = 0
for number in range(1,11):

    number = int(input("Enter number"))
    
    total = number + total
    average = total / 10

print("the average is:", average)

print("the total is:", total)
