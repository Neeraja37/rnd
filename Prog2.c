#include<stdio.h>
#include<string.h>
int main(){
    char s[]="Hello World";
    int n=strlen(s);
    char a[n],b[n];
    int i;
    for(i=0;i<n;i++){
        a[i]=s[i]|127;
        b[i]=s[i]^127;
        s[i]=s[i]&127;
    }
    printf("AND: %s\nOR: %s\nXOR: %s\n",s,a,b);
    return 0;
}
