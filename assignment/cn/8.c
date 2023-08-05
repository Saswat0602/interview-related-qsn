#include <sys/types.h> 
#include <sys/socket.h> 
#include <stdio.h> 
#include <netinet/in.h> 
#include <arpa/inet.h> 
#include <unistd.h> 
#include <string.h>
#include <stdlib.h>
#include <netdb.h>

#define PORT 1234 
#define MAXSZ 100 

int main() 
{ 
	int sockfd,nBytes; 
	char sendBuff[MAXSZ]; 
	char recvBuff[MAXSZ]; 
	struct sockaddr_in servaddr,cliaddr; 
	int i; 

	sockfd=socket(AF_INET,SOCK_STREAM,0); 
	if(sockfd<0) 
		perror("Problem in opening socket"); 
	
	servaddr.sin_family=AF_INET; 
	servaddr.sin_addr.s_addr=inet_addr("127.0.0.1"); 
	servaddr.sin_port=htons(PORT); 
	
	if(connect(sockfd,(struct sockaddr *)&servaddr,sizeof(servaddr))<0) 
		perror("Problem in connect"); 
	
	
	for(i=0;i<26;i++) 
	{ 
		sendBuff[0]=i+'A'; 
		sendBuff[1]='\0'; 
		write(sockfd,sendBuff,strlen(sendBuff)+1); 
		nBytes=read(sockfd,recvBuff,sizeof(recvBuff)); 
		printf("Received %s\n",recvBuff); 
	} 
	
	close(sockfd); 
	return 0; 
}