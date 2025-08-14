public class Cat {
    private int age;
    private String type;



    public void PrintInfo(){
        System.out.println(age +"-"+ type);
    }

    public Cat(int Age, String Type){
        this.age = Age;
        this.type = Type;
    }
}

