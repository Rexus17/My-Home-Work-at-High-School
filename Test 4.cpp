#include <iostream>
using namespace std;
int main()	
{
	int a=10,b=15,c=20,D,E,F,G,H;
	D=15*a+b > 100;
	E=a+b*c < 150;
	F=c/a+b > 10;
	G=D && E ||F;
	H=!(G);
	cout<<"D=15*a+b > 100="<<D;
    cout<<"E=a+b*c < 150="<<E;
	cout<<"F=c/a+b > 10="<<F;
	cout<<"G=d&&e ||f="<<G;
	cout<<"H=i(g)="<<H;	
}
