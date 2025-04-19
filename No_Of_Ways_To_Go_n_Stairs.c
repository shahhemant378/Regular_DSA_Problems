// Online C compiler to run C program online
#include <stdio.h>
int count=0;
void countWays(int stars,int curr){
    if(curr==stars){
        count++;
        return;
    }
    countWays(stars,curr+1);
    if(curr+2<=stars){
        countWays(stars,curr+2);
    }
    return;
}
int main() {
    // Write C code here
    int stars;
    printf("Enter the stars you want to reached:");
    scanf("%d",&stars);
    
    countWays(stars,0);
    printf("The number of ways to reach %d stars is %d",stars,count);
    

    return 0;
}
