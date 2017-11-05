#include<iostream>
using namespace std;

class RegularSimplePolygons{
public:
    long long int n;
    int l;
    long long int Polygons(){
        return n*l;
    }
};

int main(){
    RegularSimplePolygons rsp;

    cin >>rsp.n>>rsp.l;
    cout<<rsp.Polygons()<< endl;

    return 0;
}
