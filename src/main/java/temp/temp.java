package temp;

import javax.jws.soap.SOAPBinding;

class father {
    private void print() {
        System.out.println("private");
    }

    public static void main(String[] args) {
        father son = new son();
        son.print();
    }
}

class son extends father {

}

public class temp {
    public static void main(String[] args) {
        father son = new son();
        //son.print();
    }
}
