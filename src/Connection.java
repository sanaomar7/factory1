public class Connection {
    public int size;
    private String Name;
    public int Counter = 0   ;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public int increase(){
        ++Counter;
        return Counter ;
    }
    public int decrease(){
        Counter--  ;
        return Counter ;
    }
    public int Counterpro() {
        Counter = increase() ;
        return Counter ;
    }


    public void pre() { // create get instance

        int c = Counterpro() ;
        System.out.println(Name + " is Created .. ");

    }

    public String getinstance() {
        return null;
    }
    public void release(){

    }


}
