#include <iostream>
#include <stdio.h>
using namespace std;
class ScientificNotation{
public:
    double n;
    int FinalNotation(){
        char str [1000];
        sprintf (str, "%lf", n);

        if (str[0]!='-')
            printf ("+");
        return 0;
    }
};
int main ()
{
    ScientificNotation sn;
    scanf ("%lf", &sn.n);

    sn.FinalNotation();
    printf ("%.4E\n", sn.n);
    return 0;
}
