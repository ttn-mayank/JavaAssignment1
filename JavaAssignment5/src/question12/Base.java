package question12;

sealed class Base permits Child1,Child2{
    void display(){
        System.out.println("This is Base Class");
    }
}
