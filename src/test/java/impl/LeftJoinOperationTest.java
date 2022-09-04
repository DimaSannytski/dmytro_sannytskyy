package impl;

import data.DataRow;
import data.JoinedDataRow;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.JoinOperation;
import service.impl.LeftJoinOperation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.ModelUtils.*;

public class LeftJoinOperationTest {

    JoinOperation<DataRow<Integer, String>, DataRow<Integer, String>, JoinedDataRow<Integer, String, String>> joinOperation;

    @BeforeEach
    void setUp() {
        joinOperation = new LeftJoinOperation<>();
    }

    @Test
    public void join() {
        assertEquals(afterLeftJoin, joinOperation.join(leftCollection, rightCollection));
    }
}