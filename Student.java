public class Student {
    private String name;
    private int age;
    private double gpa;
    
    public Student(String name, int age, double gpa){
        if (gpa < 0.0 || gpa > 4.0) throw new IllegalArgumentException();
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getGpa(){
        return gpa;
    }
    
    public boolean isCooked(){
        return gpa < 2.0 || age > 32;
    }
    
  public static void main(String args[]) {
      
      Student edric = new Student("Edric",20,3.643);
      if(edric.isCooked()){
          System.out.println("Nah " + edric.getName() + ", you're cooked buddy");
      }
      else{
          System.out.println("Nah " + edric.getName() + ", you're good fam");
      }
          
  }
  
}