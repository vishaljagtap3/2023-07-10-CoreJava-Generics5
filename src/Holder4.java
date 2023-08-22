public class Holder4<T extends Number, Comparable> {
    private T data;

    public Holder4(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Holder{" +
                "data=" + data +
                '}';
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
