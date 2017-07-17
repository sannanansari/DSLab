#include<stdio.h>
#include<stdlib.h>
#define MAX_SIZE 10

int stack[MAX_SIZE],top=-1;

int isFull(){
	if(top=MAX_SIZE)
	return1; 
	else
	return 0;
	//returns 1 if stack is full else returns -1
	return (top==MAX_SIZE-1)?1:-1;
}

int isEmpty(){
	if(top=0)
	return 1;
	else 
	return 0;
//returns 1 if stack is empty else returns -1
}

int peek(){
	printf()
//return element at the top of stack
}

void push(int e){
//inserts an element into stack
	if(whether the stack is not full)
	{
		//increment the top
		//set top of stack equal e
		//msg element e successfully inserted
	}
	else{
		//msg stack overflow
	}
}

void pop(){
//deletes an element from top of stack
	int d;
	if(whether the stack is not empty)
	{
		//d=top of stack
		
		//decrement the top
		//msg element d successfully deleted
	}
	else{
		printf("underflow");
	}
}

int main(){
	int choice,e;
	do
	{
		printf("1.peek \t 2.push \t 3.pop \t 4.exit");
		printf("Enter any number");
		scanf("%d",&choice);
		switch(choice){
			case 1:
				peek(choice);
				break;
			case 2:
				push(choice);
				break;
			case 3:
				pop(choice);
				break;
			case 4:
			exit(0)
				
				break;
			default:
printf("invaild statement");
		}
	}while(1);
	return 0;
}
