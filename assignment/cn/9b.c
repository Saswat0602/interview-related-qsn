#include<stdio.h>
#include<string.h>
#include<sys/types.h>
#include<sys/socket.h>
#include<netinet/in.h>
#include<arpa/inet.h>
#include<stdlib.h>

#define MYPORT 3490
#define BUFFER 1024

int main()
{
	int sockfd;
	struct sockaddr_in serverAddr;

	int numrv;

	char buf[BUFFER + 1];
	char buffer[BUFFER + 1];
	char *hostIP = "127.0.0.1";
	//char *hostIP = "10.0.0.1";
	char *port = "3490";

	int length;
	char value;
	int num;
	float fvalue;

	int i=0;

	if((sockfd = socket(AF_INET, SOCK_STREAM, 0))==-1){
		perror("socket");
		exit(1);
	}
	if(inet_addr(hostIP)==-1){
		printf("Invalid IP address");
		perror("inet_addr");
		exit(1);
	}
	serverAddr.sin_family = AF_INET;
	serverAddr.sin_port = htons(MYPORT);
	serverAddr.sin_addr.s_addr = inet_addr(hostIP);
	bzero(&(serverAddr.sin_zero),8);

	if(connect(sockfd, (struct sockaddr *)&serverAddr, sizeof(struct sockaddr)) == -1){
		perror("connect");
		exit(1);
	}
	if((numrv = recv(sockfd, buf, BUFFER, 0)) == -1){
		perror("recv");
		exit(1);
	}
	buf[numrv] = '\0';
	printf("%s\n", buf);
	//printf("Value of numrv = %d\n", numrv);
	
	strcpy(buffer, buf);
	
	char *ptr;
	int *numptr; 
	char *valueptr;
	float *fvalueptr;

	ptr = strtok(buffer, " ");
	numptr = atoi(ptr);
	ptr = strtok(NULL, " ");
	valueptr = ptr;
	ptr = strtok(NULL, " ");
	fvalueptr = ptr;

	printf("char = %c\n", *valueptr);
	printf("int = %d\n", *numptr);
	printf("float = %f\n", *fvalueptr);

	printf("char = %d\n", *buf);
	printf("int = %d\n", *(buf+1));
	printf("float = %d\n", *(buf+5));

	printf("char = %d\n", *buf);
	printf("int = %d\n", *(buf+1));
	printf("float = %d\n", *(buf+5));

	length = strlen(buf);
	printf("length of buf = %d\n", length);

	value = *buf;
	num = *(buf+1);
	fvalue = *(buf+5);

	printf("char value %c integer value %d float value %f\n", value, num, fvalue);

	value = value + 1;
	num = num + 1;
	fvalue = fvalue + 1;

	printf("char value %c integer value %d float value %f\n", value, num, fvalue);

	close(sockfd);
}