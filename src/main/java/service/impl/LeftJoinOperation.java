package service.impl;


import data.DataRow;
import data.JoinedDataRow;
import service.JoinOperation;

import java.util.*;

public class LeftJoinOperation<K, V1, V2> implements JoinOperation<DataRow<K, V1>, DataRow<K, V2>, JoinedDataRow<K, V1, V2>> {
    @Override
    public Collection<JoinedDataRow<K, V1, V2>> join(Collection<DataRow<K, V1>> leftCollection,
                                                     Collection<DataRow<K, V2>> rightCollection) {
        Collection<JoinedDataRow<K, V1, V2>> resultCollection = new ArrayList<>();
        Map<K, V2> tempMap = new HashMap<>();
        rightCollection.forEach(item -> tempMap.put(item.k(), item.v()));
        leftCollection.forEach(item -> resultCollection.add(
                new JoinedDataRow<>(item.k(), item.v(), tempMap.get(item.k()))));
        return resultCollection;
    }
}
