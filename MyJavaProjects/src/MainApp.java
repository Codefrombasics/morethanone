public class MainApp {
    public static void main(String[] args) {
        System.out.println("hello");
//        var natarajPencil=new Pencil("Natraj","13");
//        var natarajPen=new Pencil("Ballpoint","119");
//
//        printDetails(natarajPen);
//        printDetails(natarajPencil);

    }

    private static void printDetails(Stationary stationary) {
        if(stationary instanceof Pencil){
            System.out.println(((Pencil) stationary).price());
            System.out.println(((Pencil) stationary).name());
        }else if(stationary instanceof Pen){
            System.out.println(((Pen) stationary).name());
            System.out.println(((Pen) stationary).price());
        }
    }
}
