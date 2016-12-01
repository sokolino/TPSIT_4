#include<stdio.h>
#include<stdlib.h>
main(){
        int n,i,p;
        do{
                printf("Inserire valore da 1 a 4: ");
                scanf("%d",&n);
        }while((n<1)||(n>4));
        for(i=0;i<n;i++){
                p= fork();
                if(p==0){
                        printf("Sono il figlio: %d e mio padre Ã¨ %d\n", getppid(), getppid());
                }
        }
}
