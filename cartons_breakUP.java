// ex:5
import java.util.*;

public class cartons_breakUP {
    int nb[] = { 48, 24, 12, 6 };
    int bn[] = new int[4];

    void input() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n <= 1000) {
            process(n);
        } else {
            System.out.println("Invalid! \n\t Try again!");
            input();
        }
    }

    void process(int n) {
        int ne = 0, div, b = 1, sum = 0, cn = n, suma = 0, Remaining_boxes = 0;
        for (int i = 0; b != 0; i++) {
            div = (int) (cn / nb[ne]);
            bn[ne] = div;
            sum = div * nb[ne];
            suma += sum;
            b = cn - sum;
            cn = b;
            if (sum != 0)
                System.out.println(nb[ne] + " * " + bn[ne] + " = " + sum);
            if (cn < nb[ne]) {
                if (ne < 3)
                    ne++;
                else
                    break;
            }
        }
        Remaining_boxes = n - suma;
        System.out.println("Remaining boxes : " + Remaining_boxes);
        int sum1 = 0;
        for (int i : bn) {
            sum1 += i;
        }
        if(Remaining_boxes!=0){
            System.out.println("Number of Cartoons : "+(sum1+1));
        }
        else{
            System.out.println("Number of Cartoons : "+sum1);
        }
    }

    public static void main(String[] args) {
        cartons_breakUP obj5 = new cartons_breakUP();
        obj5.input();
    }
}
