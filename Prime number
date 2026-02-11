//C program
//Program to check if the given number is fine
#include <stdio.h>

int main() {
    int c,n;
    printf("Enter the number to be checked:");
    scanf("%d", &n);
    c=0;
    for (int i=2; i<= n/2; i++){
        if(n%i==0){
            c+=1;
        }else{
            break;
        }
    }if (c>0){
        printf("Numner is not prime");
    }else{
        printf("Number is prime");
    }
}
