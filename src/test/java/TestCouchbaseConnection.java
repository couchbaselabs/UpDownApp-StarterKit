import com.couchbase.client.java.Bucket;
import com.couchbase.updownapp.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class TestCouchbaseConnection {
    @Test
    public void testGetsConnection() {
        assertThat(CouchbaseConnectionFactory.getDefaultConnection(), instanceOf(Bucket.class));
    }
}
