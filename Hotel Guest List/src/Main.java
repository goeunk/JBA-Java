import java.util.Scanner;

//Solution1
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] guestArr = new String[8];
        for (int i = 0; i < guestArr.length; i++)
        {
            guestArr[i] = sc.next();
        }

        for (int i = guestArr.length - 1; i >= 0; i--)
        {
            System.out.println(guestArr[i]);
        }
    }
}


/*
//Solution2
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> guests = new ArrayList<>();
        while (scan.hasNext()) {
            guests.add(scan.next());
        }

        Collections.reverse(guests);

        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
*/
