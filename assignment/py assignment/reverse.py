#reverse a string using reversed()   
# Function to reverse a string   
def reverse(str):   
    string = "".join(reversed(str)) # reversed() function inside the join() function  
    return string   
  
s = "JavaTpoint"  
  
print ("The original string is : ",s)   
print ("The reversed string using reversed() is : ",reverse(s) )  







# reverse a string    
# using recursion   
    
def reverse(str):   
    if len(str) == 0: # Checking the lenght of string  
        return str   
    else:   
        return reverse(str[1:]) + str[0]   
    
str = "Devansh Sharma"   
print ("The original string  is : ", str)     
print ("The reversed string(using recursion) is : ", reverse(str))  







#  Reverse a string    
# using  slice syntax   
# reverse(str) Function to reverse a string   
def reverse(str):   
    str = str[::-1]   
    return str   
    
s = "JavaTpoint"  
print ("The original string  is : ",s)   
print ("The reversed string using extended slice operator  is : ",reverse(s))





def reverse_string(str):  
    str1 = ""   # Declaring empty string to store the reversed string  
    for i in str:  
        str1 = i + str1  
    return str1    # It will return the reverse string to the caller function  
     
str = "JavaTpoint"    # Given String       
print("The original string is: ",str)  
print("The reverse string is",reverse_string(str)) # Function call  






