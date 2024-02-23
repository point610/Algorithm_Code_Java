package temp;

import javax.jws.soap.SOAPBinding;

class father {
    static int temp = 0;

    static void print() {
        System.out.println("static");
    }


}

class son extends father {

}

public class temp {
    public static void main(String[] args) {
        father s = new son();

    }
}
