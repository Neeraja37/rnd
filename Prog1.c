#include<stdio.h>
#include<string.h>
int main(){
    char s[]="Hello World";
    int n=strlen(s);
    int i;
    for(i=0;i<n;i++){
        s[i]=s[i]^0;
    }
    printf("%s\n",s);
    return 0;
}
