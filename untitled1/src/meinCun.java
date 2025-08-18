import java.lang.reflect.Type;
import java.util.Map;

public class meinCun extends Cat
{
    public Xvost xvost = new Xvost();

    private String Kind;
    public meinCun(int Age, String Type) {
        super(Age, Type);


    }


    @Override
    public void PrintType() {
        System.out.println(type);
    }

    @Override
    public int getAge() {
        System.out.println("ewfw");
        return super.getAge();
    }

    public void setAge(int Age, String Kind){
      super.setAge(Age);
      this.Kind = Kind;

    }

    public  void PrintKind(){
        System.out.println(Kind);
    }

}
