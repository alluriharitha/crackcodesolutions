#include <stdio.h>
#include<string.h>
#include<stdlib.h>
void reverse(char *str) {
	char *temp=(char *)malloc(100);
	int j=0,i=0;
 	int l=strlen(str)-1;
	for(i=l;i>=0;i--){
		temp[j]=str[i];
		j++;
	}
	temp[j]='\0';
	printf("%s",temp);
}
int main(void) {
	// your code goes here
	char str[100];
	scanf("%s",str);
	reverse(str);
	return 0;
}

