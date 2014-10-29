import com.couchbase.client.java.AsyncBucket;
import com.couchbase.updownapp.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class TestCouchbaseConnection {
    @Test
    public void testGetsConnection() {
        assertThat(CouchbaseConnectionFactory.getDefaultConnection(), instanceOf(AsyncBucket.class));
    }
}
