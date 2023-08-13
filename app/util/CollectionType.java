package app.util;



public abstract class CollectionType {

    String name;
    boolean keyValue;
    boolean order;
    boolean unique;
    boolean fifoLifo;

    boolean indexing;

    public String getName() {
        return name;
    }

    protected CollectionType(String name, boolean keyValue, boolean order, boolean unique, boolean fifoLifo, boolean indexing) {
        this.name = name;
        this.keyValue = keyValue;
        this.order = order;
        this.unique = unique;
        this.fifoLifo = fifoLifo;
        this.indexing = indexing;
    }



}
