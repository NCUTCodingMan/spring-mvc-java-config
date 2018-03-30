import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import spitter.web.HomeController;

/**
 * @author rain
 * created on 2018/3/30
 */
public class HomeControllerTest {

    /**
     * 采用mock进行测试，这块可以再了解一下
     * @throws Exception 异常
     */
    @Test
    public void testHomePage() throws Exception {
        HomeController homeController = new HomeController();
        MockMvc mockMvc = standaloneSetup(homeController).build();
        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }
}