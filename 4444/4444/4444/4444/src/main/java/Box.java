import java.util.*;

class Box <T extends Fruit> implements Moveable <T> {
    private final List<T> list;

    @SafeVarargs
    public Box(T...x) {
        this.list = new ArrayList(Arrays.asList(x));
    }

    @Override
    public List<T> getList() {
        return list;
    }

    void add(T obj) {
        this.list.add(obj);
    }

    <F extends T> void moveAt(Box<F> box) {
        if (box != this) {
            box.getList().addAll((Collection<? extends F>) list);
            list.clear();
        }
    }

    <F extends Fruit & Capable> void moveAt(Moveable<F> box) {
        if (box != this) {
            box.getList().addAll((Collection<? extends F>) list);
            list.clear();
        }
    }

    void info(){
        if (list.isEmpty()) {
            System.out.println("Коробка пустая");
        } else {
            System.out.println("Коробка");
            list.forEach(System.out::println);
        }
    }

    float getWeight(){
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.size() * list.get(0).getWeight();
        }
    }

    boolean compare(Box<? extends Fruit> box){
        return Math.abs(this.getWeight() - box.getWeight()) < 0.001;
    }
}
