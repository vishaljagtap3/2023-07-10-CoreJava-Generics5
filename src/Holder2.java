public class Holder2<T extends Number> {
    private T data;

    public Holder2(T data) {
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
