#include <string>
#include <iostream>
class A;

class B{
public:
    //A a;
    int printa();
};

class A{
public:
    A(int a) : num(a) {}

private:
    int num;
};

int main()
{
    B b;
    b.printa();

    std::cout << b.printa() << std::endl;
    return 0;
}