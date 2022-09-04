package data;

public record DataRow<K, V>(K k, V v) {
    @Override
    public String toString() {
        return "DataRow(" + k + ", " + v + ')';
    }
}
