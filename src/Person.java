public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        super();
        this.name=name;
        this.age=age;
        
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    
    public void setAge(int Age){
        if(age<18){
            System.out.println("ERROR");
            return;
        }
        this.age=age;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name +" "+age;
    }


}