package JavaSession17;

import java.io.Serializable;
//transient: any field never wants to be a part od Serialization,declare it as a Transient
public class Employee implements Serializable {
    int eid;
    transient String ename;
    float esal;

    public Employee(int eid, String ename, float esal) {
        this.eid = eid;
        this.ename = ename;
        this.esal = esal;
    }
}
