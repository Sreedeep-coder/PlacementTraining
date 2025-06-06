//Single level 
//multi level 
//Multiplpe

class math {
    void formula(){
        System.out.println("(A+B)^2 = A^2 + 2AB + B^2");


    }    
}
class chemistry extends math
{
    void display(){
        System.out.println("Nothing");
    }
}
class physics extends chemistry{
    void show(){
        System.out.println("access");

    }
}
class physics extends math{
    void show(){
        
    }
}