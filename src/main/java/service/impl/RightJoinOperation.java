package service.impl;

import data.DataRow;
import data.JoinedDataRow;
import service.JoinOperation;

import java.util.*;

public class RightJoinOperation<K, V1, V2> implements JoinOperation<DataRow<K, V1>, DataRow<K, V2>, JoinedDataRow<K, V1, V2>> {
    @Override
    public Collection<JoinedDataRow<K, V1, V2>> join(Collection<DataRow<K, V1>> leftCollection,
                                                     Collection<DataRow<K, V2>> rightCollection) {
        Collection<JoinedDataRow<K, V1, V2>> resultCollection = new ArrayList<>();
        Map<K, V1> tempMap = new HashMap<>();
        leftCollection.forEach(item -> tempMap.put(item.k(), item.v()));
        rightCollection.forEach(item -> resultCollection.add(
                new JoinedDataRow<>(item.k(), tempMap.get(item.k()), item.v())));
        return resultCollection;
    }
}
