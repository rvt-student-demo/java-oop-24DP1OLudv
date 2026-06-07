package rvt.Interface_in_a_box;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);

        box.add(new Book("Bob moni", "Cina pret ziemu", 2));
        box.add(new Book("Roberts sasd", "Tirs cels", 1));
        box.add(new Book("Kauns Baro", "Parbaudes cels", 0.7));

        box.add(new CD("Roza flojs", "Tumsa nakts", 1973));
        box.add(new CD("Wiwawi", "Naktsklubs", 1975));
        box.add(new CD("Dinozauru cels", "Tuvaak sejienei", 2012));

        System.out.println(box);
    }
}
