package leadgen;

import java.util.ArrayList;

public class Tbook {
    private static Tbook instance;
    private static ArrayList <Person> base;
    private Tbook(){};

    public static Tbook getInstance(){
        if (instance==null){
            instance=new Tbook();
            base=new ArrayList<Person>();
        };
        return instance;
    }
    public Tbook addPerson(Person person){
        base.add(person);
        return instance;
    }
    public String getPhone(String fname, String sname){
        String rez="";
        for (Person p: base){if (p.fname==fname && p.sname==sname) {rez=p.phone; break;}}
        return rez;
    }

    public String toString(){
        String rez;
        if (base.size()==0) return "[]";
        rez="["+base.get(0);
        for (int i=1;i<base.size();i++){rez=rez+","+base.get(i);}
        rez=rez+"]";
        return rez;
    }

    public void clean(){instance=null;}
    public boolean isEmpty(){return instance==null;}
}

class Person{
    public String fname;
    public String sname;
    public String phone;
    private String fullname;
    public Person(String fname,String sname,String phone){
        this.fname=fname;
        this.sname=sname;
        this.phone=phone;
        this.fullname=fname+sname;
    }

    public String toString(){
        return fname+" "+sname+"-"+phone;
    }

}