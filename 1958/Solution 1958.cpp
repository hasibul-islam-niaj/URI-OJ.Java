#include <iostream>
#include <stdio.h>
using namespace std;
int main ()
{
    double n;
    scanf ("%lf", &n);
    char str [1000];
    sprintf (str, "%lf", n);
    if (str[0]!='-')
        printf ("+");
    printf ("%.4E\n", n);
    return 0;
}
