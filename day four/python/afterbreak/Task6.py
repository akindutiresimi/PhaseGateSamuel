total = 0
average = 0
for number in range(1,11,1):

    number = int(input("Enter number"))

    if(number % 2 == 0):
        total = number + total
   average = total / 10

print("the average is:", average)


#print("the total is:", total)
