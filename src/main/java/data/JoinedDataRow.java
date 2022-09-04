package data;

public record JoinedDataRow <K, V1, V2>(K k, V1 v1, V2 v2) {
    @Override
    public String toString() {
        return "JoinedDataRow(" + k + ", " + v1 + ", " + v2 + ')';
    }
}
