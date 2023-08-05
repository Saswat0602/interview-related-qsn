def checksum(data): 

# initialize checksum to 0 

csum = 0

# loop through every 16-bit word in the data 

for i in range(0, len(data), 2): 

# extract the next 16-bit word from the data 

word = data[i] + (data[i+1] << 8)

# add the word to the checksum 

csum += word

# if the checksum is larger than 2 bytes, add the carry to the checksum 

if csum & 0xFFFF0000: 

# carry occurred, so add carry to result 

csum = (csum & 0xFFFF) + (csum >> 16)

# take the one's complement of the checksum 

csum = ~csum & 0xFFFF

return csum