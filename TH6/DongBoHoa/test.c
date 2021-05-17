#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <time.h> 
int main(){
    time_t start = time(NULL);
    time_t end = start+5; //run for 5 seconds
    printf("%ld\n\n",start);
    printf("%ld",end);
    return 0;
}