interface hr{
    int a = 10;
    void display();

}
class office implements hr{
    public void display(){
        System.out.println(++a);
    }
}

//for multiple inheritance we use interface 
