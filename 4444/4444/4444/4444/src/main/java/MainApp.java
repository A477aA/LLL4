
public class MainApp {
    public static void main(String[] args) {
        Box<Bananus> box = new Box<>(new Bananus(), new Bananus(), new Bananus());
        Box<Orangus> OrangusBox = new Box<>(new Orangus(), new Orangus());
        Box<Applus> ApplusBox = new Box<>(new Applus(), new Applus());

        //box.moveAt(box); //бананусы в бананусы

        //System.out.println("Начальное значение коробки: ");
        //box.info();

        //box.moveAt(OrangusBox); //бананусы в апельсинусы

        //System.out.println("Переложили бананусы в коробку с апельсинусы: ");



        //System.out.println("Значение коробки с бананами после того, как переложили в коробку с апельсинами: ");


        box.moveAt(OrangusBox); //бананусы в яблокусы

        //OrangusBox.moveAt(box); //нельзя добавлять апельсины в бананы
        //ApplusBox.moveAt(box); //нельзя добавлять яблоки в бананы

        //ApplusBox.moveAt(ApplusBox);
        //OrangusBox.moveAt(OrangusBox);


        box.add(new Bananus());
        box.info();
        //OrangusBox.info();
        //ApplusBox.info();
    }
}