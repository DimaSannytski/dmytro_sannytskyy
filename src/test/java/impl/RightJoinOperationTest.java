package impl;

import data.DataRow;
import data.JoinedDataRow;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import service.JoinOperation;
import service.impl.RightJoinOperation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.ModelUtils.*;

public class RightJoinOperationTest {

    JoinOperation<DataRow<Integer, String>, DataRow<Integer, String>, JoinedDataRow<Integer, String, String>> joinOperation;

    @BeforeEach
    void setUp() {
        joinOperation = new RightJoinOperation<>();
    }

    @Test
    public void join() {
        assertEquals(afterRightJoin, joinOperation.join(leftCollection, rightCollection));
    }
}