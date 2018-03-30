package spitter.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spitter.pojo.Spitter;

import javax.validation.Valid;

/**
 * @author rain
 * created on 2018/3/30
 */
@Controller
@RequestMapping("spitter")
public class SpitterController {
    /**
     * 注册
     * @return
     */
    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String register() {
        return "registerForm";
    }

    /**
     * JSR303 bean validation
     *  以注解的形式设置校验规则
     * @Valid 开启合法性校验
     * @param spitter
     * @return
     */
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String processRegister(@Valid Spitter spitter, Errors errors) {
        // 校验出现问题，转向注册页面
        if (errors.hasErrors()) {
            return "registerForm";
        }
        System.out.println(spitter);
        return "redirect:/spitter/" + spitter.getUsername();
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String profile(@PathVariable("username") String username, Model model) {
        model.addAttribute(createSpitter(username));
        return "profile";
    }

    private Spitter createSpitter(String username) {
        Spitter spitter = new Spitter("rain", "scott", username, "tiger");
        return spitter;
    }
}