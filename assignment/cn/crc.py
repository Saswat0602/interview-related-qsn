crc = 0xFFFF

for data in message:
    crc = crc ^ data
    for i in range(8):
        if ((crc & 0x0001) == 1):
            crc = (crc >> 1) ^ 0x8408
        else:
            crc >>= 1

crc = ~crc & 0xFFFF

if crc != 0:
    print("Error detected!")
else:
    print("No error detected.")