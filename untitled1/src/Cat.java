public abstract class Cat {
    protected int age;
    protected String type;



    public static void Hello(){
        System.out.println("Hello");
    }


public abstract void PrintType();

    public void PrintInfo(){
        System.out.println(age +"-"+ type);
    }

    public int getAge() {
        return age;
    }

    public Cat(int Age, String Type){
        this.age = Age;
        this.type = Type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat(){}

        class Xvost{

        private int lenght;

        public void setDlina(int lenght){

            this.lenght = lenght;
            System.out.println("Длина хвоста = " + this.lenght);
        }
    }
}

