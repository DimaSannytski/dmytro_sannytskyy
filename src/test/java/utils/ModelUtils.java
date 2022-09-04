package utils;

import data.DataRow;
import data.JoinedDataRow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ModelUtils {

    public static final Collection<DataRow<Integer, String>> leftCollection = getLeftCollection();
    public static final Collection<DataRow<Integer, String>> rightCollection = getRightCollection();
    public static final Collection<JoinedDataRow<Integer, String, String>> afterLeftJoin = getAfterLeftJoin();
    public static final Collection<JoinedDataRow<Integer, String, String>> afterRightJoin = getAfterRightJoin();
    public static final Collection<JoinedDataRow<Integer, String, String>> afterInnerJoin = getAfterInnerJoin();

    private static Collection<JoinedDataRow<Integer, String, String>> getAfterRightJoin() {
        List<JoinedDataRow<Integer, String, String>> joinedDataRows = new ArrayList<>();
        joinedDataRows.add(new JoinedDataRow<>(0, "Ukraine", "Kyiv"));
        joinedDataRows.add(new JoinedDataRow<>(1, "Germany", "Berlin"));
        joinedDataRows.add(new JoinedDataRow<>(3, null, "Budapest"));
        return joinedDataRows;
    }

    private static Collection<JoinedDataRow<Integer, String, String>> getAfterInnerJoin() {
        List<JoinedDataRow<Integer, String, String>> joinedDataRows = new ArrayList<>();
        joinedDataRows.add(new JoinedDataRow<>(0, "Ukraine", "Kyiv"));
        joinedDataRows.add(new JoinedDataRow<>(1, "Germany", "Berlin"));
        return joinedDataRows;
    }

    private static Collection<JoinedDataRow<Integer, String, String>> getAfterLeftJoin() {
        List<JoinedDataRow<Integer, String, String>> joinedDataRows = new ArrayList<>();
        joinedDataRows.add(new JoinedDataRow<>(0, "Ukraine", "Kyiv"));
        joinedDataRows.add(new JoinedDataRow<>(1, "Germany", "Berlin"));
        joinedDataRows.add(new JoinedDataRow<>(2, "France", null));
        return joinedDataRows;
    }

    private static Collection<DataRow<Integer, String>> getLeftCollection() {
        List<DataRow<Integer, String>> leftCollection = new ArrayList<>();
        leftCollection.add(new DataRow<>(0, "Ukraine"));
        leftCollection.add(new DataRow<>(1, "Germany"));
        leftCollection.add(new DataRow<>(2, "France"));
        return leftCollection;
    }

    private static Collection<DataRow<Integer, String>> getRightCollection() {
        List<DataRow<Integer, String>> leftCollection = new ArrayList<>();
        leftCollection.add(new DataRow<>(0, "Kyiv"));
        leftCollection.add(new DataRow<>(1, "Berlin"));
        leftCollection.add(new DataRow<>(3, "Budapest"));
        return leftCollection;
    }
}
