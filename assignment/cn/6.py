def leaky_bucket(pkt_size, bucket_size, output_rate): 

 if(pkt_size > bucket_size): 

    print("Packet size is greater than bucket size") 

 else: 

    print("Packet size is less than bucket size") 

pkt_rate = output_rate/pkt_size 

print("Packet rate is", pkt_rate, "packets/sec") 

if (pkt_rate > 1): 

  print("Packet will be sent") 

else: 

  print("Packet will be dropped")