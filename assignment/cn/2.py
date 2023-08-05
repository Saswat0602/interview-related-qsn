# write python code Simplex stop-and-wait protocol with positive acknowledgement and
# retransmission.

import time

def SimpleStopAndWait():
    #sender
    data = "Hello World"
    while True:
        #send data
        print("Sending data: {}".format(data))
        time.sleep(1)
        #wait for acknowledgement
        print("Waiting for acknowledgement...")
        time.sleep(1)
        #check for acknowledgement
        if checkForAcknowledgement():
            print("Acknowledgement received, data sent successfully")
            break
        else:
            print("No acknowledgement received, retransmitting data...")
            time.sleep(1)

def checkForAcknowledgement():
    return True #simulate acknowledgement received

SimpleStopAndWait()