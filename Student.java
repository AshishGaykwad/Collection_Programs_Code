package collection_program;

public class Student implements Comparable<Student> {

    int tenth;
    int twelth;
    int ug;
    int pg;

    public Student(int tenth, int twelth, int ug, int pg) {
        super();
        this.tenth = tenth;
        this.twelth = twelth;
        this.ug = ug;
        this.pg = pg;
    }

    @Override
    public String toString() {
        return "Student [tenth=" + tenth + ", twelth=" + twelth + ", ug=" + ug + ", pg=" + pg + "]";
    }

	@Override
    public int compareTo(Student o) {
       if(tenth > o.tenth)
    	   return 1;
       else if(tenth == o.tenth)
    	   return 0;
       else
    	   return -1;
    }

    
}
if