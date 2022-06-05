package fts.acmc;



import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class AccessControlModuleCoreApplicationTests {

	@Test
	void test() {
		String test = "true";
		Assert.hasText(test, "test");
	}

}
