import java.util.Comparator;
class SortByColor implements Comparator{
    @Override
    public int compare(Object o1,Object o2){
        Mobile m1=(Mobile) o1;
        Mobile m2=(Mobile) o2;
        return m1.color.compareTo(m2.color);
    }
}
class SortByName implements Comparator{
    @Override
    public int compare(Object o1,Object o2){
        Mobile m1=(Mobile) o1;
        Mobile m2=(Mobile) o2;
        return m1.name.compareTo(m2.name);
    }
}
class SortByPriceLowToHigh implements Comparator{
    @Override
    public int compare(Object o1,Object o2){
        Mobile m1=(Mobile) o1;
        Mobile m2=(Mobile) o2;
        return (int)(m1.price-m2.price);
    }
}
class SortByPriceHighToLow implements Comparator{
    @Override
    public int compare(Object o1,Object o2){
        Mobile m1=(Mobile) o1;
        Mobile m2=(Mobile) o2;
        return (int)(m2.price-m1.price);
    }
}
class SortByRam implements Comparator{
    @Override
    public int compare(Object o1,Object o2){
        Mobile m1=(Mobile) o1;
        Mobile m2=(Mobile) o2;
        return m1.ram-m2.ram;
    }
}
class SortByRom implements Comparator{
    @Override
    public int compare(Object o1,Object o2){
        Mobile m1=(Mobile) o1;
        Mobile m2=(Mobile) o2;
        return m1.rom-m2.rom;
    }
}

